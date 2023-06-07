package br.com.alurabank.alurabank.controller;

import br.com.alurabank.alurabank.dominio.ContaCorrente;
import br.com.alurabank.alurabank.dominio.Correntista;
import br.com.alurabank.alurabank.dominio.MovimentacaoDeConta;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contas")
public class ContaCorrenteController {

    @GetMapping
    public String consultarSaldo(
            @RequestParam("banco") String banco,
            @RequestParam("agencia") String agencia,
            @RequestParam("numero") String numero
    ) {

        return String.format(
                "Banco: %s, Agência: %s, Número: %s",
                banco,
                agencia,
                numero);
    }

    @PostMapping
    public ResponseEntity<ContaCorrente> criarNovaConta(
            @RequestBody Correntista correntista
    ) {
        var conta =  ContaCorrente
                .builder()
                .correntista(correntista)
                .agencia("1111")
                .banco("Brasil")
                .numero("1245")
                .build();

        return ResponseEntity.status(
                        HttpStatus.CREATED
                )
                .body(
                        conta
                );
    }

    @DeleteMapping
    public String fecharConta(
            @RequestBody ContaCorrente contaCorrente
    ){

        return "Conta fechada com sucesso";
    }

    @PutMapping
    public ResponseEntity<MovimentacaoDeConta> movimentarConta(
            @RequestBody  MovimentacaoDeConta movimentacaoDeConta
    ) {
        return ResponseEntity.ok(movimentacaoDeConta);
    }
}
