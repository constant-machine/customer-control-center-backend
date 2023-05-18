package com.constantmachine.customercontrolcenter.service;

import com.constantmachine.customercontrolcenter.dao.entity.Project;
import com.constantmachine.customercontrolcenter.dao.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    @Override
    public Project getProject(Long id) {
        return projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Project not found"));
    }

    @Override
    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    @Transactional
    public Project updateProject(Project project) {
        this.getProject(project.getId());
        return projectRepository.save(project);
    }

    @Override
    public List<Project> listProjects() {
        return projectRepository.findAll();
    }

    @Override
    public void deleteProject(Project project) {
        projectRepository.delete(project);
    }
}
