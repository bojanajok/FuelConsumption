package com.fuelconsumption.models;

public record Record(long id, int date, double price, double odometer, double distance, double quantity, String note, VehicleCompKey vehicleCompKey, RecordConditions rec, Enum type) {

    //instanciranje rekorda
    //Record record1 = new Record(1, 22972924, 24.95, redomm sva polja)
    //set metode ne postoje, sva polja su final, get u imenu imaju samo nazivArgumenta()
    //System.out.println("Vrednosti iz record-a: " + record1.id() + "," + record1.date() + "," + record1.price() )

}
