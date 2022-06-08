package com.etisalat.customer;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import java.io.IOException;

import static java.nio.charset.Charset.defaultCharset;
import static org.springframework.util.StreamUtils.copyToString;

public class NetworkMocks {
    public static void setupMockNetworkResponse(WireMockServer mockService) throws IOException {
        mockService.stubFor(WireMock.get(WireMock.urlEqualTo("/GetNetworkAvailability"))
                .willReturn(WireMock.aResponse()
                        .withStatus(HttpStatus.OK.value())
                        .withHeader("Content-Type", MediaType.APPLICATION_XML_VALUE)
                        .withBody(
                                copyToString(
                                        NetworkMocks.class.getClassLoader().getResourceAsStream("payload/networkresponse.xml"),
                                        defaultCharset()))));
    }
}
