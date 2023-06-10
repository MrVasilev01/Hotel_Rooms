package org.javaClass5.hotels;

import java.io.Serializable;

public class HotelRoom implements Serializable {
    private final int roomNumber;
    private int occupants;
    private double price;

    public HotelRoom(int roomNumber, int occupants, double price) {
        this.roomNumber = roomNumber;
        this.occupants = occupants;
        this.price = price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getOccupants() {
        return occupants;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "HotelRoom{" +
                "roomNumber=" + roomNumber +
                ", occupants=" + occupants +
                ", price=" + price +
                '}';
    }
}
