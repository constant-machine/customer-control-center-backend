package com.constantmachine.customercontrolcenter.service;

import com.constantmachine.customercontrolcenter.dao.entity.Customer;
import com.constantmachine.customercontrolcenter.dao.entity.Project;
import com.constantmachine.customercontrolcenter.dao.repository.ProjectRepository;
import com.constantmachine.customercontrolcenter.service.dto.ProjectDto;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Profile("!dbless")
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    private final CustomerService customerService;

    @Override
    public Project getProject(Long id) {
        return projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Project not found"));
    }

    @Override
    @Transactional
    public Project createProject(ProjectDto project) {
        Customer customer = customerService.getCustomer(project.getCustomerId());
        return projectRepository.save(mapDtoToProject(project, customer));
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
    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }

    private Project mapDtoToProject(ProjectDto project, Customer customer) {
        return Project.builder()
                .id(project.getId())
                .customer(customer)
                .projectName(project.getProjectName())
                .description(project.getDescription())
                .build();
    }
}
