package com.schwaben_devs.controller;

import com.schwaben_devs.model.*;
import com.schwaben_devs.repository.OfferRepository;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.math.BigDecimal;
import java.util.List;

@Controller("/api/offers")
public class ChallengeController {

    @Inject
    private OfferRepository offerRepository;

    @Delete
    public void cleanupData() {
        System.out.println("Cleaning up Data");
    }

    @Post
    public void createOffers(@Body CreateOffersRequest createOffersRequest
    ) {
        offerRepository.saveAll(createOffersRequest.getOffers());
    }

    @Get
    public GetOffers200Response getOffers(
            @QueryValue("regionID") Integer regionID,
            @QueryValue("timeRangeStart") Long timeRangeStart,
            @QueryValue("timeRangeEnd") Long timeRangeEnd,
            @QueryValue("numberDays") Integer numberDays,
            @QueryValue("sortOrder") GetOffersSortOrderParameter sortOrder,
            @QueryValue("page") Long page,
            @QueryValue("pageSize") Long pageSize,
            @QueryValue("priceRangeWidth") Long priceRangeWidth,
            @QueryValue("minFreeKilometerWidth") Long minFreeKilometerWidth,
            @QueryValue("minNumberSeats") @Nullable(inherited = true) Integer minNumberSeats,
            @QueryValue("minPrice") @Nullable(inherited = true) BigDecimal minPrice,
            @QueryValue("maxPrice") @Nullable(inherited = true) BigDecimal maxPrice,
            @QueryValue("carType") @Nullable(inherited = true) GetOffersCarTypeParameter carType,
            @QueryValue("onlyVollkasko") @Nullable(inherited = true) Boolean onlyVollkasko,
            @QueryValue("minFreeKilometer") @Nullable(inherited = true) Integer minFreeKilometer
    ) {
        System.out.println("Get Offers");
        GetOffers200Response response = new GetOffers200Response(null, null, null, null, null, null);
        Offer byMostSpecificRegionID = offerRepository.findByMostSpecificRegionID(regionID);
        SearchResultOffer searchResultOffer = new SearchResultOffer(byMostSpecificRegionID.getID(), byMostSpecificRegionID.getData());
        response.setOffers(List.of(searchResultOffer));
        return response;
    }
}
