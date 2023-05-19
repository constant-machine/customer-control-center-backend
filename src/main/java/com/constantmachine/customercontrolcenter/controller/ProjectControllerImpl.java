package com.constantmachine.customercontrolcenter.controller;

import com.constantmachine.customercontrolcenter.dao.entity.Project;
import com.constantmachine.customercontrolcenter.service.ProjectService;
import com.constantmachine.customercontrolcenter.service.dto.ProjectDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ProjectControllerImpl implements ProjectController {

    private final ProjectService projectService;

    @Override
    @GetMapping("/project/{id}")
    public Project getProject(@PathVariable Long id) {
        return projectService.getProject(id);
    }

    @Override
    @PostMapping("/project")
    public Project createProject(@RequestBody ProjectDto project) {
        return projectService.createProject(project);
    }

    @Override
    @PutMapping("/project")
    public Project updateProject(@RequestBody Project project) {
        return projectService.updateProject(project);
    }

    @Override
    @GetMapping("/project/all")
    public List<Project> listProjects() {
        return projectService.listProjects();
    }

    @Override
    @DeleteMapping("/project")
    public void deleteProject(@RequestBody Project project) {
        projectService.deleteProject(project);
    }
}
