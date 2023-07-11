package com.example.helmestask.sectors;

import java.util.List;

import org.mapstruct.*;

import com.example.helmestask.dtos.SectorDto;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface SectorsMapper {
  @Mapping(source = "id", target = "sectorId")
  @Mapping(source = "sectorname", target = "sectorName")
  @Mapping(source = "parent_id", target = "parentId")
  @Mapping(source = "level", target = "level")

  SectorDto toDto(Sector sector);

  List<SectorDto> toDtos(List<Sector> sectors);

}
