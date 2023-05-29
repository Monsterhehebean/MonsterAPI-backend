package com.monster.monsterapiclientsdk;

import com.monster.monsterapiclientsdk.client.MonsterAPIClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 */
@Configuration
@ConfigurationProperties("monsterapi-client")
@Data
@ComponentScan
public class MonsterApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public MonsterAPIClient monsterAPIClient() {
        return new MonsterAPIClient(accessKey, secretKey);
    }

}
