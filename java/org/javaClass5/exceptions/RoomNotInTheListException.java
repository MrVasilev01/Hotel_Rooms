package org.javaClass5.exceptions;

import org.javaClass5.hotels.HotelRoom;

public class RoomNotInTheListException extends Exception {
    private HotelRoom hotelRoom;

    public RoomNotInTheListException(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
    }
}
