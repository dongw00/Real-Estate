package com.broth.booking.domain.product;

import com.broth.booking.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductImage extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long roomId;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private Long fileId;

    @Builder
    public ProductImage(Long roomId, String type, Long fileId) {
        this.roomId = roomId;
        this.type = type;
        this.fileId = fileId;
    }
}
