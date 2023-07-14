package com.example.helmestask.submit;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.helmestask.sectors.SelectedSectors;

public interface SelectedSectorsRepository extends JpaRepository<SelectedSectors, Integer> {

}
