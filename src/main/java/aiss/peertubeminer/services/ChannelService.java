package aiss.peertubeminer.services;


import aiss.peertubeminer.models.peerTubeObjects.PTChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ChannelService {

    @Autowired
    RestTemplate restTemplate;

    public PTChannel getChannel(String channelName){
        String uri = "https://peertube.cpy.re/api/v1/video-channels/"+channelName;
        return restTemplate.getForObject(uri, PTChannel.class);

    }


}
