package com.empresa.gerenciamentofrota.repository;

import com.empresa.gerenciamentofrota.model.Veiculo;
import java.util.List;

public interface VeiculoRepository {
    List<Veiculo> findByAnoCompra(int anoCompra);
    List<Veiculo> findByModelo(String modelo);
    List<Veiculo> findTop3ByOrderByQuilometragemDesc();
}
