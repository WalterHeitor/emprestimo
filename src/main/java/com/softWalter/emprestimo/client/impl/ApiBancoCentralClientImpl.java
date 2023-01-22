package com.softWalter.emprestimo.client.impl;

import com.softWalter.emprestimo.client.ApiBancoCentralClient;
import com.softWalter.emprestimo.client.response.TaxaSelicResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class ApiBancoCentralClientImpl {
    private static final Log LOG = LogFactory.getLog(ApiBancoCentralClientImpl.class);
    private ApiBancoCentralClient apiBancoCentralClient;


    public ApiBancoCentralClientImpl(ApiBancoCentralClient apiBancoCentralClient) {
        this.apiBancoCentralClient = apiBancoCentralClient;
    }

    public TaxaSelicResponse buscarTaxaSelic() {
        try {
            TaxaSelicResponse taxaSelic = apiBancoCentralClient.getTaxaSelic();
            return taxaSelic;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
