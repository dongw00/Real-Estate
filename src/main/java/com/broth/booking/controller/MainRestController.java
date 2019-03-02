package com.broth.booking.controller;

import com.broth.booking.domain.room.repository.RoomRepository;
import com.broth.booking.dto.room.RoomSaveRequestDto;
import com.broth.booking.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MainRestController {

    private RoomRepository roomRepository;
    private RoomService roomService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }

    @PostMapping("/post")
    public Long postRoom(@RequestBody RoomSaveRequestDto dto) {
        return roomService.save(dto);
    }
}
