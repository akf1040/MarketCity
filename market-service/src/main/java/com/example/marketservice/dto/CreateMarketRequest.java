package com.example.marketservice.dto;


import com.example.marketservice.model.City;
import com.example.marketservice.model.ContacInfo;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode
public class CreateMarketRequest {
    private String id;
    private String name;
    private String adress;
    private City city;
    private ContacInfo contacInfo;

}
