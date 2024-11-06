package com.fuelconsumption.models;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

//Klasa za kompozitni kljuc. Sadrzi polja koja odgovaraju kolonama kompozitnog kljuca
//mora da ima implementirane metode equals() i hashCode()
@Embeddable
public class VehicleCompKey implements Serializable {
    private Long brandId;
    private Long modelId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehicleCompKey that = (VehicleCompKey) o;
        return Objects.equals(brandId, that.brandId) && Objects.equals(modelId, that.modelId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandId, modelId);
    }
}
