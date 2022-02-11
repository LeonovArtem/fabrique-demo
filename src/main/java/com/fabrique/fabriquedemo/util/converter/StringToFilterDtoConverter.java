package com.fabrique.fabriquedemo.util.converter;

import com.fabrique.fabriquedemo.Dto.FilterDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class StringToFilterDtoConverter implements Converter<String, FilterDto> {

    @Override
    public FilterDto convert(String source) {
        try {
            return new ObjectMapper().readValue(source, FilterDto.class);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
