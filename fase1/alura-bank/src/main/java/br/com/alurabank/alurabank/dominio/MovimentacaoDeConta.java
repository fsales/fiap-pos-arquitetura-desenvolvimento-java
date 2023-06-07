package br.com.alurabank.alurabank.dominio;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@RequiredArgsConstructor
@SuperBuilder
public class MovimentacaoDeConta {

    private ContaCorrente conta;

    @JsonProperty
    private BigDecimal valor;

    @JsonProperty
    private OperacaoEnum operacao;
}
