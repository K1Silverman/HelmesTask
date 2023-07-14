package com.example.helmestask.sectors;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.helmestask.dtos.SectorDto;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;

@RestController
public class SectorsController {

  @Resource
  private SectorService sectorService;

  @GetMapping("/sectors")
  @Operation(summary = "Returns all sectors", description = "Querys all sectors from DB")
  public List<SectorDto> getSectors() {
    return sectorService.getSectors();
  }

}