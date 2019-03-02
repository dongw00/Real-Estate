package com.broth.booking.domain.room.repository;

import com.broth.booking.domain.room.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;

public interface RoomRepository extends JpaRepository<Room, Long> {
    @Query(value = "SELECT *" +
            " FROM room r " +
            "ORDER BY r.id ASC", nativeQuery = true)
    Stream<Room> findAllAsc();
}

