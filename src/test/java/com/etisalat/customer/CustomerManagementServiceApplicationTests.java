package com.etisalat.customer;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.IOException;

@SpringBootTest
@ActiveProfiles("test")
@EnableConfigurationProperties
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { TestClientConfig.class })
class CustomerManagementServiceApplicationTests {

	@Autowired
	@Lazy
	private WireMockServer wireMockServer;


	@BeforeEach
	void setUp() throws IOException {
		NetworkMocks.setupMockNetworkResponse(wireMockServer);
	}

	@BeforeEach
	void setUpAccount() throws IOException {
		AccountMocks.setupMockAccountResponse(wireMockServer);
	}

	@Test
	void contextLoads() {
	}
}
