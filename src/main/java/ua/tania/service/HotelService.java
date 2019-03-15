package ua.tania.service;

import ua.tania.dto.HotelDto;
import ua.tania.entity.Hotel;

import java.util.List;

/**
 * Created by Tania Nebesna on 15.03.2019
 */
public interface HotelService {
    List<Hotel> findAll();

    void save(HotelDto hotelDto);

    void delete(Hotel hotel);

}
