package com.constantmachine.customercontrolcenter.service;

import com.constantmachine.customercontrolcenter.dao.entity.Project;
import com.constantmachine.customercontrolcenter.service.dto.ProjectDto;

import java.util.List;

public interface ProjectService {
    Project getProject(Long id);
    Project createProject(ProjectDto project);
    Project updateProject(Project project);
    List<Project> listProjects();
    void deleteProject(Project project);
}
