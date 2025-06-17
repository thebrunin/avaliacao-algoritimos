//Data: 09/06/2025
//Conteúdo: Avaliação prática

package questoes;
import utils.IO;

public class Q1 {

    public static void resolver(){
        IO.imprimir("Avaliação - Questão 01 - ");

        //Entrada
        int n = IO.lerValorInteiro();

        //Processamento
        resolverQuadradoEAoCubo(n);
        
    }

    public static void resolverQuadradoEAoCubo(int n){

        // Sua solução aqui
        for(int i=1; i <= n; i++) {

            int quadrado = (int) Math.pow(i, 2);
            int cubo = (int) Math.pow(i, 3);

            String resultLine = "" + i + " " + quadrado + " " + cubo;

            IO.imprimir(resultLine);
        }
        
    }

}
