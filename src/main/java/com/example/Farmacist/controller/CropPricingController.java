package com.example.Farmacist.controller;

import com.example.Farmacist.Repository.GRegistrationRepository;
import com.example.Farmacist.exception.InternalServerException;
import com.example.Farmacist.models.CropPricing;
import com.example.Farmacist.models.Register;
import com.example.Farmacist.service.CropPricingService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api/v1/pricing")
@NoArgsConstructor
@Validated
public class CropPricingController {
    @Autowired
    CropPricingService cropPricingService;

    @GetMapping(value = "/getAllPricesDetails", produces = "application/json;charset=UTF-8")
    public ResponseEntity<Object> getAllCropPricingDetails(){
        List<CropPricing> cropPricingList = new ArrayList<>();
        try{
            cropPricingList = cropPricingService.getAllCropPricingDetails();
        }
        catch(Exception e){
            System.out.println(e.toString());
            throw new InternalServerException();
        }
        return new ResponseEntity<>( cropPricingList,HttpStatus.CREATED);
    }

    @GetMapping(params = { "commodity" }, produces = "application/json;charset=UTF-8")
    public ResponseEntity<Object> getCropPricingDetailsByCommodity(@RequestParam("commodity") String commodity){
        List<CropPricing> cropPricingList = new ArrayList<>();
        try{
         cropPricingList = cropPricingService.getCropPricingDetailsByCommodity(commodity);
        }
        catch(Exception e){
            System.out.println(e.toString());
            throw new InternalServerException();
        }
        return new ResponseEntity<>( cropPricingList,HttpStatus.CREATED);
    }

    @GetMapping(params = { "market" }, produces = "application/json;charset=UTF-8")
    public ResponseEntity<Object> getCropPricingDetailsByMarket(@RequestParam("market") String market){
        List<CropPricing> cropPricingList = new ArrayList<>();
        try{
            cropPricingList = cropPricingService.getCropPricingDetailsByMarket(market);
        }
        catch(Exception e){
            System.out.println(e.toString());
            throw new InternalServerException();
        }
        return new ResponseEntity<>( cropPricingList,HttpStatus.CREATED);
    }

    @GetMapping(params = { "state" }, produces = "application/json;charset=UTF-8")
    public ResponseEntity<Object> getCropPricingDetailsByState(@RequestParam("state") String state){
        List<CropPricing> cropPricingList = new ArrayList<>();
        try{
            cropPricingList = cropPricingService.getCropPricingDetailsByState(state);
        }
        catch(Exception e){
            System.out.println(e.toString());
            throw new InternalServerException();
        }
        return new ResponseEntity<>( cropPricingList,HttpStatus.CREATED);
    }
}
