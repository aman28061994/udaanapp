package com.example.demo.beans;

public class AdminRequest {
    // {"userId":"1","adminId":"2","result":"positive"}

    private int userId;
    private int adminId;
    private String result;

    public AdminRequest() {    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public AdminRequest(int userId, int adminId, String result) {
        this.userId = userId;
        this.adminId = adminId;
        this.result = result;
    }
}
