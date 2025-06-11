package test;

import java.util.LinkedList;
import java.util.List;

public class Teste {
    String entrada;
    String saidaEsperada;
    String saidaObtida;

    int entrada_int;

    public Teste(String entrada, String saidaEsperada) {
        this.entrada = entrada;
        this.saidaEsperada = saidaEsperada.trim();
    }

    public Teste(int entrada, String saidaEsperada) {
        this.entrada_int = entrada;
        this.saidaEsperada = saidaEsperada.trim();
    }

    public String getEntrada(){
        return this.entrada;
    }

    public int getEntradaInt(){
        return this.entrada_int;
    }

    public boolean compararSaidas() {
        return this.saidaEsperada.equals(this.saidaObtida);
    }

    public void setSaidaObtida(String saidaObtida) {
        this.saidaObtida = saidaObtida;
    }
}

