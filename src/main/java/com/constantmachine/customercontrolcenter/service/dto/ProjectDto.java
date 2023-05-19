package com.constantmachine.customercontrolcenter.service.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class ProjectDto {

    private Long id;

    private Long customerId;

    private String projectName;

    private String description;

    private LocalDate creationDate;
}
