package com.example.springsecurity.dao;

import com.example.springsecurity.enity.Country;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CountryDao extends JpaRepository<Country, Long> {

}
