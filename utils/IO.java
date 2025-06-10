package utils;
import java.util.Scanner;

public class IO {
    final static Scanner tecladoScanner = new Scanner(System.in);
    
    /**
    * Função de teste de acesso à biblioteca.
    */
    public static void hello(){
        System.out.println("Hello");
    }

    /**
    * Mostra uma mensagem na tela.
    * @param texto Mensagem a ser mostrada na tela
    */
    public static void imprimir(String texto){
        System.out.println(texto);
    }

    /**
    * Leitura de um valor inteiro a partir da entrada padrão
    * @return Valor inteiro obtido da entrada padrão
    */
    public static int lerValorInteiro(){
        int valor = tecladoScanner.nextInt();
        return valor;
    }

    /**
    * Mostra na tela um valor inteiro
    * @param valor Valor a ser mostrado na tela
    */
    public static void imprimirValorInteiro(int valor){
        imprimir("" + valor);
    }
}
