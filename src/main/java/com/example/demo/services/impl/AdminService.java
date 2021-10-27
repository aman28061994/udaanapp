package com.example.demo.services.impl;

import com.example.demo.beans.AdminRequest;
import com.example.demo.beans.AdminResponse;
import com.example.demo.beans.CovidResponse;
import com.example.demo.models.Admin;
import com.example.demo.models.PositiveTracker;
import com.example.demo.models.User;
import com.example.demo.repository.AdminRepository;
import com.example.demo.repository.PositiveTrackerRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.services.interfaces.AdminServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdminService implements AdminServiceInterface {
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PositiveTrackerRepository positiveTrackerRepository;
    @Override
    public AdminResponse saveUser(Admin admin) {
        if(admin!=null && admin.getPhoneNumber()!=null){
            if(adminRepository.getAdminByPhoneNumber(admin.getPhoneNumber())==null){
                Admin createdAdmin = adminRepository.save(admin);
                return new AdminResponse(createdAdmin.getId());
            }
        }
        return null;
    }

    @Override
    public CovidResponse updateResult(AdminRequest adminRequest) {
        if(adminRequest!=null && adminRequest.getUserId()!=0 && adminRequest.getAdminId()!=0){
            User user = userRepository.getUserById(adminRequest.getUserId());
            Admin admin = adminRepository.getAdminById(adminRequest.getAdminId());
            if(admin!=null && user!=null){
                //    public PositiveTracker(Boolean isPositive, Integer pincode, User user) {
                if(adminRequest.getResult()!=null && adminRequest.getResult().equalsIgnoreCase("positive")) {
                    PositiveTracker positiveTracker =   positiveTrackerRepository.save(new PositiveTracker(true, user.getPincode(), user));
                    user.setPositiveTracker(positiveTracker);
                    return new CovidResponse(true);
                }
            }
        }
        return null;
    }
}
