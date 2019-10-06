package com.vzw.dvs.customerinfo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Results {
    List<DMDDeviceInfo> dmdDeviceInfo;

    public Results(List<DMDDeviceInfo> dmdDeviceInfo) {
        this.dmdDeviceInfo = dmdDeviceInfo;
    }

    public Results() {
    }

    public List getDmdDeviceInfo() {
        return dmdDeviceInfo;
    }

    public void setDmdDeviceInfo(List<DMDDeviceInfo> dmdDeviceInfo) {
        this.dmdDeviceInfo = dmdDeviceInfo;
    }
}
