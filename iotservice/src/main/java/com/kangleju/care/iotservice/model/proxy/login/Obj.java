
package com.kangleju.care.iotservice.model.proxy.login;

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
    "username",
    "nickname",
    "phone",
    "devicetokens",
    "weight",
    "height",
    "avatar_url",
    "community",
    "gender",
    "location_enable",
    "devices",
    "groups",
    "bluetoothdevices",
    "sleepdevices"
})
public class Obj {

    @JsonProperty("_id")
    private Id id;
    @JsonProperty("username")
    private String username;
    @JsonProperty("nickname")
    private String nickname;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("devicetokens")
    private List<Devicetoken> devicetokens = null;
    @JsonProperty("weight")
    private Integer weight;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("avatar_url")
    private String avatarUrl;
    @JsonProperty("community")
    private Community community;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("location_enable")
    private Boolean locationEnable;
    @JsonProperty("devices")
    private List<Object> devices = null;
    @JsonProperty("groups")
    private List<Object> groups = null;
    @JsonProperty("bluetoothdevices")
    private List<Object> bluetoothdevices = null;
    @JsonProperty("sleepdevices")
    private List<Object> sleepdevices = null;
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

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("nickname")
    public String getNickname() {
        return nickname;
    }

    @JsonProperty("nickname")
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("devicetokens")
    public List<Devicetoken> getDevicetokens() {
        return devicetokens;
    }

    @JsonProperty("devicetokens")
    public void setDevicetokens(List<Devicetoken> devicetokens) {
        this.devicetokens = devicetokens;
    }

    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    @JsonProperty("avatar_url")
    public String getAvatarUrl() {
        return avatarUrl;
    }

    @JsonProperty("avatar_url")
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @JsonProperty("community")
    public Community getCommunity() {
        return community;
    }

    @JsonProperty("community")
    public void setCommunity(Community community) {
        this.community = community;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("location_enable")
    public Boolean getLocationEnable() {
        return locationEnable;
    }

    @JsonProperty("location_enable")
    public void setLocationEnable(Boolean locationEnable) {
        this.locationEnable = locationEnable;
    }

    @JsonProperty("devices")
    public List<Object> getDevices() {
        return devices;
    }

    @JsonProperty("devices")
    public void setDevices(List<Object> devices) {
        this.devices = devices;
    }

    @JsonProperty("groups")
    public List<Object> getGroups() {
        return groups;
    }

    @JsonProperty("groups")
    public void setGroups(List<Object> groups) {
        this.groups = groups;
    }

    @JsonProperty("bluetoothdevices")
    public List<Object> getBluetoothdevices() {
        return bluetoothdevices;
    }

    @JsonProperty("bluetoothdevices")
    public void setBluetoothdevices(List<Object> bluetoothdevices) {
        this.bluetoothdevices = bluetoothdevices;
    }

    @JsonProperty("sleepdevices")
    public List<Object> getSleepdevices() {
        return sleepdevices;
    }

    @JsonProperty("sleepdevices")
    public void setSleepdevices(List<Object> sleepdevices) {
        this.sleepdevices = sleepdevices;
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
