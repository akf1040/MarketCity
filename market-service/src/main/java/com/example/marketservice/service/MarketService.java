package com.example.marketservice.service;


import com.example.marketservice.client.CampaignClient;
import com.example.marketservice.dto.CampaignDto;
import com.example.marketservice.dto.CreateMarketRequest;
import com.example.marketservice.dto.MarketDto;
import com.example.marketservice.dto.MarketDtoConverter;
import com.example.marketservice.model.City;
import com.example.marketservice.model.Market;
import com.example.marketservice.repository.MarketRepository;
import org.springframework.stereotype.Service;

@Service
public class MarketService {
    private final MarketRepository marketRepository;
    private final MarketDtoConverter marketDtoConverter;

    private final CampaignClient campaignClient;

    public MarketService(MarketRepository marketRepository, MarketDtoConverter marketDtoConverter, CampaignClient campaignClient) {
        this.marketRepository = marketRepository;
        this.marketDtoConverter = marketDtoConverter;
        this.campaignClient = campaignClient;
    }


    public MarketDto createMarket(CreateMarketRequest createMarketRequest) {
        Market market=new Market();
        market.setId(createMarketRequest.getId());
        market.setCity(City.valueOf(createMarketRequest.getCity().name()));
        market.setName(createMarketRequest.getName());
        market.setContacInfo(createMarketRequest.getContacInfo());
        createMarketRequest.setAdress(createMarketRequest.getAdress());

        return marketDtoConverter.convert(marketRepository.save(market));



    }

    public MarketDto getMarketById(String marketId) {
        Market market= marketRepository.findById(marketId).orElseThrow(()->new RuntimeException("belirtilen id ile market bulunamadı"+marketId));

            CampaignDto campaignDto = campaignClient.getCampaignByMarketId(marketId).getBody();

        return new MarketDto();

    }
}
