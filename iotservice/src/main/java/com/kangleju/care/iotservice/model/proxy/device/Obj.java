
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
    "alerts",
    "sos_numbers",
    "tool_numbers",
    "sos_dial_cycle_times",
    "sos_sendmail",
    "sos_readmail",
    "frequency_location",
    "frequency_step",
    "frequency_heartrate",
    "theshold_heartrate_h",
    "theshold_heartrate_l",
    "heartrate_enable",
    "incoming_restriction",
    "bluetooth_enable",
    "bluetooth_devices",
    "profile",
    "sleep_period_begin",
    "sleep_period_end",
    "step_objective",
    "theshold_sit",
    "theshold_low_battery",
    "fall_enable",
    "fall_model",
    "fences",
    "pedometer_enable",
    "sleep_enable",
    "track_enable",
    "imei",
    "imsi",
    "type",
    "sim_phone",
    "sim_phone_type",
    "owner",
    "name",
    "created_at",
    "updated_at",
    "lastlogin_ip",
    "lastlogin_at",
    "active",
    "active_at",
    "online",
    "location_updated",
    "location_updated_at",
    "last_location",
    "last_city",
    "last_address",
    "wear_flag",
    "wear_updated_at",
    "remaining_power",
    "remaining_power_updated_at",
    "wifi",
    "software_version",
    "iccid1",
    "fence_notification_updated_at",
    "service_number",
    "sos_dial_cycle_mode",
    "$owner"
})
public class Obj {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("alerts")
    private List<Alert> alerts = null;
    @JsonProperty("sos_numbers")
    private List<SosNumber> sosNumbers = null;
    @JsonProperty("tool_numbers")
    private List<ToolNumber> toolNumbers = null;
    @JsonProperty("sos_dial_cycle_times")
    private Integer sosDialCycleTimes;
    @JsonProperty("sos_sendmail")
    private Boolean sosSendmail;
    @JsonProperty("sos_readmail")
    private Boolean sosReadmail;
    @JsonProperty("frequency_location")
    private Integer frequencyLocation;
    @JsonProperty("frequency_step")
    private Integer frequencyStep;
    @JsonProperty("frequency_heartrate")
    private Integer frequencyHeartrate;
    @JsonProperty("theshold_heartrate_h")
    private Integer thesholdHeartrateH;
    @JsonProperty("theshold_heartrate_l")
    private Integer thesholdHeartrateL;
    @JsonProperty("heartrate_enable")
    private Boolean heartrateEnable;
    @JsonProperty("incoming_restriction")
    private Boolean incomingRestriction;
    @JsonProperty("bluetooth_enable")
    private Boolean bluetoothEnable;
    @JsonProperty("bluetooth_devices")
    private String bluetoothDevices;
    @JsonProperty("profile")
    private Integer profile;
    @JsonProperty("sleep_period_begin")
    private String sleepPeriodBegin;
    @JsonProperty("sleep_period_end")
    private String sleepPeriodEnd;
    @JsonProperty("step_objective")
    private Integer stepObjective;
    @JsonProperty("theshold_sit")
    private Integer thesholdSit;
    @JsonProperty("theshold_low_battery")
    private Integer thesholdLowBattery;
    @JsonProperty("fall_enable")
    private Boolean fallEnable;
    @JsonProperty("fall_model")
    private Integer fallModel;
    @JsonProperty("fences")
    private List<Fence> fences = null;
    @JsonProperty("pedometer_enable")
    private Boolean pedometerEnable;
    @JsonProperty("sleep_enable")
    private Boolean sleepEnable;
    @JsonProperty("track_enable")
    private Boolean trackEnable;
    @JsonProperty("imei")
    private String imei;
    @JsonProperty("imsi")
    private String imsi;
    @JsonProperty("type")
    private String type;
    @JsonProperty("sim_phone")
    private String simPhone;
    @JsonProperty("sim_phone_type")
    private String simPhoneType;
    @JsonProperty("owner")
    private Owner owner;
    @JsonProperty("name")
    private String name;
    @JsonProperty("created_at")
    private CreatedAt createdAt;
    @JsonProperty("updated_at")
    private UpdatedAt updatedAt;
    @JsonProperty("lastlogin_ip")
    private String lastloginIp;
    @JsonProperty("lastlogin_at")
    private LastloginAt lastloginAt;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("active_at")
    private ActiveAt activeAt;
    @JsonProperty("online")
    private Boolean online;
    @JsonProperty("location_updated")
    private Boolean locationUpdated;
    @JsonProperty("location_updated_at")
    private LocationUpdatedAt locationUpdatedAt;
    @JsonProperty("last_location")
    private LastLocation lastLocation;
    @JsonProperty("last_city")
    private String lastCity;
    @JsonProperty("last_address")
    private String lastAddress;
    @JsonProperty("wear_flag")
    private Integer wearFlag;
    @JsonProperty("wear_updated_at")
    private WearUpdatedAt wearUpdatedAt;
    @JsonProperty("remaining_power")
    private Integer remainingPower;
    @JsonProperty("remaining_power_updated_at")
    private RemainingPowerUpdatedAt remainingPowerUpdatedAt;
    @JsonProperty("wifi")
    private List<Object> wifi = null;
    @JsonProperty("software_version")
    private String softwareVersion;
    @JsonProperty("iccid1")
    private String iccid1;
    @JsonProperty("fence_notification_updated_at")
    private FenceNotificationUpdatedAt fenceNotificationUpdatedAt;
    @JsonProperty("service_number")
    private String serviceNumber;
    @JsonProperty("sos_dial_cycle_mode")
    private Integer sosDialCycleMode;
    @JsonProperty("$owner")
    private com.kangleju.care.iotservice.model.proxy.device.$owner $owner;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("alerts")
    public List<Alert> getAlerts() {
        return alerts;
    }

    @JsonProperty("alerts")
    public void setAlerts(List<Alert> alerts) {
        this.alerts = alerts;
    }

    @JsonProperty("sos_numbers")
    public List<SosNumber> getSosNumbers() {
        return sosNumbers;
    }

    @JsonProperty("sos_numbers")
    public void setSosNumbers(List<SosNumber> sosNumbers) {
        this.sosNumbers = sosNumbers;
    }

    @JsonProperty("tool_numbers")
    public List<ToolNumber> getToolNumbers() {
        return toolNumbers;
    }

    @JsonProperty("tool_numbers")
    public void setToolNumbers(List<ToolNumber> toolNumbers) {
        this.toolNumbers = toolNumbers;
    }

    @JsonProperty("sos_dial_cycle_times")
    public Integer getSosDialCycleTimes() {
        return sosDialCycleTimes;
    }

    @JsonProperty("sos_dial_cycle_times")
    public void setSosDialCycleTimes(Integer sosDialCycleTimes) {
        this.sosDialCycleTimes = sosDialCycleTimes;
    }

    @JsonProperty("sos_sendmail")
    public Boolean getSosSendmail() {
        return sosSendmail;
    }

    @JsonProperty("sos_sendmail")
    public void setSosSendmail(Boolean sosSendmail) {
        this.sosSendmail = sosSendmail;
    }

    @JsonProperty("sos_readmail")
    public Boolean getSosReadmail() {
        return sosReadmail;
    }

    @JsonProperty("sos_readmail")
    public void setSosReadmail(Boolean sosReadmail) {
        this.sosReadmail = sosReadmail;
    }

    @JsonProperty("frequency_location")
    public Integer getFrequencyLocation() {
        return frequencyLocation;
    }

    @JsonProperty("frequency_location")
    public void setFrequencyLocation(Integer frequencyLocation) {
        this.frequencyLocation = frequencyLocation;
    }

    @JsonProperty("frequency_step")
    public Integer getFrequencyStep() {
        return frequencyStep;
    }

    @JsonProperty("frequency_step")
    public void setFrequencyStep(Integer frequencyStep) {
        this.frequencyStep = frequencyStep;
    }

    @JsonProperty("frequency_heartrate")
    public Integer getFrequencyHeartrate() {
        return frequencyHeartrate;
    }

    @JsonProperty("frequency_heartrate")
    public void setFrequencyHeartrate(Integer frequencyHeartrate) {
        this.frequencyHeartrate = frequencyHeartrate;
    }

    @JsonProperty("theshold_heartrate_h")
    public Integer getThesholdHeartrateH() {
        return thesholdHeartrateH;
    }

    @JsonProperty("theshold_heartrate_h")
    public void setThesholdHeartrateH(Integer thesholdHeartrateH) {
        this.thesholdHeartrateH = thesholdHeartrateH;
    }

    @JsonProperty("theshold_heartrate_l")
    public Integer getThesholdHeartrateL() {
        return thesholdHeartrateL;
    }

    @JsonProperty("theshold_heartrate_l")
    public void setThesholdHeartrateL(Integer thesholdHeartrateL) {
        this.thesholdHeartrateL = thesholdHeartrateL;
    }

    @JsonProperty("heartrate_enable")
    public Boolean getHeartrateEnable() {
        return heartrateEnable;
    }

    @JsonProperty("heartrate_enable")
    public void setHeartrateEnable(Boolean heartrateEnable) {
        this.heartrateEnable = heartrateEnable;
    }

    @JsonProperty("incoming_restriction")
    public Boolean getIncomingRestriction() {
        return incomingRestriction;
    }

    @JsonProperty("incoming_restriction")
    public void setIncomingRestriction(Boolean incomingRestriction) {
        this.incomingRestriction = incomingRestriction;
    }

    @JsonProperty("bluetooth_enable")
    public Boolean getBluetoothEnable() {
        return bluetoothEnable;
    }

    @JsonProperty("bluetooth_enable")
    public void setBluetoothEnable(Boolean bluetoothEnable) {
        this.bluetoothEnable = bluetoothEnable;
    }

    @JsonProperty("bluetooth_devices")
    public String getBluetoothDevices() {
        return bluetoothDevices;
    }

    @JsonProperty("bluetooth_devices")
    public void setBluetoothDevices(String bluetoothDevices) {
        this.bluetoothDevices = bluetoothDevices;
    }

    @JsonProperty("profile")
    public Integer getProfile() {
        return profile;
    }

    @JsonProperty("profile")
    public void setProfile(Integer profile) {
        this.profile = profile;
    }

    @JsonProperty("sleep_period_begin")
    public String getSleepPeriodBegin() {
        return sleepPeriodBegin;
    }

    @JsonProperty("sleep_period_begin")
    public void setSleepPeriodBegin(String sleepPeriodBegin) {
        this.sleepPeriodBegin = sleepPeriodBegin;
    }

    @JsonProperty("sleep_period_end")
    public String getSleepPeriodEnd() {
        return sleepPeriodEnd;
    }

    @JsonProperty("sleep_period_end")
    public void setSleepPeriodEnd(String sleepPeriodEnd) {
        this.sleepPeriodEnd = sleepPeriodEnd;
    }

    @JsonProperty("step_objective")
    public Integer getStepObjective() {
        return stepObjective;
    }

    @JsonProperty("step_objective")
    public void setStepObjective(Integer stepObjective) {
        this.stepObjective = stepObjective;
    }

    @JsonProperty("theshold_sit")
    public Integer getThesholdSit() {
        return thesholdSit;
    }

    @JsonProperty("theshold_sit")
    public void setThesholdSit(Integer thesholdSit) {
        this.thesholdSit = thesholdSit;
    }

    @JsonProperty("theshold_low_battery")
    public Integer getThesholdLowBattery() {
        return thesholdLowBattery;
    }

    @JsonProperty("theshold_low_battery")
    public void setThesholdLowBattery(Integer thesholdLowBattery) {
        this.thesholdLowBattery = thesholdLowBattery;
    }

    @JsonProperty("fall_enable")
    public Boolean getFallEnable() {
        return fallEnable;
    }

    @JsonProperty("fall_enable")
    public void setFallEnable(Boolean fallEnable) {
        this.fallEnable = fallEnable;
    }

    @JsonProperty("fall_model")
    public Integer getFallModel() {
        return fallModel;
    }

    @JsonProperty("fall_model")
    public void setFallModel(Integer fallModel) {
        this.fallModel = fallModel;
    }

    @JsonProperty("fences")
    public List<Fence> getFences() {
        return fences;
    }

    @JsonProperty("fences")
    public void setFences(List<Fence> fences) {
        this.fences = fences;
    }

    @JsonProperty("pedometer_enable")
    public Boolean getPedometerEnable() {
        return pedometerEnable;
    }

    @JsonProperty("pedometer_enable")
    public void setPedometerEnable(Boolean pedometerEnable) {
        this.pedometerEnable = pedometerEnable;
    }

    @JsonProperty("sleep_enable")
    public Boolean getSleepEnable() {
        return sleepEnable;
    }

    @JsonProperty("sleep_enable")
    public void setSleepEnable(Boolean sleepEnable) {
        this.sleepEnable = sleepEnable;
    }

    @JsonProperty("track_enable")
    public Boolean getTrackEnable() {
        return trackEnable;
    }

    @JsonProperty("track_enable")
    public void setTrackEnable(Boolean trackEnable) {
        this.trackEnable = trackEnable;
    }

    @JsonProperty("imei")
    public String getImei() {
        return imei;
    }

    @JsonProperty("imei")
    public void setImei(String imei) {
        this.imei = imei;
    }

    @JsonProperty("imsi")
    public String getImsi() {
        return imsi;
    }

    @JsonProperty("imsi")
    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("sim_phone")
    public String getSimPhone() {
        return simPhone;
    }

    @JsonProperty("sim_phone")
    public void setSimPhone(String simPhone) {
        this.simPhone = simPhone;
    }

    @JsonProperty("sim_phone_type")
    public String getSimPhoneType() {
        return simPhoneType;
    }

    @JsonProperty("sim_phone_type")
    public void setSimPhoneType(String simPhoneType) {
        this.simPhoneType = simPhoneType;
    }

    @JsonProperty("owner")
    public Owner getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("created_at")
    public CreatedAt getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(CreatedAt createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public UpdatedAt getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(UpdatedAt updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("lastlogin_ip")
    public String getLastloginIp() {
        return lastloginIp;
    }

    @JsonProperty("lastlogin_ip")
    public void setLastloginIp(String lastloginIp) {
        this.lastloginIp = lastloginIp;
    }

    @JsonProperty("lastlogin_at")
    public LastloginAt getLastloginAt() {
        return lastloginAt;
    }

    @JsonProperty("lastlogin_at")
    public void setLastloginAt(LastloginAt lastloginAt) {
        this.lastloginAt = lastloginAt;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("active_at")
    public ActiveAt getActiveAt() {
        return activeAt;
    }

    @JsonProperty("active_at")
    public void setActiveAt(ActiveAt activeAt) {
        this.activeAt = activeAt;
    }

    @JsonProperty("online")
    public Boolean getOnline() {
        return online;
    }

    @JsonProperty("online")
    public void setOnline(Boolean online) {
        this.online = online;
    }

    @JsonProperty("location_updated")
    public Boolean getLocationUpdated() {
        return locationUpdated;
    }

    @JsonProperty("location_updated")
    public void setLocationUpdated(Boolean locationUpdated) {
        this.locationUpdated = locationUpdated;
    }

    @JsonProperty("location_updated_at")
    public LocationUpdatedAt getLocationUpdatedAt() {
        return locationUpdatedAt;
    }

    @JsonProperty("location_updated_at")
    public void setLocationUpdatedAt(LocationUpdatedAt locationUpdatedAt) {
        this.locationUpdatedAt = locationUpdatedAt;
    }

    @JsonProperty("last_location")
    public LastLocation getLastLocation() {
        return lastLocation;
    }

    @JsonProperty("last_location")
    public void setLastLocation(LastLocation lastLocation) {
        this.lastLocation = lastLocation;
    }

    @JsonProperty("last_city")
    public String getLastCity() {
        return lastCity;
    }

    @JsonProperty("last_city")
    public void setLastCity(String lastCity) {
        this.lastCity = lastCity;
    }

    @JsonProperty("last_address")
    public String getLastAddress() {
        return lastAddress;
    }

    @JsonProperty("last_address")
    public void setLastAddress(String lastAddress) {
        this.lastAddress = lastAddress;
    }

    @JsonProperty("wear_flag")
    public Integer getWearFlag() {
        return wearFlag;
    }

    @JsonProperty("wear_flag")
    public void setWearFlag(Integer wearFlag) {
        this.wearFlag = wearFlag;
    }

    @JsonProperty("wear_updated_at")
    public WearUpdatedAt getWearUpdatedAt() {
        return wearUpdatedAt;
    }

    @JsonProperty("wear_updated_at")
    public void setWearUpdatedAt(WearUpdatedAt wearUpdatedAt) {
        this.wearUpdatedAt = wearUpdatedAt;
    }

    @JsonProperty("remaining_power")
    public Integer getRemainingPower() {
        return remainingPower;
    }

    @JsonProperty("remaining_power")
    public void setRemainingPower(Integer remainingPower) {
        this.remainingPower = remainingPower;
    }

    @JsonProperty("remaining_power_updated_at")
    public RemainingPowerUpdatedAt getRemainingPowerUpdatedAt() {
        return remainingPowerUpdatedAt;
    }

    @JsonProperty("remaining_power_updated_at")
    public void setRemainingPowerUpdatedAt(RemainingPowerUpdatedAt remainingPowerUpdatedAt) {
        this.remainingPowerUpdatedAt = remainingPowerUpdatedAt;
    }

    @JsonProperty("wifi")
    public List<Object> getWifi() {
        return wifi;
    }

    @JsonProperty("wifi")
    public void setWifi(List<Object> wifi) {
        this.wifi = wifi;
    }

    @JsonProperty("software_version")
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    @JsonProperty("software_version")
    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    @JsonProperty("iccid1")
    public String getIccid1() {
        return iccid1;
    }

    @JsonProperty("iccid1")
    public void setIccid1(String iccid1) {
        this.iccid1 = iccid1;
    }

    @JsonProperty("fence_notification_updated_at")
    public FenceNotificationUpdatedAt getFenceNotificationUpdatedAt() {
        return fenceNotificationUpdatedAt;
    }

    @JsonProperty("fence_notification_updated_at")
    public void setFenceNotificationUpdatedAt(FenceNotificationUpdatedAt fenceNotificationUpdatedAt) {
        this.fenceNotificationUpdatedAt = fenceNotificationUpdatedAt;
    }

    @JsonProperty("service_number")
    public String getServiceNumber() {
        return serviceNumber;
    }

    @JsonProperty("service_number")
    public void setServiceNumber(String serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    @JsonProperty("sos_dial_cycle_mode")
    public Integer getSosDialCycleMode() {
        return sosDialCycleMode;
    }

    @JsonProperty("sos_dial_cycle_mode")
    public void setSosDialCycleMode(Integer sosDialCycleMode) {
        this.sosDialCycleMode = sosDialCycleMode;
    }

    @JsonProperty("$owner")
    public com.kangleju.care.iotservice.model.proxy.device.$owner get$owner() {
        return $owner;
    }

    @JsonProperty("$owner")
    public void set$owner(com.kangleju.care.iotservice.model.proxy.device.$owner $owner) {
        this.$owner = $owner;
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
