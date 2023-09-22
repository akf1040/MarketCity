package com.example.campaignservice.service;

import com.example.campaignservice.dto.CampaignDto;
import com.example.campaignservice.dto.CampaignDtoConverter;
import com.example.campaignservice.dto.CreateCampaignRequest;
import com.example.campaignservice.model.Campaign;
import com.example.campaignservice.repository.CampaignRepository;
import org.springframework.stereotype.Service;

@Service
public class CampaignService {

    private final CampaignDtoConverter campaignDtoConverter;
    private final CampaignRepository campaignRepository;

    public CampaignService(CampaignDtoConverter campaignDtoConverter, CampaignRepository campaignRepository) {
        this.campaignDtoConverter = campaignDtoConverter;
        this.campaignRepository = campaignRepository;
    }

    public CampaignDto getCampaignMarketById(String marketId) {
       CampaignDto campaignDto= campaignRepository.findById(marketId).map(CampaignDtoConverter::convert).orElse(new CampaignDto());
        return campaignDto;
    }

    public CampaignDto crateCampaign(CreateCampaignRequest createCampaignRequest) {
        Campaign campaign=new Campaign();
        campaign.setId(createCampaignRequest.getId());
        campaign.setActive(createCampaignRequest.isActive());
        campaign.setSaleRate(createCampaignRequest.getSaleRate());
        campaign.setMarketId(createCampaignRequest.getMarketId());

        return  campaignDtoConverter.convert(campaignRepository.save(campaign));
    }
}
