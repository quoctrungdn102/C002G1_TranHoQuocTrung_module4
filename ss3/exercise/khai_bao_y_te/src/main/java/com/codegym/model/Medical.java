package com.codegym.model;

public class Medical {
    private String name;
    private String birthDay;
    private String gender;
    private String country;
    private String passport;
    private String transport;
    private String vehicleNumber;
    private String seats;
    private Integer startDay;
    private Integer startMonth;
    private Integer startYear;
    private String endDay;
    private String endMonth;
    private String endYear;
    private String goOut;



    public Integer getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(Integer startMonth) {
        this.startMonth = startMonth;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public String getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(String endMonth) {
        this.endMonth = endMonth;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public Medical(String name, String birthDay, String gender, String country, String passport, String transport, String vehicleNumber, String seats, Integer startDay, String endDay, String goOut) {

        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.country = country;
        this.passport = passport;
        this.transport = transport;
        this.vehicleNumber = vehicleNumber;
        this.seats = seats;
        this.startDay = startDay;
        this.endDay = endDay;
        this.goOut = goOut;
    }

    public Medical() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public Integer getStartDay() {
        return startDay;
    }

    public void setStartDay(Integer startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getGoOut() {
        return goOut;
    }

    public void setGoOut(String goOut) {
        this.goOut = goOut;
    }
}
