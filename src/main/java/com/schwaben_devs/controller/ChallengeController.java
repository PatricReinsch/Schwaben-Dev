package com.schwaben_devs.controller;

import com.schwaben_devs.motomatch.api.ChallengeApi;
import com.schwaben_devs.motomatch.model.CreateOffersRequest;
import com.schwaben_devs.motomatch.model.GetOffers200Response;
import com.schwaben_devs.motomatch.model.GetOffersCarTypeParameter;
import com.schwaben_devs.motomatch.model.GetOffersSortOrderParameter;

import java.math.BigDecimal;

public class ChallengeController implements ChallengeApi {
    @Override
    public void cleanupData() {

    }

    @Override
    public void createOffers(CreateOffersRequest createOffersRequest) {

    }

    @Override
    public GetOffers200Response getOffers(Integer regionID, Long timeRangeStart, Long timeRangeEnd, Integer numberDays, GetOffersSortOrderParameter sortOrder, Long page, Long pageSize, Long priceRangeWidth, Long minFreeKilometerWidth, Integer minNumberSeats, BigDecimal minPrice, BigDecimal maxPrice, GetOffersCarTypeParameter carType, Boolean onlyVollkasko, Integer minFreeKilometer) {
        return null;
    }
}
