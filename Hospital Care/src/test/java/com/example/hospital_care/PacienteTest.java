package com.example.hospital_care;

import org.junit.jupiter.api.Test;

import com.example.hospital_care.model.Paciente;

import org.junit.jupiter.api.Assertions;

public class PacienteTest {

    @Test
    public void NaoDeveAlterarCpfComDigitosDiferentesDe11(){
        Paciente Paciente = new Paciente("Joao", "83999999921", "Masculino", "joao@email.com", "13421374312");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Paciente.setCpf("123456");
        });
    }

    @Test
    public void NaoDeveAlterarCpfVazio(){
        Paciente Paciente = new Paciente("Joao", "83999999921", "Masculino", "joao@email.com", "13421374312");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Paciente.setCpf("");
        });
    }

    @Test
    public void NaoDeveAlterarCpfComCaracteresEspeciais(){
        Paciente Paciente = new Paciente("Joao", "83999999921", "Masculino", "joao@email.com", "13421374312");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Paciente.setCpf("123456781*12");
        });
    }

    @Test
    public void NaoDeveAlterarEmailVazio(){
        Paciente Paciente = new Paciente("Joao", "83999999921", "Masculino", "joao@email.com", "13421374312");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Paciente.setEmail("");
        });
    }

    @Test
    public void NaoDeveterEmailSemArroba(){
        Paciente Paciente = new Paciente("Joao", "83999999921", "Masculino", "joao@email.com", "13421374312");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Paciente.setEmail("joaoemail.com");
        });
    }
}
