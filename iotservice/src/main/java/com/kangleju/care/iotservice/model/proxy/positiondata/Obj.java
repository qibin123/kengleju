
package com.kangleju.care.iotservice.model.proxy.positiondata;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_id",
    "device",
    "created_at",
    "time_begin",
    "type",
    "is_reply",
    "is_track",
    "statu",
    "city",
    "address",
    "point",
    "cell",
    "wifi"
})
public class Obj {

    @JsonProperty("_id")
    private Id id;
    @JsonProperty("device")
    private String device;
    @JsonProperty("created_at")
    private CreatedAt createdAt;
    @JsonProperty("time_begin")
    private TimeBegin timeBegin;
    @JsonProperty("type")
    private String type;
    @JsonProperty("is_reply")
    private Boolean isReply;
    @JsonProperty("is_track")
    private Boolean isTrack;
    @JsonProperty("statu")
    private String statu;
    @JsonProperty("city")
    private String city;
    @JsonProperty("address")
    private String address;
    @JsonProperty("point")
    private Point point;
    @JsonProperty("cell")
    private List<Cell> cell = null;
    @JsonProperty("wifi")
    private List<Wifi> wifi = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_id")
    public Id getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(Id id) {
        this.id = id;
    }

    @JsonProperty("device")
    public String getDevice() {
        return device;
    }

    @JsonProperty("device")
    public void setDevice(String device) {
        this.device = device;
    }

    @JsonProperty("created_at")
    public CreatedAt getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(CreatedAt createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("time_begin")
    public TimeBegin getTimeBegin() {
        return timeBegin;
    }

    @JsonProperty("time_begin")
    public void setTimeBegin(TimeBegin timeBegin) {
        this.timeBegin = timeBegin;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("is_reply")
    public Boolean getIsReply() {
        return isReply;
    }

    @JsonProperty("is_reply")
    public void setIsReply(Boolean isReply) {
        this.isReply = isReply;
    }

    @JsonProperty("is_track")
    public Boolean getIsTrack() {
        return isTrack;
    }

    @JsonProperty("is_track")
    public void setIsTrack(Boolean isTrack) {
        this.isTrack = isTrack;
    }

    @JsonProperty("statu")
    public String getStatu() {
        return statu;
    }

    @JsonProperty("statu")
    public void setStatu(String statu) {
        this.statu = statu;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("point")
    public Point getPoint() {
        return point;
    }

    @JsonProperty("point")
    public void setPoint(Point point) {
        this.point = point;
    }

    @JsonProperty("cell")
    public List<Cell> getCell() {
        return cell;
    }

    @JsonProperty("cell")
    public void setCell(List<Cell> cell) {
        this.cell = cell;
    }

    @JsonProperty("wifi")
    public List<Wifi> getWifi() {
        return wifi;
    }

    @JsonProperty("wifi")
    public void setWifi(List<Wifi> wifi) {
        this.wifi = wifi;
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
