package com.example.campaignservice.dto;

import com.example.campaignservice.model.Campaign;
import org.springframework.stereotype.Component;

@Component
public class CampaignDtoConverter {

    public static CampaignDto convert(Campaign campaign){
        CampaignDto campaignDto=new CampaignDto();
        campaignDto.setId(campaign.getId());
        campaignDto.setActive(campaignDto.isActive());
        campaignDto.setMarketId(campaignDto.getMarketId());
        campaignDto.setSaleRate(campaignDto.getSaleRate());
        return campaignDto;
    }
}
