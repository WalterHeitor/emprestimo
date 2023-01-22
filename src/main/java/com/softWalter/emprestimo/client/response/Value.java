package com.softWalter.emprestimo.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Value {
    @JsonProperty("Mes")
    public String mes;
    @JsonProperty("Modalidade")
    public String modalidade;
    @JsonProperty("Posicao")
    public int posicao;
    @JsonProperty("InstituicaoFinanceira")
    public String instituicaoFinanceira;
    @JsonProperty("TaxaJurosAoMes")
    public double taxaJurosAoMes;
    @JsonProperty("TaxaJurosAoAno")
    public double taxaJurosAoAno;
    public String cnpj8;
    public String anoMes;
}
