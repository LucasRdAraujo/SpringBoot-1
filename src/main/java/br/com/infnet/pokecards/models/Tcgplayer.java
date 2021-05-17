package br.com.infnet.pokecards.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "url",
    "updatedAt",
    "prices"
})

public class Tcgplayer {

    @JsonProperty("url")
    private String url;
    @JsonProperty("updatedAt")
    private String updatedAt;
    @JsonProperty("prices")
    private Prices prices;

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("updatedAt")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updatedAt")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("prices")
    public Prices getPrices() {
        return prices;
    }

    @JsonProperty("prices")
    public void setPrices(Prices prices) {
        this.prices = prices;
    }

}
