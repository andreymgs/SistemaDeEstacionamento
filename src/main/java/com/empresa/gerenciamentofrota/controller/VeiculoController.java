package com.empresa.gerenciamentofrota.controller;

import com.empresa.gerenciamentofrota.model.Veiculo;
import com.empresa.gerenciamentofrota.service.VeiculoService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/veiculos")
@Validated
public class VeiculoController {
    private final VeiculoService veiculoService;

    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    @GetMapping("/ano/{ano}")
    public ResponseEntity<List<Veiculo>> getVeiculosPorAno(@PathVariable @Min(1886) int ano) {
        List<Veiculo> veiculos = veiculoService.getVeiculosPorAno(ano);
        return ResponseEntity.ok(veiculos);
    }

    @GetMapping("/modelo/{modelo}")
    public ResponseEntity<List<Veiculo>> getVeiculosPorModelo(@PathVariable @NotBlank String modelo) {
        List<Veiculo> veiculos = veiculoService.getVeiculosPorModelo(modelo);
        return ResponseEntity.ok(veiculos);
    }

    @GetMapping("/top3km")
    public ResponseEntity<List<Veiculo>> getTop3VeiculosMaiorQuilometragem() {
        List<Veiculo> veiculos = veiculoService.getTop3VeiculosMaiorQuilometragem();
        return ResponseEntity.ok(veiculos);
    }
}
