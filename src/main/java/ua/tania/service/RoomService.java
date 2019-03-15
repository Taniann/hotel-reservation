package ua.tania.service;

import ua.tania.dto.RoomDto;
import ua.tania.entity.Hotel;
import ua.tania.entity.Room;

import java.util.List;

/**
 * Created by Tania Nebesna on 15.03.2019
 */
public interface RoomService {
    List<Room> findAllAvailable();

    List<Room> findAllByHotel(Hotel hotel);

    List<Room> findAllByCity(String city);

    void save(RoomDto roomDto);

}
