package com.example.helmestask.sectors;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "sectors")
public class Sector {

  @Id
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "sectorname", nullable = false, length = 100)
  private String sectorname;

  @JoinColumn(name = "parent_id")
  private Integer parent_id;
}
