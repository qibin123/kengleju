
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
    "obj",
    "success",
    "obj_name"
})
public class Account {

    @JsonProperty("obj")
    private Obj obj;
    @JsonProperty("success")
    private Boolean success;
    @JsonProperty("obj_name")
    private String objName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("obj")
    public Obj getObj() {
        return obj;
    }

    @JsonProperty("obj")
    public void setObj(Obj obj) {
        this.obj = obj;
    }

    @JsonProperty("success")
    public Boolean getSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @JsonProperty("obj_name")
    public String getObjName() {
        return objName;
    }

    @JsonProperty("obj_name")
    public void setObjName(String objName) {
        this.objName = objName;
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
