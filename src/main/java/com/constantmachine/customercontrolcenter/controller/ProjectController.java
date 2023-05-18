package com.constantmachine.customercontrolcenter.controller;

import com.constantmachine.customercontrolcenter.dao.entity.Project;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ProjectController {
    Project getProject(Long id);
    Project createProject(Project project);
    Project updateProject(Project project);
    List<Project> listProjects();
    void deleteProject(Project project);
}
