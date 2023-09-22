package com.example.marketservice.dto;

import com.example.marketservice.model.City;
import com.example.marketservice.model.Market;
import org.springframework.stereotype.Component;

@Component
public class MarketDtoConverter {

    public MarketDto convert(Market market){
        MarketDto marketDto=new MarketDto();
        marketDto.setId(market.getId());
        marketDto.setName(marketDto.getName());
        marketDto.setCity(City.valueOf(market.getCity().name()));
        marketDto.setAdress(market.getAdress());
        marketDto.setContacInfo(market.getContacInfo());
        return  marketDto;


    }

}
