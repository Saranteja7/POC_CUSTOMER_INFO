package com.vzw.dvs.customerinfo.controller;

import com.vzw.dvs.customerinfo.models.DMDData;
import com.vzw.dvs.customerinfo.models.RequestModel;
import com.vzw.dvs.customerinfo.service.DMDDeviceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@RefreshScope
@RequestMapping("/customer_info")
public class CustomerInfoController {


	@Value("${message}")
	private String message;

	@Autowired
	DMDDeviceInfoService dmdDeviceInfoService;

	@GetMapping(value = "/getmessage")
	public String Hiii()
	{
		return message;
	}
	@PostMapping(value = "/findbyid")
	public DMDData findById(@RequestBody RequestModel requestModel) {
		return dmdDeviceInfoService.findDeviceInfoByDeviceId(requestModel);
	}





}
