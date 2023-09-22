package com.example.campaignservice.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCampaignRequest {

    private String id;
    private double saleRate;
    private boolean active;
    private String marketId;
}
