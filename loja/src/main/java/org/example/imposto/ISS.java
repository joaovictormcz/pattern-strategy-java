package org.example.imposto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto {

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }

}
