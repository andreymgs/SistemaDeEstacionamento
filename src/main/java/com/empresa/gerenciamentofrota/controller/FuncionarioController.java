package com.empresa.gerenciamentofrota.controller;

import com.empresa.gerenciamentofrota.model.Funcionario;
import com.empresa.gerenciamentofrota.service.FuncionarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    private final FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping("/aniversariantes/{mes}")
    public List<Funcionario> getFuncionariosAniversariantes(@PathVariable int mes) {
        return funcionarioService.getFuncionariosAniversariantesMes(mes);
    }

    @GetMapping("/penalizacoes")
    public List<Funcionario> getFuncionariosComPenalizacoes() {
        return funcionarioService.getFuncionariosComPenalizacoes();
    }
}
