package org.javaClass5;

import org.javaClass5.exceptions.RoomAlreadyInTheListException;
import org.javaClass5.exceptions.RoomIsNotAvailableException;
import org.javaClass5.exceptions.RoomNotInTheListException;
import org.javaClass5.hotels.Hotel;
import org.javaClass5.hotels.HotelRoom;
import org.javaClass5.utils.HotelSerializer;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        HotelRoom hotelRoom1 = new HotelRoom(101, 2, 100);
        HotelRoom hotelRoom2 = new HotelRoom(102, 3, 120);
        HotelRoom hotelRoom3 = new HotelRoom(103, 3, 120);
        HotelRoom hotelRoom4 = new HotelRoom(104, 2, 100);

        Hotel hotel = new Hotel("H1");

        try {
            hotel.addRoom(hotelRoom1);
        } catch (RoomAlreadyInTheListException e) {
            throw new RuntimeException(e);
        }
        try {
            hotel.addRoom(hotelRoom2);
        } catch (RoomAlreadyInTheListException e) {
            throw new RuntimeException(e);
        }
        try {
            hotel.addRoom(hotelRoom3);
        } catch (RoomAlreadyInTheListException e) {
            throw new RuntimeException(e);
        }
        hotel.printRooms();

        try (FileWriter fileWriter = new FileWriter
                ("rented room" + hotelRoom2.getRoomNumber() + ".txt")) {
            fileWriter.write(hotel.toString() + " " + hotelRoom2);
            hotel.addRentedRoom(hotelRoom2);
        } catch (RoomNotInTheListException | RoomIsNotAvailableException | IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println();

        System.out.println(hotelRoom2);

        String filePath = "hotel_room_.ser";
        try {
            HotelSerializer.serializeHotelRoom(filePath,hotelRoom2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println();

        hotelRoom2.setPrice(140);

        System.out.println(hotelRoom2);

        System.out.println();


    }
}