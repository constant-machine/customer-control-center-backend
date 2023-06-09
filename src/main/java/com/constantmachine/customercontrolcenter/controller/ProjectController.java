package com.constantmachine.customercontrolcenter.controller;

import com.constantmachine.customercontrolcenter.dao.entity.Project;
import com.constantmachine.customercontrolcenter.service.dto.ProjectDto;

import java.util.List;

public interface ProjectController {
    Project getProject(Long id);
    Project createProject(ProjectDto project);
    Project updateProject(Project project);
    List<Project> listProjects();
    void deleteProject(Long id);
}
