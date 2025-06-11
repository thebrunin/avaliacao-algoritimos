//Data: 09/06/2025
//Conteúdo: Avaliação prática
package test;
import java.io.*;
import java.util.LinkedList;
import java.util.List;
import questoes.Q3;
import utils.IO;

public class TestQ3 {

    static boolean mostrar_erros = false;

    public static void main(String[] args) {

        //Enable assertions
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        loader.setDefaultAssertionStatus(true);

        double acertos;

        IO.imprimir("###############################");
        IO.imprimir("##### Testes - Questão 03 #####");
        acertos = testQ3();
        mostrarConceitoTabela(acertos);

        // IO.imprimir("###############################");

        if (acertos < 0.99) {
            System.exit(1);
        } else {
            System.exit(0);
        }
    }

    public static void mostrarConceitoTabela(double porcentagem_acertos) {

        if (porcentagem_acertos >= 0.9) {
            IO.imprimir("🟢 Conceito A");
        } else if (porcentagem_acertos >= 0.8) {
            IO.imprimir("🟠 Conceito B");
        } else if (porcentagem_acertos >= 0.7) {
            IO.imprimir("🟡 Conceito C");
        } else {
            IO.imprimir("🔴 Conceito D");
        }

        IO.imprimir(String.format("%.1f", porcentagem_acertos * 100) + "% de acertos");

    }

    public static String obterSaidaPadrao(String entrada_padrao) {
        String saida_obtida;

        //Smula entrada padrão
        InputStream originalIn = System.in; //Salva a entrada padrão original
        ByteArrayInputStream in;  //Aloca a nova entrada padrão
        in = new ByteArrayInputStream(entrada_padrao.getBytes());
        System.setIn(in);
        IO.reiniciarScanner();

        // Simula saída padrão
        PrintStream originalOut = System.out; //Salva a saída padrão original
        ByteArrayOutputStream out;  //Aloca a nova saída padrão
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Executa o método a ser testado
        Q3.resolverNumeroPerfeito();

        System.setIn(originalIn);  // restaura entrada padrão
        System.setOut(originalOut); // Restaura a saída padrão original

        saida_obtida = out.toString().trim();

        return saida_obtida;

    }

    public static double testQ3() {

        //Variáveis
        List<Teste> testes = new LinkedList<>();
        List<Teste> testes_incorretos = new LinkedList<>();

        int total_acertos = 0;
        int total_testes;

        //Mensagem padrão a ser mostrada caso o teste seja incorreto
        String texto_erro = "## Saída Incorreta!! ##";

        //Teste 0
        testes.add(new Teste("3\n6\n5\n28\n", "6 eh perfeito\n5 nao eh perfeito\n28 eh perfeito\n"));

        //Teste 1
        testes.add(new Teste("1\n10\n", "10 nao eh perfeito\n"));

        //Teste 2
        testes.add(new Teste("8\n5\n5\n6\n6\n10\n10\n28\n29\n", "5 nao eh perfeito\n5 nao eh perfeito\n6 eh perfeito\n6 eh perfeito\n10 nao eh perfeito\n10 nao eh perfeito\n28 eh perfeito\n29 nao eh perfeito\n"));

        total_testes = testes.size();

        for ( Teste teste : testes) {
            try {
                //Obtém a saída do método);
                teste.setSaidaObtida(obterSaidaPadrao(teste.getEntrada()));

                // Verifica a saída
                assert teste.compararSaidas() : texto_erro;

                System.out.print("✅");
                total_acertos++;

            } catch (AssertionError error) {
                System.out.print("❌");
                testes_incorretos.add(teste);
            }
        }

        System.out.println();

        //Exibe os testes incorretos, caso haja
        if(testes_incorretos.size() > 0) {
            if( mostrar_erros ){
                IO.imprimir("### Testes Incorretos ###");
                for (Teste teste : testes_incorretos) {
                    IO.imprimir("Entrada:\n" + teste.getEntrada());
                    IO.imprimir("Saída Esperada:\n" + teste.saidaEsperada + "\n");
                    IO.imprimir("Saída Obtida:\n" + teste.saidaObtida + "\n");
                    IO.imprimir("-------------------------");
                }
            }
        } else {
            IO.imprimir("### Todos os testes passaram! ###");
        }

        //Retorna o total de acertos
        return (double) total_acertos / total_testes;
    }
}
