package com.api.parkingcontrol.services;

import com.api.parkingcontrol.repositories.ParkingSportRepository;

import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {
    final
    ParkingSportRepository parkingSportRepository;
    public ParkingSpotService(ParkingSportRepository parkingSportRepository) {
        this.parkingSportRepository = parkingSportRepository;
    }
}
