
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
    "name",
    "num",
    "dial_flag"
})
public class SosNumber {

    @JsonProperty("seqid")
    private Integer seqid;
    @JsonProperty("name")
    private String name;
    @JsonProperty("num")
    private String num;
    @JsonProperty("dial_flag")
    private Boolean dialFlag;
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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("num")
    public String getNum() {
        return num;
    }

    @JsonProperty("num")
    public void setNum(String num) {
        this.num = num;
    }

    @JsonProperty("dial_flag")
    public Boolean getDialFlag() {
        return dialFlag;
    }

    @JsonProperty("dial_flag")
    public void setDialFlag(Boolean dialFlag) {
        this.dialFlag = dialFlag;
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
