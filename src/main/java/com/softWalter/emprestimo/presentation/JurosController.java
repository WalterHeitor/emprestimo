package com.softWalter.emprestimo.presentation;

import com.softWalter.emprestimo.client.impl.ApiBancoCentralClientImpl;
import com.softWalter.emprestimo.client.response.TaxaSelicResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/softWalter/v1/juros")
public class JurosController {

    private ApiBancoCentralClientImpl apiBancoCentralClient;

    public JurosController(ApiBancoCentralClientImpl apiBancoCentralClient) {
        this.apiBancoCentralClient = apiBancoCentralClient;
    }


    @GetMapping(value = "/taxa_selic")
    public ResponseEntity<TaxaSelicResponse> getTaxaSelic (){
        TaxaSelicResponse taxaSelicResponse = apiBancoCentralClient.buscarTaxaSelic();
        return ResponseEntity.ok(taxaSelicResponse);
    }
}
