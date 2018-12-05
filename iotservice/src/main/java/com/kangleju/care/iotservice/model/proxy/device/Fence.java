
package com.kangleju.care.iotservice.model.proxy.device;

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
    "seqid",
    "freq",
    "enable",
    "name",
    "time_begin",
    "time_end",
    "safe_area"
})
public class Fence {

    @JsonProperty("seqid")
    private Integer seqid;
    @JsonProperty("freq")
    private Boolean freq;
    @JsonProperty("enable")
    private Boolean enable;
    @JsonProperty("name")
    private String name;
    @JsonProperty("time_begin")
    private Integer timeBegin;
    @JsonProperty("time_end")
    private Integer timeEnd;
    @JsonProperty("safe_area")
    private SafeArea safeArea;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("seqid")
    public Integer getSeqid() {
        return seqid;
    }

    @JsonProperty("seqid")
    public void setSeqid(Integer seqid) {
        this.seqid = seqid;
    }

    @JsonProperty("freq")
    public Boolean getFreq() {
        return freq;
    }

    @JsonProperty("freq")
    public void setFreq(Boolean freq) {
        this.freq = freq;
    }

    @JsonProperty("enable")
    public Boolean getEnable() {
        return enable;
    }

    @JsonProperty("enable")
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("time_begin")
    public Integer getTimeBegin() {
        return timeBegin;
    }

    @JsonProperty("time_begin")
    public void setTimeBegin(Integer timeBegin) {
        this.timeBegin = timeBegin;
    }

    @JsonProperty("time_end")
    public Integer getTimeEnd() {
        return timeEnd;
    }

    @JsonProperty("time_end")
    public void setTimeEnd(Integer timeEnd) {
        this.timeEnd = timeEnd;
    }

    @JsonProperty("safe_area")
    public SafeArea getSafeArea() {
        return safeArea;
    }

    @JsonProperty("safe_area")
    public void setSafeArea(SafeArea safeArea) {
        this.safeArea = safeArea;
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
