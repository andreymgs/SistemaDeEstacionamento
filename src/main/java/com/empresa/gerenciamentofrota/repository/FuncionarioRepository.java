package com.empresa.gerenciamentofrota.repository;

import com.empresa.gerenciamentofrota.model.Funcionario;
import java.util.List;

public interface FuncionarioRepository {
    List<Funcionario> findByDataNascimentoMonth(int mes);
    List<Funcionario> findByPenalizacoesIsNotNull();
}
