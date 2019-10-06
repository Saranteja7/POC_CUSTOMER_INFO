package com.vzw.dvs.customerinfo.service;

import com.vzw.dvs.customerinfo.models.DMDData;
import com.vzw.dvs.customerinfo.models.RequestModel;

public interface DMDDeviceInfoService {
    public DMDData findDeviceInfoByDeviceId(RequestModel requestModel);
}
