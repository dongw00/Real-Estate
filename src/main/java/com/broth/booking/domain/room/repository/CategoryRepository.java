package com.broth.booking.domain.room.repository;

import com.broth.booking.domain.room.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
