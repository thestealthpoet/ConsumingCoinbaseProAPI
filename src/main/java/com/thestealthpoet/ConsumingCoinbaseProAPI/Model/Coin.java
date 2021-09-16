package com.thestealthpoet.ConsumingCoinbaseProAPI.Model;

import java.math.BigDecimal;

public class Coin {

    private String coinName;
    private String coinSymbol;
    private BigDecimal valueInUSD;

    public Coin(String coinName, String coinSymbol, BigDecimal valueInUSD) {
        this.coinName = coinName;
        this.coinSymbol = coinSymbol;
        this.valueInUSD = valueInUSD;
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    public String getCoinSymbol() {
        return coinSymbol;
    }

    public void setCoinSymbol(String coinSymbol) {
        this.coinSymbol = coinSymbol;
    }

    public BigDecimal getValueInUSD() {
        return valueInUSD;
    }

    public void setValueInUSD(BigDecimal valueInUSD) {
        this.valueInUSD = valueInUSD;
    }
}
