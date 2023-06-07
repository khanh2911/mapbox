package com.example.mapbox.controller;

import com.example.mapbox.entity.MyLocation;
import com.example.mapbox.repository.LocationRepository;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
@RestController
@RequestMapping("/api/locations")
public class LocationController {
    private final LocationRepository locationRepository;

    public LocationController(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @GetMapping
    public List<MyLocation> getAllLocations() {
        return locationRepository.findAll();
    }

    @PostMapping
    public MyLocation saveLocation(@RequestBody MyLocation location) {
        return locationRepository.save(location);
    }
}

