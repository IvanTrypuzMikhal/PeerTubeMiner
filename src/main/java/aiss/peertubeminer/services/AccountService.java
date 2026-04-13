package aiss.peertubeminer.services;

import aiss.peertubeminer.model.peerTubeObjects.PeerTubeAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AccountService {

    @Autowired
    RestTemplate restTemplate;

    public PeerTubeAccount getAccount(String username) {
        String uri = "https://peertube.cpy.re/api/v1/video-channels/"+username;
        return restTemplate.getForObject(uri, PeerTubeAccount.class);
    }

}
