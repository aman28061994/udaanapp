package com.example.demo.services.interfaces;

import com.example.demo.beans.ZoneCasesRequest;
import com.example.demo.beans.ZoneResponse;

public interface ZoneServicesInterface {
    public ZoneResponse getZoneResponse(ZoneCasesRequest zoneCasesRequest);
}
