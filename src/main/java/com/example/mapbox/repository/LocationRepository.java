package com.example.mapbox.repository;

import com.example.mapbox.entity.MyLocation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LocationRepository extends JpaRepository<MyLocation, Long> {
}
