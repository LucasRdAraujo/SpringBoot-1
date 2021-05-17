package br.com.infnet.pokecards.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "unlimited",
    "standard",
    "expanded"
})

public class Legalities__1 {

    @JsonProperty("unlimited")
    private String unlimited;
    @JsonProperty("standard")
    private String standard;
    @JsonProperty("expanded")
    private String expanded;

    @JsonProperty("unlimited")
    public String getUnlimited() {
        return unlimited;
    }

    @JsonProperty("unlimited")
    public void setUnlimited(String unlimited) {
        this.unlimited = unlimited;
    }

    @JsonProperty("standard")
    public String getStandard() {
        return standard;
    }

    @JsonProperty("standard")
    public void setStandard(String standard) {
        this.standard = standard;
    }

    @JsonProperty("expanded")
    public String getExpanded() {
        return expanded;
    }

    @JsonProperty("expanded")
    public void setExpanded(String expanded) {
        this.expanded = expanded;
    }

}
