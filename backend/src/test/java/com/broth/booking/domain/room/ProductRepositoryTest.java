package com.broth.booking.domain.room;

import com.broth.booking.domain.product.Product;
import com.broth.booking.domain.product.repository.ProductRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductRepositoryTest {

    @Autowired
    ProductRepository productRepository;

    @After
    public void clenup() {
        productRepository.deleteAll();
    }

    @Test
    public void 불러오기() {
        // given
        LocalDateTime now = LocalDateTime.now();
        productRepository.save(Product.builder()
                .title("블록체인 정기밋업 1회")
                .content("블록체인 정기밋업 1회 1회 1회")
                .build());

        // when
        List<Product> productList = productRepository.findAll();

        // then
        Product product = productList.get(0);
        assertThat(product.getTitle(), is("블록체인 정기밋업 1회"));
        assertTrue(product.getCreatedDate().isAfter(now));
        assertTrue(product.getModifiedDate().isAfter(now));
    }
}
