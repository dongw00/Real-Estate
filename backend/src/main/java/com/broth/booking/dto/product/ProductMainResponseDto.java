package com.broth.booking.dto.product;

import com.broth.booking.domain.product.Product;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Getter
public class ProductMainResponseDto {
    private Long id;
    private String title;
    private String content;
    private String modifiedDate;

    public ProductMainResponseDto(Product entity) {
        id = entity.getId();
        title = entity.getTitle();
        content = entity.getContent();
        modifiedDate = toStringDateTime(entity.getModifiedDate());
    }

    private String toStringDateTime(LocalDateTime localDateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return Optional.ofNullable(localDateTime)
                .map(formatter::format)
                .orElse("");
    }
}
