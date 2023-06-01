package com.api.parkingcontrol.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name="TB_PARKING_SPOT")
//entity: marca a classe cmo entidade persistente fazendo com que seus atributos se tornem linhas dentro da tabela
// serializable trsanforma meu codigo em uma sequancia de bytes facilitando o envio pela rede, salvamento no disco ou comunicação entre JVM
        public class ParkingSpotModel implements Serializable {
        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue (strategy = GenerationType.AUTO)
        private UUID  id;
        @Column(nullable = false, unique = true, length = 10)
        private String parkingSpotNumber;
        @Column(nullable = false, unique = true, length = 7 )
        private String licensePlateCar;
        @Column(nullable = false, length = 70 )
        private String brandCar;
        @Column(nullable = false, length = 70 )
        private String modelCar;
        @Column(nullable = false, length = 70 )
        private String colorCar;
        private LocalDateTime registrationdate;
        @Column(nullable = false, length = 130 )
        private String responsableName;
        @Column(nullable = false, length = 30 )
        private String apartment;
        @Column(nullable = false, length = 30 )
        private String block;

        public UUID getId() {
                return id;
        }

        public void setId(UUID id) {
                this.id = id;
        }

        public String getParkingSpotNumber() {
                return parkingSpotNumber;
        }

        public void setParkingSpotNumber(String parkingSpotNumber) {
                this.parkingSpotNumber = parkingSpotNumber;
        }

        public String getLicensePlateCar() {
                return licensePlateCar;
        }

        public void setLicensePlateCar(String licensePlateCar) {
                this.licensePlateCar = licensePlateCar;
        }

        public String getBrandCar() {
                return brandCar;
        }

        public void setBrandCar(String brandCar) {
                this.brandCar = brandCar;
        }

        public String getModelCar() {
                return modelCar;
        }

        public void setModelCar(String modelCar) {
                this.modelCar = modelCar;
        }

        public String getColorCar() {
                return colorCar;
        }

        public void setColorCar(String colorCar) {
                this.colorCar = colorCar;
        }

        public LocalDateTime getRegistrationdate() {
                return registrationdate;
        }

        public void setRegistrationdate(LocalDateTime registrationdate) {
                this.registrationdate = registrationdate;
        }

        public String getResponsableName() {
                return responsableName;
        }

        public void setResponsableName(String responsableName) {
                this.responsableName = responsableName;
        }

        public String getApartment() {
                return apartment;
        }

        public void setApartment(String apartment) {
                this.apartment = apartment;
        }

        public String getBlock() {
                return block;
        }

        public void setBlock(String block) {
                this.block = block;
        }
}
