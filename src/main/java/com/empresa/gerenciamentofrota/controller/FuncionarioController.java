package com.empresa.gerenciamentofrota.controller;

import com.empresa.gerenciamentofrota.model.Funcionario;
import com.empresa.gerenciamentofrota.service.FuncionarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
@RequestMapping("/funcionarios")
@Validated
public class FuncionarioController {
    private final FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping("/aniversariantes/{mes}")
    public ResponseEntity<List<Funcionario>> getFuncionariosAniversariantes(
            @PathVariable @Min(1) @Max(12) int mes) {
        List<Funcionario> funcionarios = funcionarioService.getFuncionariosAniversariantesMes(mes);
        return ResponseEntity.ok(funcionarios);
    }

    @GetMapping("/penalizacoes")
    public ResponseEntity<List<Funcionario>> getFuncionariosComPenalizacoes() {
        List<Funcionario> funcionarios = funcionarioService.getFuncionariosComPenalizacoes();
        return ResponseEntity.ok(funcionarios);
    }
}
