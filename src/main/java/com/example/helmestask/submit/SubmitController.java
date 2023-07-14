package com.example.helmestask.submit;

import org.springframework.web.bind.annotation.RestController;

import com.example.helmestask.dtos.FormDto;

import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;

@RestController
public class SubmitController {

  @Resource
  private SubmitService submitService;

  @PostMapping("/submit/new")
  @Operation(summary = "Creates new form submition", description = "Inserts new submition to the DB")
  public void submitNew(@RequestBody FormDto form) {
    submitService.submitNew(form);
  }
}
