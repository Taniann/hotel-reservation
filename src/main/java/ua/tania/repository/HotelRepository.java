package ua.tania.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.tania.entity.Hotel;

/**
 * Created by Tania Nebesna on 27.02.2019
 */
@Repository
public interface HotelRepository extends CrudRepository<Hotel, Long> {
}
