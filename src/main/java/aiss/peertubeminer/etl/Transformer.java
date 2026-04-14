package aiss.peertubeminer.etl;

import aiss.peertubeminer.models.peerTubeObjects.*;
import aiss.peertubeminer.models.videoMinerObjects.*;

import java.util.ArrayList;
import java.util.UUID;

public class Transformer {

    public VMCaption captionTransformer (PTCaption ptCaption){
        return new VMCaption(
                UUID.randomUUID().toString(),
                ptCaption.getCaptionPath(),
                ptCaption.getLanguage().getId()
        );
    }

    public VMChannel channelTransformer (PTChannel ptChannel){
        return new VMChannel(
                ptChannel.getId().toString(),
                ptChannel.getName(),
                ptChannel.getDescription(),
                ptChannel.getCreatedAt(),
                new ArrayList<>()
        );
    }

    public VMComment commentTransformer (PTComment ptComment){
        return new VMComment(
                ptComment.getId().toString(),
                ptComment.getText(),
                ptComment.getCreatedAt()
        );
    }

    public VMVideo videoTransformer (PTVideo ptVideo){
        return new VMVideo(
                ptVideo.getId().toString(),
                ptVideo.getName(),
                ptVideo.getDescription(),
                ptVideo.getPublishedAt(),
                accountTransformer(ptVideo.getAccount()),
                new ArrayList<>(),
                new ArrayList<>()
        );
    }

    public VMUser accountTransformer (PTAccount ptAccount){
        return new VMUser(
                ptAccount.getId().longValue(),
                ptAccount.getName(),
                ptAccount.getUrl(),
                ptAccount.getAvatars().getFirst().getFileUrl()
        );
    }
}
