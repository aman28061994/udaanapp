package com.example.demo.controllers;

import com.example.demo.beans.AdminRequest;
import com.example.demo.beans.AdminResponse;
import com.example.demo.beans.CovidResponse;
import com.example.demo.models.Admin;
import com.example.demo.services.interfaces.AdminServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Autowired
    private AdminServiceInterface adminServiceInterface;
    @PostMapping("/registerAdmin")
    public AdminResponse registerAdmin(@RequestBody Admin admin){
        AdminResponse adminResponse = adminServiceInterface.saveUser(admin);
        return adminResponse;
    }
    @PostMapping("/updateCovidResult")
    public CovidResponse updateCovidResult(@RequestBody AdminRequest adminRequest){
        return adminServiceInterface.updateResult(adminRequest);
    }
}
