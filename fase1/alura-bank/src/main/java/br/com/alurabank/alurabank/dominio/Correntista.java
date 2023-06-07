package br.com.alurabank.alurabank.dominio;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.experimental.SuperBuilder;

@RequiredArgsConstructor
@SuperBuilder
@Value
public class Correntista {

    @JsonProperty
    private String cpf;

    @JsonProperty
    private String nome;


}
