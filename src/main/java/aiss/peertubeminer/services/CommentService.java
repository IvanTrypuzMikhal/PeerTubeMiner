package aiss.peertubeminer.services;


import aiss.peertubeminer.models.peerTubeObjects.PTComment;
import aiss.peertubeminer.models.peerTubeObjects.PTCommentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    RestTemplate restTemplate;

    public List<PTComment> getComments(String videoId){
        String uri = "https://peertube.cpy.re/api/v1/videos/" + videoId + "/comment-threads";
        PTCommentList comments = restTemplate.getForObject(uri, PTCommentList.class);
        return comments.getData();
    }

}
