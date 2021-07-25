package com.example.msscbeerser.web.mappers;

import com.example.msscbeerser.domain.Beer;
import com.example.msscbeerser.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {
BeerDto BeerToBeerDto(Beer beer);
Beer BeerDtoToBeer(BeerDto beerDto);

}
