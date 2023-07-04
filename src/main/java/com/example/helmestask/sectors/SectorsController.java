package com.example.helmestask.sectors;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.helmestask.dtos.SectorDto;

@RestController
public class SectorsController {

  @GetMapping("/sectors")
  public List<List<SectorDto>> getSectors() {
    return getSectors();
  }
}