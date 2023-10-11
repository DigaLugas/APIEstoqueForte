package com.estoqueforte.api.models;

import jakarta.validation.*;
public record SinginProductData(
        @NotBlank
        String nome,
        String marca,
        String descriçao,
        double valor


) {

}
