
package com.kangleju.care.iotservice.model.proxy.login;

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
    "token_type",
    "token",
    "push_server",
    "is_enable_aliase",
    "created_at"
})
public class Devicetoken {

    @JsonProperty("token_type")
    private String tokenType;
    @JsonProperty("token")
    private String token;
    @JsonProperty("push_server")
    private String pushServer;
    @JsonProperty("is_enable_aliase")
    private Boolean isEnableAliase;
    @JsonProperty("created_at")
    private CreatedAt createdAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("token_type")
    public String getTokenType() {
        return tokenType;
    }

    @JsonProperty("token_type")
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    @JsonProperty("push_server")
    public String getPushServer() {
        return pushServer;
    }

    @JsonProperty("push_server")
    public void setPushServer(String pushServer) {
        this.pushServer = pushServer;
    }

    @JsonProperty("is_enable_aliase")
    public Boolean getIsEnableAliase() {
        return isEnableAliase;
    }

    @JsonProperty("is_enable_aliase")
    public void setIsEnableAliase(Boolean isEnableAliase) {
        this.isEnableAliase = isEnableAliase;
    }

    @JsonProperty("created_at")
    public CreatedAt getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(CreatedAt createdAt) {
        this.createdAt = createdAt;
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
