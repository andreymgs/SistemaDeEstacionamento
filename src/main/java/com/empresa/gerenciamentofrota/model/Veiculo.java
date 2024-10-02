package com.empresa.gerenciamentofrota.model;

import javax.validation.constraints.*;
import java.time.Year;

public class Veiculo {
    @NotBlank(message = "O modelo é obrigatório.")
    private String modelo;

    @NotBlank(message = "A marca é obrigatória.")
    private String marca;

    @NotBlank(message = "A categoria é obrigatória.")
    private String categoria;

    @Min(value = 1886, message = "Ano de fabricação inválido.")
    private int anoFabricacao;

    @Min(value = 1886, message = "Ano de compra inválido.")
    private int anoCompra;

    @NotBlank(message = "O tipo de combustível é obrigatório.")
    private String tipoCombustivel;

    @Min(value = 1, message = "A quantidade de passageiros deve ser maior que zero.")
    private int quantidadePassageiros;

    @NotBlank(message = "A habilitação mínima é obrigatória.")
    private String habilitacaoMinima;

    @Pattern(regexp = "[A-Z]{3}-[0-9]{4}", message = "A placa deve estar no formato AAA-1234.")
    private String placa;

    @Min(value = 0, message = "A quilometragem não pode ser negativa.")
    private long quilometragem;

    // Getters e Setters
}
