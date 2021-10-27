package com.example.demo.models;

import javax.persistence.*;

@Entity
public class PositiveTracker {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getPositive() {
        return isPositive;
    }

    public void setPositive(Boolean positive) {
        isPositive = positive;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name="ispositive")
    private Boolean isPositive;
    @Column(name="pincode")
    private Integer pincode;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public PositiveTracker(Boolean isPositive, Integer pincode, User user) {
        this.isPositive = isPositive;
        this.pincode = pincode;
        this.user = user;
    }

    public PositiveTracker() {
    }
}
