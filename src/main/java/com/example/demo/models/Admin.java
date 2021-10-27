package com.example.demo.models;

import javax.persistence.*;

@Entity
public class Admin {
    public Admin(Integer id, Long phoneNumber, Integer pincode) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.pincode = pincode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public Admin() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "phonenumber")
    private Long phoneNumber;
    @Column(name = "pincode")
    private Integer pincode;
}
