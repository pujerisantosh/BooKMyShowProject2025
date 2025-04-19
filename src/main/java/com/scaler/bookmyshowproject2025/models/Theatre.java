package com.scaler.bookmyshowproject2025.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel {

    private String name;
    private String address;
    @OneToMany
    private List<Screen> screens;
    @ManyToOne
    private Region region;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
