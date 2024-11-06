package com.fuelconsumption.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vehicleBrand")
public class VehicleBrand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EmbeddedId
    private Long brandId;

    private String brand;//BMW, Audi, Opel

    @OneToMany(mappedBy = "vehicleBrand", fetch = FetchType.EAGER)//mappedBy polje treba da se podudara sa imenom polja iz VehicleModel entiteta jer jer to referenca na VehicleBrand iz VehicleModel entiteta
    private Set<VehicleModel> vehicleModels = new HashSet<>();
}
