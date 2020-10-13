package com.example.Farmacist.Repository;

import com.example.Farmacist.models.CropPricing;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CropPricingRepository extends MongoRepository<CropPricing,String> {

    List<CropPricing> findByCommodity(String commodity);

    List<CropPricing> findByMarket(String market);

    List<CropPricing> findByState(String state);
}
