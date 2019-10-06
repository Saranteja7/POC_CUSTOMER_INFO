package com.vzw.dvs.customerinfo.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vzw.dvs.customerinfo.controller.CustomerInfoController;
import com.vzw.dvs.customerinfo.models.DMDData;
import com.vzw.dvs.customerinfo.models.RequestModel;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class DMDDeviceInfoServiceImpl implements  DMDDeviceInfoService{
    private static final Logger logger = LoggerFactory.getLogger(CustomerInfoController.class);

    Map keyAttr = new HashMap<String, String>();

    @Autowired
    PNORestClient pnoRestClient;
    @Override
    public DMDData findDeviceInfoByDeviceId(RequestModel requestModel) {
        DMDData dmdData = new DMDData();
//		keyAttr.put("deviceId", "99000500946244"); //"99000500946244"
//		RequestModel requestModel = new RequestModel("test_CustInfo", keyAttr);
        requestModel.setCorrelationId("1234567890");
        requestModel.setOrginalService("multiDeviceLookup");
        requestModel.setOrginalSubService("NONE");
        StringBuilder sb = pnoRestClient.getPNOResponse(requestModel);

        ObjectMapper mapper = new ObjectMapper();
        try {
            if(sb.toString() != null && !StringUtils.isEmpty(sb.toString()))
                logger.info("Getting PNO response ");
            else
                logger.error("No response from PNO");
            dmdData = mapper.readValue(sb.toString(), DMDData.class);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            logger.error("IOException "+e.getMessage());
        }
        return dmdData;
    }
}
