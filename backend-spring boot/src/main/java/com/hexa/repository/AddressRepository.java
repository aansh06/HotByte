package com.hexa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexa.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
