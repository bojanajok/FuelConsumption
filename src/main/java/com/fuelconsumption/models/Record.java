package com.fuelconsumption.models;

public record Record(long id, int date, double price, double odometer, double distance, double quantity, String note, int vehicleIdCompKey, RecordConditions rec, Enum type) {


}
