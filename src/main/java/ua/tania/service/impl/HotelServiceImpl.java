package ua.tania.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.tania.entity.Hotel;
import ua.tania.repository.HotelRepository;
import ua.tania.service.HotelService;

/**
 * Created by Tania Nebesna on 15.03.2019
 */
@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepository hotelRepository;


    @Override
    public void save(Hotel hotel) {
        hotelRepository.save(hotel);
    }

    @Override
    public void delete(Hotel hotel) {
        hotelRepository.delete(hotel);
    }
}
