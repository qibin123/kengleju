
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
    "enable",
    "is_medicine",
    "name",
    "alert_type",
    "cycle",
    "time",
    "media_length",
    "file_checksum"
})
public class Alert {

    @JsonProperty("seqid")
    private Integer seqid;
    @JsonProperty("enable")
    private Boolean enable;
    @JsonProperty("is_medicine")
    private Boolean isMedicine;
    @JsonProperty("name")
    private String name;
    @JsonProperty("alert_type")
    private Integer alertType;
    @JsonProperty("cycle")
    private Integer cycle;
    @JsonProperty("time")
    private String time;
    @JsonProperty("media_length")
    private Integer mediaLength;
    @JsonProperty("file_checksum")
    private Integer fileChecksum;
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

    @JsonProperty("enable")
    public Boolean getEnable() {
        return enable;
    }

    @JsonProperty("enable")
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @JsonProperty("is_medicine")
    public Boolean getIsMedicine() {
        return isMedicine;
    }

    @JsonProperty("is_medicine")
    public void setIsMedicine(Boolean isMedicine) {
        this.isMedicine = isMedicine;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("alert_type")
    public Integer getAlertType() {
        return alertType;
    }

    @JsonProperty("alert_type")
    public void setAlertType(Integer alertType) {
        this.alertType = alertType;
    }

    @JsonProperty("cycle")
    public Integer getCycle() {
        return cycle;
    }

    @JsonProperty("cycle")
    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("media_length")
    public Integer getMediaLength() {
        return mediaLength;
    }

    @JsonProperty("media_length")
    public void setMediaLength(Integer mediaLength) {
        this.mediaLength = mediaLength;
    }

    @JsonProperty("file_checksum")
    public Integer getFileChecksum() {
        return fileChecksum;
    }

    @JsonProperty("file_checksum")
    public void setFileChecksum(Integer fileChecksum) {
        this.fileChecksum = fileChecksum;
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
