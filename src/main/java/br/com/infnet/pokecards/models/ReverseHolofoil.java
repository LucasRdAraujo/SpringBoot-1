package br.com.infnet.pokecards.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "low",
    "mid",
    "high",
    "market",
    "directLow"
})

public class ReverseHolofoil {

    @JsonProperty("low")
    private Double low;
    @JsonProperty("mid")
    private Double mid;
    @JsonProperty("high")
    private Double high;
    @JsonProperty("market")
    private Double market;
    @JsonProperty("directLow")
    private Object directLow;

    @JsonProperty("low")
    public Double getLow() {
        return low;
    }

    @JsonProperty("low")
    public void setLow(Double low) {
        this.low = low;
    }

    @JsonProperty("mid")
    public Double getMid() {
        return mid;
    }

    @JsonProperty("mid")
    public void setMid(Double mid) {
        this.mid = mid;
    }

    @JsonProperty("high")
    public Double getHigh() {
        return high;
    }

    @JsonProperty("high")
    public void setHigh(Double high) {
        this.high = high;
    }

    @JsonProperty("market")
    public Double getMarket() {
        return market;
    }

    @JsonProperty("market")
    public void setMarket(Double market) {
        this.market = market;
    }

    @JsonProperty("directLow")
    public Object getDirectLow() {
        return directLow;
    }

    @JsonProperty("directLow")
    public void setDirectLow(Object directLow) {
        this.directLow = directLow;
    }

}
