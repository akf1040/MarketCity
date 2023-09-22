package com.example.marketservice.client;


import com.example.marketservice.dto.CampaignDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="campaign-service",path="/v1/campaigns")
public interface CampaignClient {

    @GetMapping("/{marketId}")
    ResponseEntity<CampaignDto> getCampaignByMarketId(@PathVariable String marketId);

}
