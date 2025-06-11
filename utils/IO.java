package utils;

import java.util.Scanner;

public class IO {

    private static Scanner tecladoScanner = new Scanner(System.in);

    /**
     * Função de teste de acesso à biblioteca.
     */
    public static void hello() {
        System.out.println("Hello");
    }
    
    /**
     * Gera um novo método Scanner.
     * NÃO REMOVA este método. É necessário durante os testes automatizados, para redirecionamento da entrada padrão.
     */
    public static void reiniciarScanner() {
        tecladoScanner = new Scanner(System.in);
    }

    /**
     * Mostra uma mensagem na tela.
     *
     * @param texto Mensagem a ser mostrada na tela
     */
    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    /**
     * Leitura de um valor inteiro a partir da entrada padrão
     *
     * @return Valor inteiro obtido da entrada padrão
     */
    public static int lerValorInteiro() {
        int valor = tecladoScanner.nextInt();

        return valor;
    }

    /**
     * Mostra na tela um valor inteiro
     *
     * @param valor Valor a ser mostrado na tela
     */
    public static void imprimirValorInteiro(int valor) {
        imprimir("" + valor);
    }

    /**
     * Leitura de uma String a partir da entrada padrão. Obtém a primeira
     * palavra digitada.
     *
     * @return String obtida da entrada padrão
     */
    public static String lerPalavra() {
        String valor = tecladoScanner.next();
        return valor;
    }

    /**
     * Leitura de uma String a partir da entrada padrão. Obtém toda a linha
     * digitada.
     *
     * @return String obtida da entrada padrão
     */
    public static String lerFrase() {
        String valor = tecladoScanner.nextLine();
        return valor;
    }
}
