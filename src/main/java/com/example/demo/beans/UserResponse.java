package com.example.demo.beans;

public class UserResponse {

    private Integer userId;

    public UserResponse() {

    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public UserResponse(Integer userId) {
        this.userId = userId;
    }
}
