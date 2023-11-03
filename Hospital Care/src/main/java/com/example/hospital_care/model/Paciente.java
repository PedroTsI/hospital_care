package com.example.hospital_care.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "pacientes")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Getter
    @NotBlank(message = "Campo Obrigatorio!")
    @Column(name = "name", nullable = false)
    private String name;

    @Getter
    private String telefone;

    @Getter
    private String sexo;

    @Getter
    private String cpf;

    @Getter
    private Date data_de_nascimento;

    @Getter
    private String email;

    @Getter
    private String prontuario;

    @Getter
    private String anamnese;

    public void setName(String name) {
        this.name = name;
    }

    public void setAnamnese(String anamnese) {
        this.anamnese = anamnese;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        if(cpf.length() != 11)
            throw new IllegalArgumentException("CPF deve conter 11 digitos!");
        if(cpf.isBlank())
            throw new IllegalArgumentException("CPF nao pode ser vazio!");
        if(cpf.matches(".*[a-zA-Z]+.*"))
            throw new IllegalArgumentException("CPF nao pode conter caracteres especiais!");
        this.cpf = cpf;
    }

    public void setData_de_nascimento(Date data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }

    public void setEmail(String email) {
        if(email.isBlank())
            throw new IllegalArgumentException("Email nao pode ser vazio!");
        if(!email.contains("@"))
            throw new IllegalArgumentException("Email deve conter @!");
        this.email = email;
    }

    public Paciente(String name, String telefone, String sexo, String email, String cpf) {
        this.name = name;
        this.telefone = telefone;
        this.sexo = sexo;
        this.email = email;
        this.cpf = cpf;
    }
}
