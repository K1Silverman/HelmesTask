package com.example.helmestask.dtos;

import lombok.Data;

@Data
public class SectorDto {

  private Integer sectorId;

  private String sectorName;

  private Integer parentId;

  private Integer level;

}
