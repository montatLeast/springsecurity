package com.example.springsecurity.service;

import com.example.springsecurity.dao.CountryDao;
import com.example.springsecurity.enity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryDao countryDao;

    public List<Country> getAllCountries(){
        List<Country> countries = new ArrayList<>();
        countries = countryDao.findAll();
        return countries;
    }

    public Country getCountryById(Long id){
        Country country = countryDao.findById(id).get();
        return country;
    }



}
