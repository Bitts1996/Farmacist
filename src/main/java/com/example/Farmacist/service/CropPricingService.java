package com.example.Farmacist.service;

import com.example.Farmacist.Repository.CropPricingRepository;
import com.example.Farmacist.exception.InternalServerException;
import com.example.Farmacist.models.CropPricing;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CropPricingService {
    @Autowired
    CropPricingRepository cropPricingRepository;

    public List<CropPricing> getAllCropPricingDetails(){
        List<CropPricing> cropPricingList = new ArrayList<>();
        try{
            cropPricingList = cropPricingRepository.findAll();
        }
        catch (Exception e){
            throw new InternalServerException();
        }
        return cropPricingList;
    }

    public List<CropPricing> getCropPricingDetailsByCommodity(String commodity){
        List<CropPricing> cropPricingList = new ArrayList<>();
        try{
            cropPricingList = cropPricingRepository.findByCommodity(commodity);
        }
        catch(Exception e){
            throw new InternalServerException();
        }
        return cropPricingList;
    }

    public List<CropPricing> getCropPricingDetailsByMarket(String market){
        List<CropPricing> cropPricingList = new ArrayList<>();
        try{
            cropPricingList = cropPricingRepository.findByMarket(market);
        }
        catch(Exception e){
            throw new InternalServerException();
        }
        return cropPricingList;
    }

    public List<CropPricing> getCropPricingDetailsByState(String state){
        List<CropPricing> cropPricingList = new ArrayList<>();
        try{
            cropPricingList = cropPricingRepository.findByState(state);
        }
        catch(Exception e){
            throw new InternalServerException();
        }
        return cropPricingList;
    }

}
