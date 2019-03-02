package com.broth.booking.domain.room;

import com.broth.booking.domain.room.repository.RoomRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoomRepositoryTest {

    @Autowired
    RoomRepository roomRepository;

    @After
    public void clenup() {
        roomRepository.deleteAll();
    }

    @Test
    public void 불러오기() {
        // given
        LocalDateTime now = LocalDateTime.now();
        roomRepository.save(Room.builder()
                .title("블록체인 정기밋업 1회")
                .content("블록체인 정기밋업 1회 1회 1회")
                .build());

        // when
        List<Room> roomList = roomRepository.findAll();

        // then
        Room room = roomList.get(0);
        assertThat(room.getTitle(), is("블록체인 정기밋업 1회"));
        assertTrue(room.getCreatedDate().isAfter(now));
        assertTrue(room.getModifiedDate().isAfter(now));
    }
}
