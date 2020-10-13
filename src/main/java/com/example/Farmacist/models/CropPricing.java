package com.example.Farmacist.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Document("crop_pricing")
public class CropPricing {
    @JsonProperty(value = "state")
    @Column(name = "state")
    private String state;

    @JsonProperty(value = "district")
    @Column(name = "district")
    private String district;

    @JsonProperty(value = "market")
    @Column(name = "market")
    private String market;

    @JsonProperty(value = "commodity")
    @Column(name = "commodity")
    private String commodity;

    @JsonProperty(value = "variety")
    @Column(name = "variety")
    private String variety;

    @JsonProperty(value = "arrival_Date")
    @Column(name = "arrival_Date")
    private String arrival_Date;

    @JsonProperty(value = "min_x0020_Price")
    @Column(name = "min_x0020_Price")
    private double min_x0020_Price;

    @JsonProperty(value = "max_x0020_Price")
    @Column(name = "max_x0020_Price")
    private double max_x0020_Price;

    @JsonProperty(value = "modal_x0020_Price")
    @Column(name = "modal_x0020_Price")
    private double modal_x0020_Price;
}
