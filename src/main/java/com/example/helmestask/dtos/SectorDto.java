package com.example.helmestask.dtos;

import java.util.List;

import lombok.Data;

@Data
public class SectorDto {

  private Integer sectorId;

  private String sectorName;

  private String parentId;

  private List<SectorDto> sectorChildren;

}
