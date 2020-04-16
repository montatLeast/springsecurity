package com.example.springsecurity.controller;

import com.example.springsecurity.dao.CountryDao;
import com.example.springsecurity.enity.Country;
import com.example.springsecurity.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
@CrossOrigin
//解决跨域访问
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping()
    public ResponseEntity getAllParkingLots(@RequestParam(required = false, defaultValue = "1")int page) {
        List<Country> countries = countryService.getAllCountries();
        return ResponseEntity.ok().body(countries);
    }

    @GetMapping("/{id}")
    public ResponseEntity getParkingLotsById(@PathVariable Long id) {
        Country country = countryService.getCountryById(id);
        return ResponseEntity.ok().body(country);
    }

}
