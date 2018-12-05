
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
    "addr",
    "ssid",
    "rssi"
})
public class Wifi {

    @JsonProperty("addr")
    private String addr;
    @JsonProperty("ssid")
    private String ssid;
    @JsonProperty("rssi")
    private Integer rssi;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("addr")
    public String getAddr() {
        return addr;
    }

    @JsonProperty("addr")
    public void setAddr(String addr) {
        this.addr = addr;
    }

    @JsonProperty("ssid")
    public String getSsid() {
        return ssid;
    }

    @JsonProperty("ssid")
    public void setSsid(String ssid) {
        this.ssid = ssid;
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
