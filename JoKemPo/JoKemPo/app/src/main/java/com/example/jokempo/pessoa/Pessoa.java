package com.example.jokempo.pessoa;

import java.io.Serializable;

public class Pessoa implements Serializable {

    private int id;
    private String nome;
    private int qtdPartidas;
    private int qtdVitorias;
    private float taxaVitorias;
    private double horasJogadas;
    //taxa de vitorias será calculada pela qtdVitorias/qtdPartidas
    //TO-DO
    //[] Saber a quantidade de horas
    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdPartidas() {
        return qtdPartidas;
    }

    public void setQtdPartidas(int qtdPartidas) {
        this.qtdPartidas = qtdPartidas;
    }

    public int getQtdVitorias() {
        return qtdVitorias;
    }

    public void setQtdVitorias(int qtdVitorias) {
        this.qtdVitorias = qtdVitorias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHorasJogadas() {
        return horasJogadas;
    }

    public void setHorasJogadas(double horasJogadas) {
        this.horasJogadas = horasJogadas;
    }

    public float getTaxaVitorias() {
        return taxaVitorias;
    }

    public void setTaxaVitorias(float taxaVitorias) {
        this.taxaVitorias = taxaVitorias;
    }
}
