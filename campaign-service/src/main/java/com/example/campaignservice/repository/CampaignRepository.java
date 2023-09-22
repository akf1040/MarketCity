package com.example.campaignservice.repository;

import com.example.campaignservice.model.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepository extends JpaRepository<Campaign,String> {
}
