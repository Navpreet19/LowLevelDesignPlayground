package com.bookmyshow.models;

public class Location {
    private String city;
    private String pin;
    private String address;

    public Location(String city, String pin, String address) {
        this.city = city;
        this.pin = pin;
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
