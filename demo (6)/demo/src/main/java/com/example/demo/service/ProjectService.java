package com.example.demo.service;

import com.example.demo.entity.MyEmployee;
import com.example.demo.entity.Project;
import com.example.demo.repository.MyEmployeeRepo;
import com.example.demo.repository.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepo projetRepository;
    @Autowired
    private MyEmployeeRepo employeeRepo;

    public List<Project> findAll() {
        return projetRepository.findAll();
    }

    public Project save(Project projet) {
        return projetRepository.save(projet);
    }

    public void assignEmployeToProjet(Long projetId, Long employeId) {
        Project projet = projetRepository.findById(projetId).orElseThrow();
        MyEmployee employe = employeeRepo.findById(employeId).orElseThrow();
        projet.getEmployes().add(employe);
        projetRepository.save(projet);
    }
}
