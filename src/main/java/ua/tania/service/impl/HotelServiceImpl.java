package ua.tania.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.tania.dto.HotelDto;
import ua.tania.entity.Hotel;
import ua.tania.repository.HotelRepository;
import ua.tania.service.HotelService;

import java.util.List;

/**
 * Created by Tania Nebesna on 15.03.2019
 */
@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepository hotelRepository;


    @Override
    public List<Hotel> findAll() {
        return hotelRepository.findAll();
    }

    @Override
    public void save(HotelDto hotelDto) {
        Hotel hotel = new Hotel();
        hotel.setCity(hotelDto.getCity());
        hotel.setName(hotelDto.getName());
        hotelRepository.save(hotel);
    }

    @Override
    public void delete(Hotel hotel) {
        hotelRepository.delete(hotel);
    }
}
