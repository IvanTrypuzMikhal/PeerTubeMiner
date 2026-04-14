package aiss.peertubeminer.services;

import aiss.peertubeminer.model.peerTubeObjects.PeerTubeAccount;
import aiss.peertubeminer.model.peerTubeObjects.PeerTubeCaptionList;
import aiss.peertubeminer.model.peerTubeObjects.PeerTubeChannel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AccountServiceTest {
    @Autowired
    ChannelService channelService;

    @Test
    @DisplayName("Get channel by name")

    void getAccount(){
        PeerTubeChannel channel = channelService.getChannel("poney@peertube2.cpy.re");
        System.out.println(channel);
    }

    @Autowired
    CaptionService captionService;


    @Test
    @DisplayName("Get captions")

    void getCaptions(){
        PeerTubeCaptionList captions = captionService.getCaptions("3609");
        System.out.println(captions);
    }


}