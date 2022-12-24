package com.inventory.service.web.mappers;

import com.brewery.model.BeerInventoryDto;
import com.brewery.model.BeerInventoryDto.BeerInventoryDtoBuilder;
import com.inventory.service.domain.BeerInventory;
import com.inventory.service.domain.BeerInventory.BeerInventoryBuilder;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-24T13:27:07+0530",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.100.v20220318-0906, environment: Java 17.0.4 (Eclipse Adoptium)"
)
@Component
public class BeerInventoryMapperImpl implements BeerInventoryMapper {

    @Autowired
    private DateMapper dateMapper;

    @Override
    public BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO) {
        if ( beerInventoryDTO == null ) {
            return null;
        }

        BeerInventoryBuilder beerInventory = BeerInventory.builder();

        beerInventory.beerId( beerInventoryDTO.getBeerId() );
        beerInventory.createdDate( dateMapper.asTimestamp( beerInventoryDTO.getCreatedDate() ) );
        beerInventory.id( beerInventoryDTO.getId() );
        beerInventory.lastModifiedDate( dateMapper.asTimestamp( beerInventoryDTO.getLastModifiedDate() ) );
        beerInventory.quantityOnHand( beerInventoryDTO.getQuantityOnHand() );
        beerInventory.upc( beerInventoryDTO.getUpc() );

        return beerInventory.build();
    }

    @Override
    public BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory) {
        if ( beerInventory == null ) {
            return null;
        }

        BeerInventoryDtoBuilder beerInventoryDto = BeerInventoryDto.builder();

        beerInventoryDto.beerId( beerInventory.getBeerId() );
        beerInventoryDto.createdDate( dateMapper.asOffsetDateTime( beerInventory.getCreatedDate() ) );
        beerInventoryDto.id( beerInventory.getId() );
        beerInventoryDto.lastModifiedDate( dateMapper.asOffsetDateTime( beerInventory.getLastModifiedDate() ) );
        beerInventoryDto.quantityOnHand( beerInventory.getQuantityOnHand() );
        beerInventoryDto.upc( beerInventory.getUpc() );

        return beerInventoryDto.build();
    }
}
