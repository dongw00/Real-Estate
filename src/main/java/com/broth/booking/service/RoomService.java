package com.broth.booking.service;

import com.broth.booking.domain.room.repository.RoomRepository;
import com.broth.booking.dto.room.RoomMainResponseDto;
import com.broth.booking.dto.room.RoomSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class RoomService {

    private RoomRepository roomRepository;

    @Transactional
    public Long save(RoomSaveRequestDto dto) {
        return roomRepository.save(dto.toEntity()).getId();
    }

    @Transactional(readOnly = true)
    public List<RoomMainResponseDto> findAllAsc() {
        return roomRepository.findAllAsc()
                .map(RoomMainResponseDto::new)
                .collect(Collectors.toList());
    }
}
