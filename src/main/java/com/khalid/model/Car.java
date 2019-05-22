package com.khalid.model;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Car implements Serializable {
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
