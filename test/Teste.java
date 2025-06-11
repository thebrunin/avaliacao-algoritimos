package test;

public class Teste {
    String entrada;
    String saidaEsperada;
    String saidaObtida;

    public Teste(String entrada, String saidaEsperada) {
        this.entrada = entrada;
        this.saidaEsperada = saidaEsperada.trim();
    }

    public String getEntrada(){
        return this.entrada;
    }

    public boolean compararSaidas() {
        return this.saidaEsperada.equals(this.saidaObtida);
    }

    public void setSaidaObtida(String saidaObtida) {
        this.saidaObtida = saidaObtida;
    }
}
