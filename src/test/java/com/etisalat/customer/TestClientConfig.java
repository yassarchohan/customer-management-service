package com.etisalat.customer;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

@Lazy
@TestConfiguration
public class TestClientConfig {

    @Autowired
    @Lazy
    private WireMockServer wireMockServer;

    @Bean(initMethod = "start", destroyMethod = "stop")
    public WireMockServer mockNetworkService() {
        return new WireMockServer(9561);
    }
}
