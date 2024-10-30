package com.fuelconsumption.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vehicleBrand")
public class VehicleBrand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;//BMW, Audi, Opel
    @ManyToOne(fetch = FetchType.EAGER)//iz baze se zajedno sa markom auta dovlaci i model
    @JoinColumn(name = "vehicleModel_id", nullable = false)
    private VehicleModel vehicleModel;
}
