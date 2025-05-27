package com.hexa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexa.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
