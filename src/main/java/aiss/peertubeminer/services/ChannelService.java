package aiss.peertubeminer.services;


import aiss.peertubeminer.etl.Transformer;
import aiss.peertubeminer.models.peerTubeObjects.*;
import aiss.peertubeminer.models.videoMinerObjects.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChannelService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    CaptionService captionService;

    @Autowired
    CommentService commentService;

    @Autowired
    VideoService videoService;


    public VMChannel buildChannel(String channelName, int maxVideos, int maxComments){
        PTChannel ptChannel = getPTChannel(channelName);
        VMChannel vmChannel = Transformer.channelTransformer(ptChannel);

        PTVideoList videos = videoService.getVideos(channelName);
        List<PTVideo> videoList = videos.getData().stream().limit(maxVideos).toList();

        for(PTVideo ptVideo : videoList){
            VMVideo vmVideo = Transformer.videoTransformer(ptVideo);
            List<PTCaption> captionList = captionService.getCaptions(ptVideo.getId().toString());
            List<PTComment> commentList = commentService.getComments(ptVideo.getId().toString()).stream().limit(maxComments).toList();

            for(PTCaption ptCaption:captionList){
                VMCaption vmCaption = Transformer.captionTransformer(ptCaption);
                vmVideo.getCaptions().add(vmCaption);
            }
            for(PTComment ptComment:commentList){
                VMComment vmComment = Transformer.commentTransformer(ptComment);
                vmVideo.getComments().add(vmComment);
            }
            vmChannel.getVideos().add(vmVideo);
        }

        return vmChannel;
    }

    public VMChannel getChannel(String channelName, int maxVideos, int maxComments){
        return buildChannel(channelName, maxVideos, maxComments);
    }


    public VMChannel buildAndPostChannel(String channelName, int maxVideos, int maxComments) {
        VMChannel vmChannel = buildChannel(channelName, maxVideos, maxComments);
        restTemplate.postForObject("http://localhost:8080/channels", vmChannel, VMChannel.class);
        return vmChannel;
    }

    public PTChannel getPTChannel(String channelName){
        String uri = "https://peertube.cpy.re/api/v1/video-channels/"+channelName;
        return restTemplate.getForObject(uri, PTChannel.class);

    }

}
