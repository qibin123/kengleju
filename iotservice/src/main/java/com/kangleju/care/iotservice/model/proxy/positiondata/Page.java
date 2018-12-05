
package com.kangleju.care.iotservice.model.proxy.positiondata;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "page_count",
    "rows_per_page",
    "total",
    "page_current"
})
public class Page {

    @JsonProperty("page_count")
    private Integer pageCount;
    @JsonProperty("rows_per_page")
    private Integer rowsPerPage;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("page_current")
    private Integer pageCurrent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("page_count")
    public Integer getPageCount() {
        return pageCount;
    }

    @JsonProperty("page_count")
    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    @JsonProperty("rows_per_page")
    public Integer getRowsPerPage() {
        return rowsPerPage;
    }

    @JsonProperty("rows_per_page")
    public void setRowsPerPage(Integer rowsPerPage) {
        this.rowsPerPage = rowsPerPage;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("page_current")
    public Integer getPageCurrent() {
        return pageCurrent;
    }

    @JsonProperty("page_current")
    public void setPageCurrent(Integer pageCurrent) {
        this.pageCurrent = pageCurrent;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
