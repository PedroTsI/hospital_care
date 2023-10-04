package com.example.hospital_care.controller;

import com.example.hospital_care.repository.MedicoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/medico")
public class MedicoController {

    @Resource
    private MedicoRepository medicoRepository;
}

