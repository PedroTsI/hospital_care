package com.example.hospital_care.controller;

import com.example.hospital_care.model.Medico;
import com.example.hospital_care.repository.MedicoRepository;
import com.example.hospital_care.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping("/paciente")
public class PacienteController {
    @Autowired
    MedicoRepository medicoRepository;

    @Autowired
    PacienteRepository pacienteRepository;

    @GetMapping
    public List<Medico> getMedicos(){
        return medicoRepository.findAll();
    }

}
