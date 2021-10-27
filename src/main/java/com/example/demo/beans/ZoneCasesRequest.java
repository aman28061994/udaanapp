package com.example.demo.beans;

public class ZoneCasesRequest {
    // {"pinCode":"111111"}s
    private Integer pincode;

    public ZoneCasesRequest() {
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public ZoneCasesRequest(Integer pincode) {
        this.pincode = pincode;
    }
}
