package com.example.demo.services.impl;

import com.example.demo.beans.ZoneCasesRequest;
import com.example.demo.beans.ZoneResponse;
import com.example.demo.models.PositiveTracker;
import com.example.demo.repository.PositiveTrackerRepository;
import com.example.demo.services.interfaces.ZoneServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ZoneServiceImpl implements ZoneServicesInterface {
    @Autowired
    private PositiveTrackerRepository positiveTrackerRepository;
    @Override
    public ZoneResponse getZoneResponse(ZoneCasesRequest zoneCasesRequest) {
        if(zoneCasesRequest!=null){
            List<PositiveTracker> positiveTrackerList= positiveTrackerRepository.findPositiveTrackerByPincode(zoneCasesRequest.getPincode());
            if(positiveTrackerList.size()>0 && positiveTrackerList.size()<5){
                return new ZoneResponse(positiveTrackerList.size(),"ORANGE");
            }else if(positiveTrackerList.size()>0 && positiveTrackerList.size()>5){
                return new ZoneResponse(positiveTrackerList.size(),"RED");
            }else{
                    return new ZoneResponse(0,"GREEN");

            }
        }
        return null;
    }
}
