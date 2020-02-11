package com.nttdata.springboot.poc.ppmtool.services;

import com.nttdata.springboot.poc.ppmtool.domain.Project;
import com.nttdata.springboot.poc.ppmtool.exceptions.ProjectIdException;
import com.nttdata.springboot.poc.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project) {
        try {
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return projectRepository.save(project);
        } catch (Exception e) {
            throw new ProjectIdException("Project ID '" + project.getProjectIdentifier().toUpperCase() + "' already exists");
        }
    }

}
