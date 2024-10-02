package com.empresa.gerenciamentofrota.model;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

public class Funcionario {
    @NotBlank(message = "O nome é obrigatório.")
    private String nome;

    @NotBlank(message = "O RG é obrigatório.")
    private String rg;

    @NotNull(message = "A data de nascimento é obrigatória.")
    private LocalDate dataNascimento;

    @Pattern(regexp = "[A-Z]{1}[0-9]{11}", message = "Número de habilitação inválido.")
    private String habilitacao;

    private List<Penalizacao> penalizacoes;

    // Getters e Setters
}
