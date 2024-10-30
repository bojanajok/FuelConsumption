package com.fuelconsumption.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fuelType")
    private Enum FuelType;

    @Column(name = "productionYear")
    private int productionYear;

    @Column(name = "powerEngine")
    private int powerEngine;

    @Column(name = "gearingType")
    private Enum GearingType;

    @Column(name = "tankCapacity")
    private int tankCapacity;

    @Column(name = "vehicleBrand")
    private VehicleBrand vehicleBrand;//BMW, Audi, Opel...

    @Column(name = "vehicleModel")
    private VehicleModel vehicleModel;//X5, Insignia...

    @ManyToOne
    @JoinColumn( name = "user_id" , nullable = false) // foreign key za Vehicle tabelu je user_id
    private User user;
}
