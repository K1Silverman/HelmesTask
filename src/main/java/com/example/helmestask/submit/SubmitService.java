package com.example.helmestask.submit;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.helmestask.dtos.FormDto;
import com.example.helmestask.sectors.Sector;
import com.example.helmestask.sectors.SectorsRepository;
import com.example.helmestask.sectors.SelectedSectors;

import jakarta.annotation.Resource;

@Service
public class SubmitService {

  @Resource
  private FormMapper formMapper;

  @Resource
  private FormRepository formRepository;

  @Resource
  private SectorsRepository sectorsRepository;

  @Resource
  private SelectedSectorsRepository selectedSectorsRepository;

  public void submitNew(FormDto form) {
    List<Integer> sectors = form.getSectors();

    Form formEntity = formMapper.toEntity(form);
    formRepository.save(formEntity);

    for (int i = 0; i < sectors.size(); i++) {

      SelectedSectors selectedSector = new SelectedSectors();

      selectedSector.setForm(formEntity);

      Integer sectorId = sectors.get(i);

      Optional<Sector> sector = sectorsRepository.findById(sectorId);

      selectedSector.setSector(sector.get());

      selectedSectorsRepository.save(selectedSector);

    }

  }
}
