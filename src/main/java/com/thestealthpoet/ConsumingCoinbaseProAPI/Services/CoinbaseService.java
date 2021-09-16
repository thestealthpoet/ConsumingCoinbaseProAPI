package com.thestealthpoet.ConsumingCoinbaseProAPI.Services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thestealthpoet.ConsumingCoinbaseProAPI.Model.Coin;
import com.thestealthpoet.ConsumingCoinbaseProAPI.Model.coinValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
@Component
public class CoinbaseService {

    @Value("${coinbasepro.api.url}")
    private String apiURL;


    public coinValue getCoinValue(String coinSymbol) {
        String url = apiURL + "/products/" + coinSymbol + "-USD/book";

        HttpEntity<String> httpEntity = new HttpEntity<>("");
        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper objectMapper = new ObjectMapper();

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, String.class);
        JsonNode jsonNode;


        coinValue coinValue = null;
        try {
            jsonNode = objectMapper.readTree(response.getBody());


            JsonNode root = jsonNode.path("bids");

            String coinUSD = root.path(0).path(0).asText();
                coinValue = new coinValue(new BigDecimal(coinUSD));

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


        return coinValue;
    }


}
