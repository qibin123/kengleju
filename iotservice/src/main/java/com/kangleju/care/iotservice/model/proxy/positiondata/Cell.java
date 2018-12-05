
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
    "mcc",
    "mnc",
    "lac",
    "cid",
    "rssi"
})
public class Cell {

    @JsonProperty("mcc")
    private String mcc;
    @JsonProperty("mnc")
    private String mnc;
    @JsonProperty("lac")
    private Integer lac;
    @JsonProperty("cid")
    private Integer cid;
    @JsonProperty("rssi")
    private Integer rssi;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("mcc")
    public String getMcc() {
        return mcc;
    }

    @JsonProperty("mcc")
    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    @JsonProperty("mnc")
    public String getMnc() {
        return mnc;
    }

    @JsonProperty("mnc")
    public void setMnc(String mnc) {
        this.mnc = mnc;
    }

    @JsonProperty("lac")
    public Integer getLac() {
        return lac;
    }

    @JsonProperty("lac")
    public void setLac(Integer lac) {
        this.lac = lac;
    }

    @JsonProperty("cid")
    public Integer getCid() {
        return cid;
    }

    @JsonProperty("cid")
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @JsonProperty("rssi")
    public Integer getRssi() {
        return rssi;
    }

    @JsonProperty("rssi")
    public void setRssi(Integer rssi) {
        this.rssi = rssi;
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
