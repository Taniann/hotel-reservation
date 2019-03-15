package ua.tania.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.tania.entity.Hotel;
import ua.tania.entity.Room;

import java.util.List;

/**
 * Created by Tania Nebesna on 27.02.2019
 */
public interface RoomRepository extends JpaRepository<Room, Long> {
    List<Room> findAllByFreeIsTrue();

    List<Room> findAllByHotel(Hotel hotel);

    List<Room> findAllByHotel_City(String city);
}
