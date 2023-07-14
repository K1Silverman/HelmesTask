package com.example.helmestask.submit;

import org.mapstruct.*;

import com.example.helmestask.dtos.SelectedSectorDto;
import com.example.helmestask.sectors.SelectedSectors;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface SelectedSectorsMapper {

  @Mapping(source = "form_id", target = "form.id")
  @Mapping(source = "sector_id", target = "sector.id")
  SelectedSectors toEntity(SelectedSectorDto selectedSector);

}
