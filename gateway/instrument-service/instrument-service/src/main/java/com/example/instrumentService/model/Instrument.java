package com.example.instrumentService.model;

public class Instrument {
    String country;
    String instrument;

    public Instrument() {
    }

    public Instrument(String country, String instrument) {
        this.country = country;
        this.instrument = instrument;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }
}
