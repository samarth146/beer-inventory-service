package com.inventory.service.services;


import com.brewery.model.BeerOrderDto;

/**
 * Created by jt on 2019-09-09.
 */
public interface AllocationService {

    Boolean allocateOrder(BeerOrderDto beerOrderDto);

    void deallocateOrder(BeerOrderDto beerOrderDto);
}
