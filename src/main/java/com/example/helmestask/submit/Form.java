package com.example.helmestask.submit;

import lombok.Data;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "form")
public class Form {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;

  @NotNull
  @Column(name = "name", nullable = false)
  private String name;

  @NotNull
  @Column(name = "terms", nullable = false)
  private Boolean terms;

}
