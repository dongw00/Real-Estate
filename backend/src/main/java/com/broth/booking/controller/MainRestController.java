package com.broth.booking.controller;

import com.broth.booking.domain.product.repository.ProductRepository;
import com.broth.booking.dto.product.ProductSaveRequestDto;
import com.broth.booking.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MainRestController {

    private ProductRepository productRepository;
    private ProductService roomService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }

    @PostMapping("/post")
    public Long postRoom(@RequestBody ProductSaveRequestDto dto) {
        return roomService.save(dto);
    }
}
