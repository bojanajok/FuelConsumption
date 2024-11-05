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
    @Enumerated(EnumType.STRING)
    private FuelType fuelType;

    @Column(name = "productionYear")
    private int productionYear;

    @Column(name = "powerEngine")
    private int powerEngine;

    @Column(name = "gearingType")
    @Enumerated(EnumType.STRING) //naglašava da je polje gearingType tipa Enum
    private GearingType gearingType;

    @Column(name = "tankCapacity")
    private int tankCapacity;

    @ManyToOne(fetch = FetchType.EAGER) //uvek kada medju poljima entiteta postoji drugi entitet treba da pise relacija izmedju entiteta kako bi JPA ispravno mapirao entitete na objekte u bazi
    @JoinColumn(name = "vehicle_brand_id", nullable = false)//kolona u bazi vehicle se zove "vehicle_brand_id" i predstavlja strani kljuc
    private VehicleBrand vehicleBrand;//BMW, Audi, Opel...

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "vehicle_model_id", nullable = false)
    //@Column(name = "vehicleModel")
    private VehicleModel vehicleModel;//X5, Insignia...

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn( name = "user_id" , nullable = false) // foreign key za Vehicle tabelu je user_id. Vehicle referencira korisnika user_id.
    private User user;
}
