package aiss.peertubeminer.controllers;


import aiss.peertubeminer.models.peerTubeObjects.PTChannel;
import aiss.peertubeminer.models.videoMinerObjects.VMChannel;
import aiss.peertubeminer.services.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/peertube/channel")
public class ChannelController {


    @Autowired
    public ChannelService channelService;

    @PutMapping("/{channelName}")
    public VMChannel getChannel(String channelName){
        // TODO: Implementar buildChannel
        return channelService.buildChannel(channelName);
    }

}
