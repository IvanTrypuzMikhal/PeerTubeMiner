package aiss.peertubeminer.services;


import aiss.peertubeminer.model.peerTubeObjects.CommentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CommentService {
    @Autowired
    RestTemplate restTemplate;

    public CommentList getComments(String videoId){
        String uri = "https://peertube.cpy.re/api/v1/videos/" + videoId + "/comment-threads";
        return restTemplate.getForObject(uri, CommentList.class);
    }

}
