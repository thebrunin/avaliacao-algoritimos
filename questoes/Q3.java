//Data: 09/06/2025
//Conteúdo: Avaliação prática

package questoes;
import utils.IO;

public class Q3 {

    public static void resolver(){
        IO.imprimir("Avaliação - Questão 03 - Número Perfeito");

        //Entrada

        //Processamento
        resolverNumeroPerfeito();
        
    }

    public static void resolverNumeroPerfeito(){
        int n = IO.lerValorInteiro();
        // Sua solução aqui
        for(int i = 0; i < n; i++) {

            int numToCalc = IO.lerValorInteiro();
            int acc = 0;

            for(int j = 1; j < numToCalc; j++) {
                if(numToCalc%j == 0) {
                    acc += j;
                }
            }

            if(numToCalc == acc) {
                IO.imprimir(numToCalc + " eh perfeito");
            } else {
                IO.imprimir(numToCalc + " nao eh perfeito");
            }
        }

        
    }

}
