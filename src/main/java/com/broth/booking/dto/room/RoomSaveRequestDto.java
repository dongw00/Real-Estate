package com.broth.booking.dto.room;

import com.broth.booking.domain.room.Room;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RoomSaveRequestDto {
    private String title;
    private String content;

    @Builder
    public RoomSaveRequestDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Room toEntity() {
        return Room.builder()
                .title(title)
                .content(content)
                .build();
    }
}
