package br.com.infnet.pokecards.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "data"
})

public class DataCard {

    @JsonProperty("data")
    private Card data;

    @JsonProperty("data")
    public Card getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Card data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(data.getId()).append(" ").append(data.getName()).toString();
    }
    
    
}
