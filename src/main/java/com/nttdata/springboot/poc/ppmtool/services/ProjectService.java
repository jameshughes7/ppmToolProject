package com.nttdata.springboot.poc.ppmtool.services;

import com.nttdata.springboot.poc.ppmtool.domain.Project;
import com.nttdata.springboot.poc.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){

        return projectRepository.save(project);
    }

}
