//Data: 09/06/2025
//Conteúdo: Avaliação prática

package questoes;
import utils.IO;

public class Q2 {

    public static void resolver(){
        IO.imprimir("Avaliação - Questão 02 - Senha Fixa");

        //Entrada

        //Processamento
        resolverSenhaFixa();
        
    }

    public static void resolverSenhaFixa(){

        // Sua solução aqui
        while(true) {
            int n = IO.lerValorInteiro();

            if(n == 2002){
                IO.imprimir("Acesso Permitido");
                break;
            }

            IO.imprimir("Senha Invalida");

        }
        
    }

}
