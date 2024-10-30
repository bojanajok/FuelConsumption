package com.fuelconsumption.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vehicleModel")
public class VehicleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model; //X5, Insignia...

    @OneToMany//da li je potrebno ovde naglasiti ako je vec napisana veza @ManyToOne u VehicleBrand klasi
    private VehicleBrand vehicleBrand;
}
