package com.example.priceservice.model;

public class Price {
    String country;
    Double price;
    public Price(){

    }

    public Price(String country, Double price) {
        this.country = country;
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
