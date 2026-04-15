package aiss.peertubeminer.controllers;


import aiss.peertubeminer.models.peerTubeObjects.PTChannel;
import aiss.peertubeminer.models.videoMinerObjects.VMChannel;
import aiss.peertubeminer.services.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/peertube/channel")
public class ChannelController {


    @Autowired
    public ChannelService channelService;

    @GetMapping("/{channelName}")
    public VMChannel getChannel(@PathVariable String channelName){
        return channelService.buildChannel(channelName);
    }

}
