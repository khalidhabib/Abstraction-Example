package com.khalid.dto;

import java.io.Serializable;
import java.util.Date;

public class CarDTO implements Serializable {
    private long ID;
    private String name;
    private Date createdOn;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
