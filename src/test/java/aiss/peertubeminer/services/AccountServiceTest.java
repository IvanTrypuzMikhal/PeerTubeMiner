package aiss.peertubeminer.services;

import aiss.peertubeminer.model.peerTubeObjects.PeerTubeAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AccountServiceTest {
    @Autowired
    AccountService accountService;

    @Test
    @DisplayName("Get account by name")

    void getAccount(){
        PeerTubeAccount account = accountService.getAccount("poney@peertube2.cpy.re");
        System.out.println(account);
    }

}