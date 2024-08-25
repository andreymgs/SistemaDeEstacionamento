package com.empresa.gerenciamentofrota.service;

import com.empresa.gerenciamentofrota.model.Funcionario;
import com.empresa.gerenciamentofrota.repository.FuncionarioRepository;
import java.util.List;

public class FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<Funcionario> getFuncionariosAniversariantesMes(int mes) {
        return funcionarioRepository.findByDataNascimentoMonth(mes);
    }

    public List<Funcionario> getFuncionariosComPenalizacoes() {
        return funcionarioRepository.findByPenalizacoesIsNotNull();
    }
}
