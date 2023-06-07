package com.example.mapbox.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "locations")
public class MyLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    @Column(columnDefinition = "json")
    private String location;

    public MyLocation() {
    }

    public MyLocation(Long id, String name, String location, String address) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
