package com.example.hospital_care.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "medico")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Campo Obrigatorio!")
    @Column(name = "name", nullable = false)
    private String name;

    @NotBlank(message = "Campo Obrigatorio!")
    private String crm;

}
