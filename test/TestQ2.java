//Data: 09/06/2025
//Conteúdo: Avaliação prática

package test;

import questoes.Q2;
import java.io.*;

public class TestQ2 {
    
    public static void main(String[] args){

        //Enable assertions
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        loader.setDefaultAssertionStatus(true);

        testQ2();
    }

    public static void testQ2(){

        //Variáveis
        //Parâmetros para os testes

        String entrada = "", saida_esperada = "", saida_obtida = "";

        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        ByteArrayInputStream in; 
        ByteArrayOutputStream out; 

        //Mensagem padrão a ser mostrada caso o teste seja incorreto
        String texto_erro = "## Saída Incorreta!! ##";
        try{
            //Teste 01
            entrada = "2200\n1020\n2022\n2002\n";
            saida_esperada = "Senha Invalida\nSenha Invalida\nSenha Invalida\nAcesso Permitido\n";

            // Simula entrada padrão
            in = new ByteArrayInputStream(entrada.getBytes());
            out = new ByteArrayOutputStream();

            System.setIn(in);
            System.setOut(new PrintStream(out));

            // Executa o programa principal
            Q2.resolverSenhaFixa();

            // Restaura System.in e System.out
            System.setIn(originalIn);
            System.setOut(originalOut);

            // Verifica a saída
            saida_obtida = out.toString().trim();
            assert saida_esperada == saida_obtida : texto_erro;
            

            



        }catch(AssertionError error){
            //Mensagem de erro
            System.err.println(error.getMessage());

            //Mostra os valores em que o teste saiu errado
            System.err.println("entrada:\n" + entrada);
            System.err.println("\nsaida_esperada:\n" + saida_esperada);
            System.err.println("\nsaida_obtida:\n" + saida_obtida);
            
            System.exit(1);
        }
    }
}
