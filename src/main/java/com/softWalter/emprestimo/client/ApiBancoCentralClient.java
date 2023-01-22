package com.softWalter.emprestimo.client;

import com.softWalter.emprestimo.client.response.TaxaSelicResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "BancoCentral", url = "https://olinda.bcb.gov.br/olinda/servico/taxaJuros/versao/" +
        "v2/odata/TaxasJurosMensalPorMes?$top=100&$format=json&$select=Mes," +
        "Modalidade,Posicao,InstituicaoFinanceira,TaxaJurosAoMes,TaxaJurosAoAno,cnpj8,anoMes")
public interface ApiBancoCentralClient {

    @GetMapping
    TaxaSelicResponse getTaxaSelic();

}
