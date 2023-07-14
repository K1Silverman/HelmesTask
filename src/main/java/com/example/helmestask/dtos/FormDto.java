package com.example.helmestask.dtos;

import lombok.Data;
import java.util.List;

@Data
public class FormDto {

  private String name;

  private List<Integer> sectors;

  private Boolean terms;
}
