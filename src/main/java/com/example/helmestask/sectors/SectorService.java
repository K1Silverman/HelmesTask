package com.example.helmestask.sectors;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.helmestask.dtos.SectorDto;

import jakarta.annotation.Resource;

@Service
public class SectorService {

  @Resource
  private SectorsRepository sectorsRepository;

  public List<List<SectorDto>> getSectors() {

    List<Sector> sector = sectorsRepository.findAll();

    // TODO: Tee siia meetod, mis viiks kokku parentid childidega ja lõpuks paneks
    // Listi

    return null;
  }
}