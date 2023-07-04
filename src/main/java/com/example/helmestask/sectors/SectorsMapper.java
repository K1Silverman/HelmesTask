package com.example.helmestask.sectors;

import org.mapstruct.*;

import com.example.helmestask.dtos.SectorDto;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface SectorsMapper {
  @Mapping(source = "id", target = "sectorId")
  @Mapping(source = "sectorname", target = "sectorName")
  @Mapping(source = "parent_id", target = "parentId")

  SectorDto toDto(Sector sector);
}
