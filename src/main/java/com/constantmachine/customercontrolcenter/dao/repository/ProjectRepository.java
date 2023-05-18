package com.constantmachine.customercontrolcenter.dao.repository;

import com.constantmachine.customercontrolcenter.dao.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
