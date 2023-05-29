package com.monster.monsterapiinterface;

import com.monster.monsterapiclientsdk.client.MonsterAPIClient;
import com.monster.monsterapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MonsterApiInterfaceApplicationTests {

    @Resource
    private MonsterAPIClient monsterAPIClient;

    @Test
    void contextLoads() {
        String monster = monsterAPIClient.getNameByGet("monster");
        User user = new User();
        user.setUsername("hehedou");
        String usernameByPost = monsterAPIClient.getUsernameByPost(user);
        System.out.println(monster);
        System.out.println(usernameByPost);
    }

}
