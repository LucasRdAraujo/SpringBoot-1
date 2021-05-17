package br.com.infnet.pokecards.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "data",
    "page",
    "pageSize",
    "count",
    "totalCount"
})

public class DataCards {
    @JsonProperty("data")
    private List<Card> data = null;
    @JsonProperty("page")
    private Integer page;
    @JsonProperty("pageSize")
    private Integer pageSize;
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("totalCount")
    private Integer totalCount;

    @JsonProperty("data")
    public List<Card> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Card> data) {
        this.data = data;
    }

    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    @JsonProperty("pageSize")
    public Integer getPageSize() {
        return pageSize;
    }

    @JsonProperty("pageSize")
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("totalCount")
    public Integer getTotalCount() {
        return totalCount;
    }

    @JsonProperty("totalCount")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        data.forEach(d -> {
            sb.append(d.getId()).append(" ").append(d.getName()).append("\n");
        });
        return sb.toString();
    }
}
