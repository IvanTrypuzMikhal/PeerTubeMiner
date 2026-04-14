package aiss.peertubeminer.services;

import aiss.peertubeminer.models.peerTubeObjects.PTCaptionList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CaptionService {

    @Autowired
    RestTemplate restTemplate;

    public PTCaptionList getCaptions(String videoId){
        String uri = "https://peertube.cpy.re/api/v1/videos/"+videoId+"/captions";
        return restTemplate.getForObject(uri, PTCaptionList.class);
    }

}
