package br.com.infnet.pokecards.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "series",
    "printedTotal",
    "total",
    "legalities",
    "ptcgoCode",
    "releaseDate",
    "updatedAt",
    "images"
})

public class Set {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("series")
    private String series;
    @JsonProperty("printedTotal")
    private Integer printedTotal;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("legalities")
    private Legalities legalities;
    @JsonProperty("ptcgoCode")
    private String ptcgoCode;
    @JsonProperty("releaseDate")
    private String releaseDate;
    @JsonProperty("updatedAt")
    private String updatedAt;
    @JsonProperty("images")
    private ImagesSymbol images;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("series")
    public String getSeries() {
        return series;
    }

    @JsonProperty("series")
    public void setSeries(String series) {
        this.series = series;
    }

    @JsonProperty("printedTotal")
    public Integer getPrintedTotal() {
        return printedTotal;
    }

    @JsonProperty("printedTotal")
    public void setPrintedTotal(Integer printedTotal) {
        this.printedTotal = printedTotal;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("legalities")
    public Legalities getLegalities() {
        return legalities;
    }

    @JsonProperty("legalities")
    public void setLegalities(Legalities legalities) {
        this.legalities = legalities;
    }

    @JsonProperty("ptcgoCode")
    public String getPtcgoCode() {
        return ptcgoCode;
    }

    @JsonProperty("ptcgoCode")
    public void setPtcgoCode(String ptcgoCode) {
        this.ptcgoCode = ptcgoCode;
    }

    @JsonProperty("releaseDate")
    public String getReleaseDate() {
        return releaseDate;
    }

    @JsonProperty("releaseDate")
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @JsonProperty("updatedAt")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updatedAt")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("images")
    public ImagesSymbol getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(ImagesSymbol images) {
        this.images = images;
    }

}
