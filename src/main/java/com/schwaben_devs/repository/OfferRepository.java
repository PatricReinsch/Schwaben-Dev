package com.schwaben_devs.repository;

import com.schwaben_devs.model.Offer;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface OfferRepository extends CrudRepository<Offer, Long>{
}
