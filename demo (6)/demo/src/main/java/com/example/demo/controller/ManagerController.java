package com.example.demo.controller;

import com.example.demo.service.EmployeeSrvice;
import com.example.demo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ManagerController {
    @Autowired
    private EmployeeSrvice employeService;

    @Autowired
    private ProjectService projetService;

    @GetMapping("/manager/affecter")
    public String showAffectationForm(Model model) {
        model.addAttribute("employes", employeService.findAll());
        model.addAttribute("projets", projetService.findAll());
        return "affecter";
    }

    @PostMapping("/manager/affecter")
    public String affecterEmploye(@RequestParam Long projetId, @RequestParam Long employeId) {
        projetService.assignEmployeToProjet(projetId, employeId);
        return "redirect:/manager/affecter";
    }

    @GetMapping("/manager/employe-list")
    public String showEmployeList(Model model) {
        model.addAttribute("employes", employeService.findAll());
        return "employe-list";
    }
}
