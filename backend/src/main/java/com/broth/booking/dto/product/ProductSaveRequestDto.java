package com.broth.booking.dto.product;

import com.broth.booking.domain.product.Product;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductSaveRequestDto {
    private String title;
    private String content;

    @Builder
    public ProductSaveRequestDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Product toEntity() {
        return Product.builder()
                .title(title)
                .content(content)
                .build();
    }
}
