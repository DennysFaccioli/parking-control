package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//respository neste caso nao seria necessario porem com a finalidade de organizar melhor meu codigo eu decidi coemntar.
public interface ParkingSportRepository extends JpaRepository <ParkingSpotModel, UUID > {

}
