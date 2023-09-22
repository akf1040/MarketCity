package com.example.marketservice.repository;

import com.example.marketservice.model.Market;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarketRepository extends JpaRepository<Market,String> {


}
