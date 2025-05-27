package com.hexa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexa.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
