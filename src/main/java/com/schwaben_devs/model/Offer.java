/*
 * Competitor API
 * Web-facing API for the challenge
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.schwaben_devs.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/**
 * Offer
 */
@Serdeable
@JsonPropertyOrder({
    Offer.JSON_PROPERTY_I_D,
    Offer.JSON_PROPERTY_DATA,
    Offer.JSON_PROPERTY_MOST_SPECIFIC_REGION_I_D,
    Offer.JSON_PROPERTY_START_DATE,
    Offer.JSON_PROPERTY_END_DATE,
    Offer.JSON_PROPERTY_NUMBER_SEATS,
    Offer.JSON_PROPERTY_PRICE,
    Offer.JSON_PROPERTY_CAR_TYPE,
    Offer.JSON_PROPERTY_HAS_VOLLKASKO,
    Offer.JSON_PROPERTY_FREE_KILOMETERS
})
@Entity
public class Offer {
    public static final String JSON_PROPERTY_I_D = "OfferID";
    public static final String JSON_PROPERTY_DATA = "data";
    public static final String JSON_PROPERTY_MOST_SPECIFIC_REGION_I_D = "RegionID";
    public static final String JSON_PROPERTY_START_DATE = "StartTimestamp";
    public static final String JSON_PROPERTY_END_DATE = "EndTimestamp";
    public static final String JSON_PROPERTY_NUMBER_SEATS = "NumberSeats";
    public static final String JSON_PROPERTY_NUMBER_DAYS = "NumberDays";
    public static final String JSON_PROPERTY_PRICE = "Price";
    public static final String JSON_PROPERTY_CAR_TYPE = "CarType";
    public static final String JSON_PROPERTY_HAS_VOLLKASKO = "HasVollkasko";
    public static final String JSON_PROPERTY_FREE_KILOMETERS = "FreeKilometers";

    /**
     * The unique identifier of the offer
     */
    @NonNull
    @JsonProperty(JSON_PROPERTY_I_D)
    @Id
    private UUID ID;

    /**
     * Additional data for the offer, that is not used for filtering. For simplicity, this is just a base64 encoded 256 Byte array
     */
    @NonNull
    @JsonProperty(JSON_PROPERTY_DATA)
    private byte[] data;

    /**
     * The id of the most specific region the offer belongs to. This is always a leaf node.
     */
    @NonNull
    @JsonProperty(JSON_PROPERTY_MOST_SPECIFIC_REGION_I_D)
    @Column(name = JSON_PROPERTY_MOST_SPECIFIC_REGION_I_D, nullable = false)
    private Integer mostSpecificRegionID;

    /**
     * The start date of the offer in ms since UNIX epoch
     */
    @NonNull
    @JsonProperty(JSON_PROPERTY_START_DATE)
    @Column(name = JSON_PROPERTY_START_DATE, nullable = false)
    private Long startDate;

    /**
     * The end date of the offer in ms since UNIX epoch
     */
    @NonNull
    @JsonProperty(JSON_PROPERTY_END_DATE)
    @Column(name = JSON_PROPERTY_END_DATE, nullable = false)
    private Long endDate;

    /**
     * The number of seats the car has
     */
    @NonNull
    @JsonProperty(JSON_PROPERTY_NUMBER_SEATS)
    @Column(name = JSON_PROPERTY_NUMBER_SEATS, nullable = false)
    private Integer numberSeats;

    /**
     * The price in cents
     */
    @NonNull
    @JsonProperty(JSON_PROPERTY_PRICE)
    @Column(name = JSON_PROPERTY_PRICE, nullable = false)
    private Integer price;

    /**
     * The car types the offer belongs to
     */
    @NonNull
    @JsonProperty(JSON_PROPERTY_CAR_TYPE)
    @Column(name = JSON_PROPERTY_CAR_TYPE, nullable = false)
    private String carType;

    /**
     * Whether the offer has Vollkasko
     */
    @NonNull
    @JsonProperty(JSON_PROPERTY_HAS_VOLLKASKO)
    @Column(name = JSON_PROPERTY_HAS_VOLLKASKO, nullable = false)
    private Boolean hasVollkasko;

    /**
     * The number of kilometers included for free
     */
    @NonNull
    @JsonProperty(JSON_PROPERTY_FREE_KILOMETERS)
    @Column(name = JSON_PROPERTY_FREE_KILOMETERS, nullable = false)
    private Integer freeKilometers;

    public Offer(UUID ID, byte[] data, Integer mostSpecificRegionID, Long startDate, Long endDate, Integer numberSeats, Integer price, String carType, Boolean hasVollkasko, Integer freeKilometers) {
        this.ID = ID;
        this.data = data;
        this.mostSpecificRegionID = mostSpecificRegionID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.numberSeats = numberSeats;
        this.price = price;
        this.carType = carType;
        this.hasVollkasko = hasVollkasko;
        this.freeKilometers = freeKilometers;
    }

    public Offer() {

    }

    /**
     * The unique identifier of the offer
     *
     * @return the ID property value
     */
    public UUID getID() {
        return ID;
    }

    /**
     * Set the ID property value
     *
     * @param ID property value to set
     */
    public void setID(UUID ID) {
        this.ID = ID;
    }

    /**
     * Set ID in a chainable fashion.
     *
     * @return The same instance of Offer for chaining.
     */
    public Offer ID(UUID ID) {
        this.ID = ID;
        return this;
    }

    /**
     * Additional data for the offer, that is not used for filtering. For simplicity, this is just a base64 encoded 256 Byte array
     *
     * @return the data property value
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Set the data property value
     *
     * @param data property value to set
     */
    public void setData(byte[] data) {
        this.data = data;
    }

    /**
     * Set data in a chainable fashion.
     *
     * @return The same instance of Offer for chaining.
     */
    public Offer data(byte[] data) {
        this.data = data;
        return this;
    }

    /**
     * The id of the most specific region the offer belongs to. This is always a leaf node.
     *
     * @return the mostSpecificRegionID property value
     */
    public Integer getMostSpecificRegionID() {
        return mostSpecificRegionID;
    }

    /**
     * Set the mostSpecificRegionID property value
     *
     * @param mostSpecificRegionID property value to set
     */
    public void setMostSpecificRegionID(Integer mostSpecificRegionID) {
        this.mostSpecificRegionID = mostSpecificRegionID;
    }

    /**
     * Set mostSpecificRegionID in a chainable fashion.
     *
     * @return The same instance of Offer for chaining.
     */
    public Offer mostSpecificRegionID(Integer mostSpecificRegionID) {
        this.mostSpecificRegionID = mostSpecificRegionID;
        return this;
    }

    /**
     * The start date of the offer in ms since UNIX epoch
     *
     * @return the startDate property value
     */
    public Long getStartDate() {
        return startDate;
    }

    /**
     * Set the startDate property value
     *
     * @param startDate property value to set
     */
    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    /**
     * Set startDate in a chainable fashion.
     *
     * @return The same instance of Offer for chaining.
     */
    public Offer startDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * The end date of the offer in ms since UNIX epoch
     *
     * @return the endDate property value
     */
    public Long getEndDate() {
        return endDate;
    }

    /**
     * Set the endDate property value
     *
     * @param endDate property value to set
     */
    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    /**
     * Set endDate in a chainable fashion.
     *
     * @return The same instance of Offer for chaining.
     */
    public Offer endDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * The number of seats the car has
     *
     * @return the numberSeats property value
     */
    public Integer getNumberSeats() {
        return numberSeats;
    }

    /**
     * Set the numberSeats property value
     *
     * @param numberSeats property value to set
     */
    public void setNumberSeats(Integer numberSeats) {
        this.numberSeats = numberSeats;
    }

    /**
     * Set numberSeats in a chainable fashion.
     *
     * @return The same instance of Offer for chaining.
     */
    public Offer numberSeats(Integer numberSeats) {
        this.numberSeats = numberSeats;
        return this;
    }

    /**
     * The price in cents
     *
     * @return the price property value
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * Set the price property value
     *
     * @param price property value to set
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * Set price in a chainable fashion.
     *
     * @return The same instance of Offer for chaining.
     */
    public Offer price(Integer price) {
        this.price = price;
        return this;
    }

    /**
     * The car types the offer belongs to
     *
     * @return the carType property value
     */
    public String getCarType() {
        return carType;
    }

    /**
     * Set the carType property value
     *
     * @param carType property value to set
     */
    public void setCarType(String carType) {
        this.carType = carType;
    }

    /**
     * Set carType in a chainable fashion.
     *
     * @return The same instance of Offer for chaining.
     */
    public Offer carType(String carType) {
        this.carType = carType;
        return this;
    }

    /**
     * Whether the offer has Vollkasko
     *
     * @return the hasVollkasko property value
     */
    public Boolean getHasVollkasko() {
        return hasVollkasko;
    }

    /**
     * Set the hasVollkasko property value
     *
     * @param hasVollkasko property value to set
     */
    public void setHasVollkasko(Boolean hasVollkasko) {
        this.hasVollkasko = hasVollkasko;
    }

    /**
     * Set hasVollkasko in a chainable fashion.
     *
     * @return The same instance of Offer for chaining.
     */
    public Offer hasVollkasko(Boolean hasVollkasko) {
        this.hasVollkasko = hasVollkasko;
        return this;
    }

    /**
     * The number of kilometers included for free
     *
     * @return the freeKilometers property value
     */
    public Integer getFreeKilometers() {
        return freeKilometers;
    }

    /**
     * Set the freeKilometers property value
     *
     * @param freeKilometers property value to set
     */
    public void setFreeKilometers(Integer freeKilometers) {
        this.freeKilometers = freeKilometers;
    }

    /**
     * Set freeKilometers in a chainable fashion.
     *
     * @return The same instance of Offer for chaining.
     */
    public Offer freeKilometers(Integer freeKilometers) {
        this.freeKilometers = freeKilometers;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Offer offer = (Offer) o;
        return Objects.equals(ID, offer.ID) &&
            Arrays.equals(data, offer.data) &&
            Objects.equals(mostSpecificRegionID, offer.mostSpecificRegionID) &&
            Objects.equals(startDate, offer.startDate) &&
            Objects.equals(endDate, offer.endDate) &&
            Objects.equals(numberSeats, offer.numberSeats) &&
            Objects.equals(price, offer.price) &&
            Objects.equals(carType, offer.carType) &&
            Objects.equals(hasVollkasko, offer.hasVollkasko) &&
            Objects.equals(freeKilometers, offer.freeKilometers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, Arrays.hashCode(data), mostSpecificRegionID, startDate, endDate, numberSeats, price, carType, hasVollkasko, freeKilometers);
    }

    @Override
    public String toString() {
        return "Offer("
            + "ID: " + getID() + ", "
            + "data: " + getData() + ", "
            + "mostSpecificRegionID: " + getMostSpecificRegionID() + ", "
            + "startDate: " + getStartDate() + ", "
            + "endDate: " + getEndDate() + ", "
            + "numberSeats: " + getNumberSeats() + ", "
            + "price: " + getPrice() + ", "
            + "carType: " + getCarType() + ", "
            + "hasVollkasko: " + getHasVollkasko() + ", "
            + "freeKilometers: " + getFreeKilometers()
            + ")";
    }

}