package com.schwaben_devs.repository;

import com.schwaben_devs.model.Offer;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.UUID;

@Repository
public interface OfferRepository extends CrudRepository<Offer, UUID>{
    Offer findByMostSpecificRegionID(Integer mostSpecificRegionID);
}
