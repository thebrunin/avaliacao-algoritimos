//Data: 09/06/2025
//Conteúdo: Avaliação prática

package test;

import questoes.Q1;
import java.io.*;

public class TestQ1 {
    
    public static void main(String[] args){

        //Enable assertions
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        loader.setDefaultAssertionStatus(true);

        testQ1();
    }

    public static void testQ1(){

        //Variáveis
        //Parâmetros para os testes

        String entrada = "", saida_esperada = "", saida_obtida = "";
        int entrada_int = 0;

        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        ByteArrayInputStream in; 
        ByteArrayOutputStream out; 

        //Mensagem padrão a ser mostrada caso o teste seja incorreto
        String texto_erro = "## Saída Incorreta!! ##";
        try{
            //Teste 01
            // Simula entrada padrão
            in = new ByteArrayInputStream(entrada.getBytes());
            out = new ByteArrayOutputStream();

            entrada_int = 1;
            saida_esperada = "1 1 1";

            System.setIn(in);
            System.setOut(new PrintStream(out));

            // Executa o programa principal
            Q1.resolverQuadradoEAoCubo(entrada_int);

            // Restaura System.in e System.out
            System.setIn(originalIn);
            System.setOut(originalOut);

            // Verifica a saída
            saida_obtida = out.toString();//.trim();
            assert (saida_esperada == saida_obtida) : texto_erro;
            System.out.println("certoooo");
            

        }catch(AssertionError error){
            //Mensagem de erro
            System.err.println(error.getMessage());

            //Mostra os valores em que o teste saiu errado
            System.err.println("entrada_int: " + entrada_int);
            System.err.println("saida_esperada:" + saida_esperada + "X");
            System.err.println("saida_obtida  :" + saida_obtida + "X");
            
            System.exit(1);
        }
    }
}
