package com.broth.booking.domain.product.repository;

import com.broth.booking.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "SELECT *" +
            " FROM product r " +
            "ORDER BY r.id ASC", nativeQuery = true)
    Stream<Product> findAllAsc();

    // @Query(value = "")
}

