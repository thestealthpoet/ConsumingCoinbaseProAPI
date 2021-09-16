package com.thestealthpoet.ConsumingCoinbaseProAPI.Model;

import java.math.BigDecimal;

public class coinValue {

    private BigDecimal coinInUSD;

    public coinValue(BigDecimal coinInUSD) {
        this.coinInUSD = coinInUSD;
    }

    public coinValue() {

    }

    public BigDecimal getCoinInUSD() {
        return coinInUSD;
    }

    public void setCoinInUSD(BigDecimal coinInUSD) {
        this.coinInUSD = coinInUSD;
    }
}
