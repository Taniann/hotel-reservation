package ua.tania.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.tania.entity.Hotel;

/**
 * Created by Tania Nebesna on 27.02.2019
 */
@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
