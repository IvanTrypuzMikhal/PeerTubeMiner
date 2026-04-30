package aiss.peertubeminer.controllers;

import aiss.peertubeminer.models.videoMinerObjects.VMChannel;
import aiss.peertubeminer.services.ChannelService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Tag(
        name = "PeerTube Channels",
        description = "Operations to retrieve PeerTube channels and transform them to the VideoMiner format"
)

@RestController
@RequestMapping("/peertube")
public class ChannelController {


    @Autowired
    public ChannelService channelService;

    @Operation(
            summary = "Get a PeerTube channel",
            description = "Gets a PeerTube channel by name and host (e.g., @peertube2.cpy.re), optionally including a limited number of videos and comments per video. By default, the limits are 10 videos and 10 comments.",
            tags = { "PeerTube Channels" }
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "Channel retrieved successfully",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = VMChannel.class)
                            )
                    }
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Invalid input parameters",
                    content = @Content
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Channel not found in PeerTube",
                    content = @Content
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Internal server error",
                    content = @Content
            )
    })
    @GetMapping("/{channelName}")
    public VMChannel getChannel(
            @Parameter(
                    description = "Name of the PeerTube channel to retrieve",
                    example = "poney@peertube2.cpy.re"
            )
            @PathVariable String channelName,

            @Parameter(
                    description = "Maximum number of videos to include in the channel",
                    example = "10"
            )
            @RequestParam(defaultValue = "10") int maxVideos,

            @Parameter(
                    description = "Maximum number of comments to include per video",
                    example = "10"
            )
            @RequestParam(defaultValue = "10") int maxComments) {
        return channelService.buildChannel(channelName, maxVideos, maxComments);
    }

    @Operation(
            summary = "Get and send a channel to VideoMiner",
            description = "Gets a PeerTube channel, transforms it to the VideoMiner format, and sends it via a POST request to the VideoMiner service.",
            tags = { "PeerTube Channels" }
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "Channel retrieved and sent to VideoMiner successfully",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = VMChannel.class)
                            )
                    }
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Invalid input parameters",
                    content = @Content
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Channel not found in PeerTube",
                    content = @Content
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Internal error while retrieving or sending the channel",
                    content = @Content
            )
    })


    @PostMapping("/{channelName}")
    public VMChannel postChannel(
            @Parameter(
                    description = "Name of the PeerTube channel to retrieve and send to VideoMiner",
                    example = "poney@peertube2.cpy.re"
            )
            @PathVariable String channelName,

            @Parameter(
                    description = "Maximum number of videos to include in the channel",
                    example = "10"
            )
            @RequestParam(defaultValue = "10") int maxVideos,

            @Parameter(
                    description = "Maximum number of comments to include per video",
                    example = "10"
            )
            @RequestParam(defaultValue = "10") int maxComments) {
        return channelService.buildAndPostChannel(channelName, maxVideos, maxComments);
    }
}
