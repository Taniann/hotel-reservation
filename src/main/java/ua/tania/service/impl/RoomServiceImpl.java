package ua.tania.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.tania.dto.RoomDto;
import ua.tania.entity.Hotel;
import ua.tania.entity.Room;
import ua.tania.repository.RoomRepository;
import ua.tania.service.RoomService;


import java.util.List;

/**
 * Created by Tania Nebesna on 15.03.2019
 */
@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomRepository roomRepository;


    @Override
    public List<Room> findAllAvailable() {
        return roomRepository.findAllByFreeIsTrue();
    }

    @Override
    public List<Room> findAllByHotel(Hotel hotel) {

        return roomRepository.findAllByHotel(hotel);
    }

    @Override
    public List<Room> findAllByCity(String city) {

        return roomRepository.findAllByHotel_City(city);
    }

    @Override
    public void save(RoomDto roomDto) {
        Room room = new Room();
        room.setNumber(roomDto.getNumber());
        room.setRoominess(roomDto.getRoominess());
        room.setPricePerDay(roomDto.getPricePerDay());
        room.setHotel(roomDto.getHotel());
        room.setFree(true);

        roomRepository.save(room);
    }
}
