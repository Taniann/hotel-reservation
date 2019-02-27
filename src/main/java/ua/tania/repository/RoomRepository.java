package ua.tania.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.tania.entity.Room;

/**
 * Created by Tania Nebesna on 27.02.2019
 */
public interface RoomRepository extends JpaRepository<Room, Long> {
}
