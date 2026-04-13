package aiss.peertubeminer.services;

import aiss.peertubeminer.model.peerTubeObjects.PeerTubeCaption;
import aiss.peertubeminer.model.peerTubeObjects.PeerTubeCaptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class CaptionService {

    @Autowired
    RestTemplate restTemplate;

    public PeerTubeCaptions getCaptions(String videoId){
        String uri = "https://peertube.cpy.re/api/v1/videos/"+videoId+"/captions";
        return restTemplate.getForObject(uri, PeerTubeCaptions.class);
    }

}
