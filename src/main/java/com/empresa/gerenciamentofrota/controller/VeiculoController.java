package com.empresa.gerenciamentofrota.controller;

import com.empresa.gerenciamentofrota.model.Veiculo;
import com.empresa.gerenciamentofrota.service.VeiculoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
    private final VeiculoService veiculoService;

    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    @GetMapping("/ano/{ano}")
    public List<Veiculo> getVeiculosPorAno(@PathVariable int ano) {
        return veiculoService.getVeiculosPorAno(ano);
    }

    @GetMapping("/modelo/{modelo}")
    public List<Veiculo> getVeiculosPorModelo(@PathVariable String modelo) {
        return veiculoService.getVeiculosPorModelo(modelo);
    }

    @GetMapping("/top3km")
    public List<Veiculo> getTop3VeiculosMaiorQuilometragem() {
        return veiculoService.getTop3VeiculosMaiorQuilometragem();
    }
}
