package com.example.helmestask.sectors;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.helmestask.dtos.SectorDto;

import jakarta.annotation.Resource;

@Service
public class SectorService {

  @Resource
  private SectorsRepository sectorsRepository;

  @Resource
  private SectorsMapper sectorsMapper;

  public List<SectorDto> getSectors() {

    List<SectorDto> sectors = sectorsMapper.toDtos(sectorsRepository.findAll());

    return sectors;
  };
}