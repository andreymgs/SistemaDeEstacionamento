package com.empresa.gerenciamentofrota.model;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class Penalizacao {
    @NotBlank(message = "A descrição da penalização é obrigatória.")
    private String descricao;

    @NotNull(message = "A data de início é obrigatória.")
    private LocalDate dataInicio;

    @NotNull(message = "A data de fim é obrigatória.")
    private LocalDate dataFim;

    // Getters e Setters
}
