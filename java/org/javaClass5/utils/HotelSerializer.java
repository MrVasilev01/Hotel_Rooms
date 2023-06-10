package org.javaClass5.utils;

import org.javaClass5.hotels.HotelRoom;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class HotelSerializer {
    public static void serializeHotelRoom(String filePath, HotelRoom hotelRoom)
            throws IOException {
        try(FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream outputStream = new ObjectOutputStream(fos);) {
            outputStream.writeObject(hotelRoom);
        }
    }
}
