package com.inventory.service.web.mappers;

import com.inventory.service.domain.BeerInventory;
import com.brewery.model.BeerInventoryDto;
import org.mapstruct.Mapper;

/**
 * Created by jt on 2019-05-31.
 */
@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
