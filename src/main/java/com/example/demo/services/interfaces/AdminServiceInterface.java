package com.example.demo.services.interfaces;


import com.example.demo.beans.AdminRequest;
import com.example.demo.beans.AdminResponse;
import com.example.demo.beans.CovidResponse;
import com.example.demo.models.Admin;

public interface AdminServiceInterface {
    public AdminResponse saveUser(Admin admin);
    public CovidResponse updateResult(AdminRequest adminRequest);
}
