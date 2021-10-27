package com.example.demo.beans;

public class CovidResponse {
    private boolean updated;

    public boolean isUpdated() {
        return updated;
    }

    public void setUpdated(boolean updated) {
        this.updated = updated;
    }

    public CovidResponse(boolean updated) {
        this.updated = updated;
    }
}
