package org.example;

import org.example.imposto.CalculadoraDeImpostos;
import org.example.imposto.ICMS;
import org.example.imposto.ISS;
import org.example.orcamento.Orcamento;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Main.class.getName());

        Orcamento orcamento = new Orcamento(new BigDecimal("100"));

        // Utilizacao dos impostos especificos
        ISS iss = new ISS();
        String msg = String.format("ISS: %s", iss.calcular(orcamento));
        logger.log(Level.INFO, msg);

        ICMS icms = new ICMS();
        msg = String.format("ICMS: %s", icms.calcular(orcamento));
        logger.log(Level.INFO, msg);

        // Utilizacao da calculadora de impostos generica
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        msg = String.format("CalculadoraDeImpostos: %s", calculadoraDeImpostos.calcular(orcamento, iss));
        logger.log(Level.INFO, msg);

    }
}