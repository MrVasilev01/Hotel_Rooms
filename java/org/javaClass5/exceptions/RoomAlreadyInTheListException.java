package org.javaClass5.exceptions;

import org.javaClass5.hotels.HotelRoom;

public class RoomAlreadyInTheListException extends Exception {
    private HotelRoom hotelRoom;

    public RoomAlreadyInTheListException(HotelRoom hotelRoom) {
        super();
        this.hotelRoom = hotelRoom;
    }

    @Override
    public String toString() {
        return "RoomAlreadyInTheListException{" +
                "hotelRoom=" + hotelRoom +
                "} ";
    }
}
