package com.example.springsecurity.enity;

import lombok.Data;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Entity
@Table(name = "country")
@Data
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long countryId;

    @Column(nullable = false)
    private String countryName;
}
