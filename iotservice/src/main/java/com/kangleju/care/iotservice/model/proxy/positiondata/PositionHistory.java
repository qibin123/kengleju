
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
    "objs",
    "page",
    "success",
    "obj_name"
})
public class PositionHistory {

    @JsonProperty("objs")
    private List<Obj> objs = null;
    @JsonProperty("page")
    private Page page;
    @JsonProperty("success")
    private Boolean success;
    @JsonProperty("obj_name")
    private String objName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("objs")
    public List<Obj> getObjs() {
        return objs;
    }

    @JsonProperty("objs")
    public void setObjs(List<Obj> objs) {
        this.objs = objs;
    }

    @JsonProperty("page")
    public Page getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(Page page) {
        this.page = page;
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
