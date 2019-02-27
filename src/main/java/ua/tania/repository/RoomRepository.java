package ua.tania.repository;

import org.springframework.data.repository.CrudRepository;
import ua.tania.entity.Room;

/**
 * Created by Tania Nebesna on 27.02.2019
 */
public interface RoomRepository extends CrudRepository<Room, Long> {
}
