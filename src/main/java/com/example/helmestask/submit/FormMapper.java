package com.example.helmestask.submit;

import org.mapstruct.*;

import com.example.helmestask.dtos.FormDto;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface FormMapper {
  @Mapping(source = "name", target = "name")
  @Mapping(source = "terms", target = "terms")

  FormDto toDto(Form form);

  Form toEntity(FormDto formDto);

}
