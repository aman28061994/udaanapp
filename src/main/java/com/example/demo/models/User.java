package com.example.demo.models;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    @Column(name="name")
    private String name;
    @Column(name = "phoneNumber")
    private Long phoneNumber;
    @Column(name = "pincode")
    private Integer pincode;

    public Integer getId() {
        return id;
    }

    public User() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public PositiveTracker getPositiveTracker() {
        return positiveTracker;
    }

    public void setPositiveTracker(PositiveTracker positiveTracker) {
        this.positiveTracker = positiveTracker;
    }

    public User(String name, Long phoneNumber, Integer pincode) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.pincode = pincode;
    }

    @OneToOne(mappedBy = "user")
    private PositiveTracker positiveTracker;

}
