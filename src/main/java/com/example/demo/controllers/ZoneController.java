package com.example.demo.controllers;

import com.example.demo.beans.ZoneCasesRequest;
import com.example.demo.beans.ZoneResponse;
import com.example.demo.services.interfaces.ZoneServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZoneController {
    @Autowired
    private ZoneServicesInterface zoneServicesInterface;
    @PostMapping("/getZoneInfo")
    public ZoneResponse getZoneInfo(ZoneCasesRequest zoneCasesRequest){
        return zoneServicesInterface.getZoneResponse(zoneCasesRequest);
    }
}
