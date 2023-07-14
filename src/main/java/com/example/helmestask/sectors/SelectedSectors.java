package com.example.helmestask.sectors;

import com.example.helmestask.submit.Form;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "selected_sectors")
public class SelectedSectors {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "form_id")
  private Form form;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "sector_id")
  private Sector sector;

}
