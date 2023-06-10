package org.javaClass5.exceptions;

import org.javaClass5.hotels.HotelRoom;

public class RoomIsNotAvailableException extends Exception {
    private HotelRoom hotelRoom;

    public RoomIsNotAvailableException(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
    }
}
