package com.broth.booking.domain.product;

import com.broth.booking.domain.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 15, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Column(nullable = false)
    private boolean delete_flag;

    @Column(nullable = false)
    private Long host_id;

    @Builder
    public Product(String title, String content, Long host_id) {
        this.title = title;
        this.content = content;
        this.delete_flag = false;
        this.host_id = host_id;
    }
}
