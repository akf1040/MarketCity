package com.example.marketservice.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="markets")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;
    private String adress;
    @Enumerated
    private City city;

    private ContacInfo contacInfo;
}
