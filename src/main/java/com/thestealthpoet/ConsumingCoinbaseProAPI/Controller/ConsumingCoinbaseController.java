package com.thestealthpoet.ConsumingCoinbaseProAPI.Controller;

import com.thestealthpoet.ConsumingCoinbaseProAPI.Model.Coin;
import com.thestealthpoet.ConsumingCoinbaseProAPI.Model.coinValue;
import com.thestealthpoet.ConsumingCoinbaseProAPI.Services.CoinbaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumingCoinbaseController {

@Autowired
    CoinbaseService coinbaseService = new CoinbaseService();

@RequestMapping(path="/test", method=RequestMethod.GET)
    public coinValue test(@RequestParam String coinSymbol) {
    return coinbaseService.getCoinValue(coinSymbol);
}
}
