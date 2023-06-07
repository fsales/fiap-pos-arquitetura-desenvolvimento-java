package br.com.alurabank.alurabank.dominio;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.experimental.SuperBuilder;

@RequiredArgsConstructor
@SuperBuilder
@Value
public class ContaCorrente {

    private Correntista correntista;
    @JsonProperty
    private String banco;
    @JsonProperty
    private String agencia;
    @JsonProperty
    private String numero;
}
