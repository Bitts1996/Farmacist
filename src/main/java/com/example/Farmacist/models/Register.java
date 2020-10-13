package com.example.Farmacist.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Getter
@Setter
public class Register {
    @JsonProperty(value = "company")
    @Column(name = "company")
    private String company;

    @JsonProperty(value = "productName")
    @Column(name = "productName")
    private String productName;

    @JsonProperty(value = "model")
    @Column(name = "model")
    private String model;

    @JsonProperty(value = "price")
    @Column(name = "price")
    private double price;

    @JsonProperty(value = "date")
    @Column(name = "date")
    private String date;

    @JsonProperty(value = "units")
    @Column(name = "units")
    private String units;

    @JsonProperty(value = "payment")
    @Column(name = "payment")
    private String payment;

    @JsonProperty(value = "email")
    @Column(name = "email")
    private String email;

    @JsonProperty(value = "geography")
    @Column(name = "geography")
    private String geography;

    @JsonProperty(value = "logistics")
    @Column(name = "logistics")
    private String logistics;

    @JsonProperty(value = "express")
    @Column(name = "express")
    private boolean express;

}
