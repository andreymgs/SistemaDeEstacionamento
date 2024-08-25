package com.empresa.gerenciamentofrota.service;

import com.empresa.gerenciamentofrota.model.Veiculo;
import com.empresa.gerenciamentofrota.repository.VeiculoRepository;
import java.util.List;

public class VeiculoService {
    private final VeiculoRepository veiculoRepository;

    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    public List<Veiculo> getVeiculosPorAno(int anoCompra) {
        return veiculoRepository.findByAnoCompra(anoCompra);
    }

    public List<Veiculo> getVeiculosPorModelo(String modelo) {
        return veiculoRepository.findByModelo(modelo);
    }

    public List<Veiculo> getTop3VeiculosMaiorQuilometragem() {
        return veiculoRepository.findTop3ByOrderByQuilometragemDesc();
    }
}
