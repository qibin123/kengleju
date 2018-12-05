
package com.kangleju.care.iotservice.model.proxy.device;

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
    "password",
    "nickname",
    "app",
    "devicetokens",
    "weight",
    "step",
    "age",
    "height",
    "avatar_url",
    "role",
    "gender",
    "created_at",
    "updated_at",
    "lastlogin_by",
    "enable",
    "email_is_checked",
    "phone_is_checked",
    "push_sos_enable",
    "push_fence_enable",
    "push_abnormal_enable",
    "push_message_enable",
    "push_lowpower_enable",
    "push_system_enable",
    "push_fall_enable",
    "push_env_enable",
    "auth_updated_at",
    "is_device_owner",
    "devices",
    "groups"
})
public class $owner {

    @JsonProperty("_id")
    private Id id;
    @JsonProperty("username")
    private String username;
    @JsonProperty("password")
    private String password;
    @JsonProperty("nickname")
    private String nickname;
    @JsonProperty("app")
    private String app;
    @JsonProperty("devicetokens")
    private List<Object> devicetokens = null;
    @JsonProperty("weight")
    private Integer weight;
    @JsonProperty("step")
    private Integer step;
    @JsonProperty("age")
    private Integer age;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("avatar_url")
    private String avatarUrl;
    @JsonProperty("role")
    private String role;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("created_at")
    private CreatedAt_ createdAt;
    @JsonProperty("updated_at")
    private UpdatedAt_ updatedAt;
    @JsonProperty("lastlogin_by")
    private String lastloginBy;
    @JsonProperty("enable")
    private Boolean enable;
    @JsonProperty("email_is_checked")
    private Boolean emailIsChecked;
    @JsonProperty("phone_is_checked")
    private Boolean phoneIsChecked;
    @JsonProperty("push_sos_enable")
    private Boolean pushSosEnable;
    @JsonProperty("push_fence_enable")
    private Boolean pushFenceEnable;
    @JsonProperty("push_abnormal_enable")
    private Boolean pushAbnormalEnable;
    @JsonProperty("push_message_enable")
    private Boolean pushMessageEnable;
    @JsonProperty("push_lowpower_enable")
    private Boolean pushLowpowerEnable;
    @JsonProperty("push_system_enable")
    private Boolean pushSystemEnable;
    @JsonProperty("push_fall_enable")
    private Boolean pushFallEnable;
    @JsonProperty("push_env_enable")
    private Boolean pushEnvEnable;
    @JsonProperty("auth_updated_at")
    private AuthUpdatedAt authUpdatedAt;
    @JsonProperty("is_device_owner")
    private Boolean isDeviceOwner;
    @JsonProperty("devices")
    private List<String> devices = null;
    @JsonProperty("groups")
    private List<Group> groups = null;
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

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    @JsonProperty("nickname")
    public String getNickname() {
        return nickname;
    }

    @JsonProperty("nickname")
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @JsonProperty("app")
    public String getApp() {
        return app;
    }

    @JsonProperty("app")
    public void setApp(String app) {
        this.app = app;
    }

    @JsonProperty("devicetokens")
    public List<Object> getDevicetokens() {
        return devicetokens;
    }

    @JsonProperty("devicetokens")
    public void setDevicetokens(List<Object> devicetokens) {
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

    @JsonProperty("step")
    public Integer getStep() {
        return step;
    }

    @JsonProperty("step")
    public void setStep(Integer step) {
        this.step = step;
    }

    @JsonProperty("age")
    public Integer getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(Integer age) {
        this.age = age;
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

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("created_at")
    public CreatedAt_ getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(CreatedAt_ createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public UpdatedAt_ getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(UpdatedAt_ updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("lastlogin_by")
    public String getLastloginBy() {
        return lastloginBy;
    }

    @JsonProperty("lastlogin_by")
    public void setLastloginBy(String lastloginBy) {
        this.lastloginBy = lastloginBy;
    }

    @JsonProperty("enable")
    public Boolean getEnable() {
        return enable;
    }

    @JsonProperty("enable")
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @JsonProperty("email_is_checked")
    public Boolean getEmailIsChecked() {
        return emailIsChecked;
    }

    @JsonProperty("email_is_checked")
    public void setEmailIsChecked(Boolean emailIsChecked) {
        this.emailIsChecked = emailIsChecked;
    }

    @JsonProperty("phone_is_checked")
    public Boolean getPhoneIsChecked() {
        return phoneIsChecked;
    }

    @JsonProperty("phone_is_checked")
    public void setPhoneIsChecked(Boolean phoneIsChecked) {
        this.phoneIsChecked = phoneIsChecked;
    }

    @JsonProperty("push_sos_enable")
    public Boolean getPushSosEnable() {
        return pushSosEnable;
    }

    @JsonProperty("push_sos_enable")
    public void setPushSosEnable(Boolean pushSosEnable) {
        this.pushSosEnable = pushSosEnable;
    }

    @JsonProperty("push_fence_enable")
    public Boolean getPushFenceEnable() {
        return pushFenceEnable;
    }

    @JsonProperty("push_fence_enable")
    public void setPushFenceEnable(Boolean pushFenceEnable) {
        this.pushFenceEnable = pushFenceEnable;
    }

    @JsonProperty("push_abnormal_enable")
    public Boolean getPushAbnormalEnable() {
        return pushAbnormalEnable;
    }

    @JsonProperty("push_abnormal_enable")
    public void setPushAbnormalEnable(Boolean pushAbnormalEnable) {
        this.pushAbnormalEnable = pushAbnormalEnable;
    }

    @JsonProperty("push_message_enable")
    public Boolean getPushMessageEnable() {
        return pushMessageEnable;
    }

    @JsonProperty("push_message_enable")
    public void setPushMessageEnable(Boolean pushMessageEnable) {
        this.pushMessageEnable = pushMessageEnable;
    }

    @JsonProperty("push_lowpower_enable")
    public Boolean getPushLowpowerEnable() {
        return pushLowpowerEnable;
    }

    @JsonProperty("push_lowpower_enable")
    public void setPushLowpowerEnable(Boolean pushLowpowerEnable) {
        this.pushLowpowerEnable = pushLowpowerEnable;
    }

    @JsonProperty("push_system_enable")
    public Boolean getPushSystemEnable() {
        return pushSystemEnable;
    }

    @JsonProperty("push_system_enable")
    public void setPushSystemEnable(Boolean pushSystemEnable) {
        this.pushSystemEnable = pushSystemEnable;
    }

    @JsonProperty("push_fall_enable")
    public Boolean getPushFallEnable() {
        return pushFallEnable;
    }

    @JsonProperty("push_fall_enable")
    public void setPushFallEnable(Boolean pushFallEnable) {
        this.pushFallEnable = pushFallEnable;
    }

    @JsonProperty("push_env_enable")
    public Boolean getPushEnvEnable() {
        return pushEnvEnable;
    }

    @JsonProperty("push_env_enable")
    public void setPushEnvEnable(Boolean pushEnvEnable) {
        this.pushEnvEnable = pushEnvEnable;
    }

    @JsonProperty("auth_updated_at")
    public AuthUpdatedAt getAuthUpdatedAt() {
        return authUpdatedAt;
    }

    @JsonProperty("auth_updated_at")
    public void setAuthUpdatedAt(AuthUpdatedAt authUpdatedAt) {
        this.authUpdatedAt = authUpdatedAt;
    }

    @JsonProperty("is_device_owner")
    public Boolean getIsDeviceOwner() {
        return isDeviceOwner;
    }

    @JsonProperty("is_device_owner")
    public void setIsDeviceOwner(Boolean isDeviceOwner) {
        this.isDeviceOwner = isDeviceOwner;
    }

    @JsonProperty("devices")
    public List<String> getDevices() {
        return devices;
    }

    @JsonProperty("devices")
    public void setDevices(List<String> devices) {
        this.devices = devices;
    }

    @JsonProperty("groups")
    public List<Group> getGroups() {
        return groups;
    }

    @JsonProperty("groups")
    public void setGroups(List<Group> groups) {
        this.groups = groups;
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
