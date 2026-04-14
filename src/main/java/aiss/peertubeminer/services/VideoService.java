package aiss.peertubeminer.services;


import aiss.peertubeminer.model.peerTubeObjects.PeerTubeVideoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class VideoService {

    @Autowired
    RestTemplate restTemplate;

    public PeerTubeVideoList getVideos(String channelName){
        String uri = "https://peertube.cpy.re/api/v1/video-channels/"+channelName+"/videos";
        return restTemplate.getForObject(uri, PeerTubeVideoList.class);
    }

}
