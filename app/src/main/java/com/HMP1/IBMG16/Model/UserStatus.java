package com.HMP1.IBMG16.Model;

import java.util.ArrayList;

public class UserStatus {
    private String username,profilepic;
    private long lastUpdated;
    private ArrayList<Status> statuses;

    public UserStatus() {
    }

    public UserStatus(String username, String profilepic, long lastUpdated, ArrayList<Status> statuses) {
        this.username = username;
        this.profilepic = profilepic;
        this.lastUpdated = lastUpdated;
        this.statuses = statuses;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public long getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<Status> getStatuses() {
        return statuses;
    }

    public void setStatuses(ArrayList<Status> statuses) {
        this.statuses = statuses;
    }
}
