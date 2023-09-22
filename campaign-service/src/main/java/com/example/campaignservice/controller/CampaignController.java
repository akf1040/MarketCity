package com.example.campaignservice.controller;


import com.example.campaignservice.dto.CampaignDto;
import com.example.campaignservice.dto.CreateCampaignRequest;
import com.example.campaignservice.service.CampaignService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/campaigns")
public class CampaignController {

     private final CampaignService campaignService;

    public CampaignController(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @PostMapping
    public ResponseEntity<CampaignDto> createCampaign(@RequestBody CreateCampaignRequest createCampaignRequest){
        return ResponseEntity.ok(campaignService.crateCampaign(createCampaignRequest));
    }


    @GetMapping("/{marketId}")
    public ResponseEntity<CampaignDto> getCampaignMarketById(@PathVariable String marketId){
        return ResponseEntity.ok(campaignService.getCampaignMarketById(marketId));
    }
}
