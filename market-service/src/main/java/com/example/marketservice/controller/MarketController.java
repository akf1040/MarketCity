package com.example.marketservice.controller;


import com.example.marketservice.dto.CreateMarketRequest;
import com.example.marketservice.dto.MarketDto;
import com.example.marketservice.service.MarketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/markets")
public class MarketController {

    private static final Logger logger= LoggerFactory.getLogger(MarketController.class);
    private final MarketService marketService;

    public MarketController(MarketService marketService) {
        this.marketService = marketService;
    }
   @PostMapping
   public ResponseEntity<MarketDto> createMarket(@RequestBody CreateMarketRequest createMarketRequest){
        return ResponseEntity.ok(marketService.createMarket(createMarketRequest));
    }
    @GetMapping
    public ResponseEntity<MarketDto> getMarketById(@PathVariable String marketId){
        return ResponseEntity.ok(marketService.getMarketById(marketId));
}}
