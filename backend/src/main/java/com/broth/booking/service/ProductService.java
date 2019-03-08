package com.broth.booking.service;

import com.broth.booking.domain.product.repository.ProductRepository;
import com.broth.booking.dto.product.ProductMainResponseDto;
import com.broth.booking.dto.product.ProductSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ProductService {

    private ProductRepository productRepository;

    @Transactional
    public Long save(ProductSaveRequestDto dto) {
        return productRepository.save(dto.toEntity()).getId();
    }

    @Transactional(readOnly = true)
    public List<ProductMainResponseDto> findAllAsc() {
        return productRepository.findAllAsc()
                .map(ProductMainResponseDto::new)
                .collect(Collectors.toList());
    }

    /*
    @Transactional(readOnly = true)
    public
    */
}
