package aiss.peertubeminer.controllers;


import aiss.peertubeminer.models.peerTubeObjects.PTChannel;
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
        description = "Operaciones para obtener canales de PeerTube y transformarlos al formato VideoMiner"
)

@RestController
@RequestMapping("/peertube")
public class ChannelController {


    @Autowired
    public ChannelService channelService;

    @Operation(
            summary = "Obtener un canal de PeerTube",
            description = "Obtiene un canal de PeerTube por su nombre y el host (ex. @peertube2.cpy.re), opcionalmente incluyendo un número limitado de vídeos y comentarios por vídeo. De manera predeterminada los limites son 10 videos y 10 comentarios",
            tags = { "PeerTube Channels" }
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "Canal obtenido correctamente",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = VMChannel.class)
                            )
                    }
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Parámetros de entrada inválidos",
                    content = @Content
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Canal no encontrado en PeerTube",
                    content = @Content
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Error interno del servidor",
                    content = @Content
            )
    })
    @GetMapping("/{channelName}")
    public VMChannel getChannel(
            @Parameter(
                    description = "Nombre del canal de PeerTube que se desea obtener",
                    example = "poney@peertube2.cpy.re"
            )
            @PathVariable String channelName,

            @Parameter(
                    description = "Número máximo de vídeos que se incluirán en el canal",
                    example = "10"
            )
            @RequestParam(defaultValue = "10") int maxVideos,

            @Parameter(
                    description = "Número máximo de comentarios que se incluirán por cada vídeo",
                    example = "10"
            )
            @RequestParam(defaultValue = "10") int maxComments) {
        return channelService.buildChannel(channelName, maxVideos, maxComments);
    }

    @Operation(
            summary = "Obtener y enviar un canal a VideoMiner",
            description = "Obtiene un canal de PeerTube, lo transforma al formato VideoMiner y lo envía mediante una petición POST al servicio VideoMiner.",
            tags = { "PeerTube Channels" }
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "Canal obtenido y enviado correctamente a VideoMiner",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = VMChannel.class)
                            )
                    }
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Parámetros de entrada inválidos",
                    content = @Content
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Canal no encontrado en PeerTube",
                    content = @Content
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Error interno al obtener o enviar el canal",
                    content = @Content
            )
    })


    @PostMapping("/{channelName}")
    public VMChannel postChannel(
            @Parameter(
                    description = "Nombre del canal de PeerTube que se desea obtener y enviar a VideoMiner",
                    example = "poney@peertube2.cpy.re"
            )
            @PathVariable String channelName,

            @Parameter(
                    description = "Número máximo de vídeos que se incluirán en el canal",
                    example = "10"
            )
            @RequestParam(defaultValue = "10") int maxVideos,

            @Parameter(
                    description = "Número máximo de comentarios que se incluirán por cada vídeo",
                    example = "10"
            )
            @RequestParam(defaultValue = "10") int maxComments) {
        return channelService.buildAndPostChannel(channelName, maxVideos, maxComments);
    }
}
