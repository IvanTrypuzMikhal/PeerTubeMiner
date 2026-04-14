package aiss.peertubeminer.services;

import aiss.peertubeminer.models.peerTubeObjects.PTCaption;
import aiss.peertubeminer.models.peerTubeObjects.PTCaptionList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CaptionService {

    @Autowired
    RestTemplate restTemplate;

    public List<PTCaption> getCaptions(String videoId){
        String uri = "https://peertube.cpy.re/api/v1/videos/"+videoId+"/captions";
        PTCaptionList captionList = restTemplate.getForObject(uri, PTCaptionList.class);
        return captionList.getData();
    }

}
