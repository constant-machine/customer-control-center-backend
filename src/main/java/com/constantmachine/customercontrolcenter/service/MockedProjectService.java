package com.constantmachine.customercontrolcenter.service;

import com.constantmachine.customercontrolcenter.dao.entity.Project;
import com.constantmachine.customercontrolcenter.service.dto.ProjectDto;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("dbless")
public class MockedProjectService implements ProjectService {

    private final Project chat = Project.builder()
            .id(123L)
            .projectName("Fake expert")
            .description("Yet another chatGPT project")
            .build();

    private final Project notChat = Project.builder()
            .id(124L)
            .projectName("Not chat at all")
            .description("Not a chat, I promise! (secretly is a chat)")
            .build();

    @Override
    public Project getProject(Long id) {
        return chat;
    }

    @Override
    public Project createProject(ProjectDto project) {
        return chat;
    }

    @Override
    public Project updateProject(Project project) {
        return chat;
    }

    @Override
    public List<Project> listProjects() {
        return List.of(chat, notChat);
    }

    @Override
    public void deleteProject(Project project) {
    }
}
