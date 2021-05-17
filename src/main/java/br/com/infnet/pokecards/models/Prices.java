package br.com.infnet.pokecards.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "holofoil",
    "reverseHolofoil"
})

public class Prices {

    @JsonProperty("holofoil")
    private Holofoil holofoil;
    @JsonProperty("reverseHolofoil")
    private ReverseHolofoil reverseHolofoil;

    @JsonProperty("holofoil")
    public Holofoil getHolofoil() {
        return holofoil;
    }

    @JsonProperty("holofoil")
    public void setHolofoil(Holofoil holofoil) {
        this.holofoil = holofoil;
    }

    @JsonProperty("reverseHolofoil")
    public ReverseHolofoil getReverseHolofoil() {
        return reverseHolofoil;
    }

    @JsonProperty("reverseHolofoil")
    public void setReverseHolofoil(ReverseHolofoil reverseHolofoil) {
        this.reverseHolofoil = reverseHolofoil;
    }

}
