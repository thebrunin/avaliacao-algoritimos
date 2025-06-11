//Data: 09/06/2025
//Conteúdo: Avaliação prática

package test;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import questoes.Q1;
import utils.IO;

public class TestQ1 {

    static boolean mostrar_erros = false;
    
    public static void main(String[] args){

        //Enable assertions
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        loader.setDefaultAssertionStatus(true);

        double acertos;

        IO.imprimir("###############################");
        IO.imprimir("##### Testes - Questão 01 #####");
        acertos = testQ1();
        mostrarConceitoTabela(acertos);
        
        IO.imprimir("###############################\n");

        if(acertos < 0.99){
            System.exit(1);
        }
        else{
            System.exit(0);
        }
    }

    public static void mostrarConceitoTabela(double porcentagem_acertos){

        if(porcentagem_acertos >= 0.9){
            IO.imprimir("🟢 Conceito A");
        }else if(porcentagem_acertos >= 0.8){
            IO.imprimir("🟠 Conceito B");
        } else if(porcentagem_acertos >= 0.7){
            IO.imprimir("🟡 Conceito C");
        }else {
            IO.imprimir("🔴 Conceito D");
        }

        IO.imprimir(String.format("%.1f", porcentagem_acertos * 100) + "% de acertos");
        
    }

    public static String obterSaidaPadrao(int entrada_int){
        String saida_obtida;

        // Simula saída padrão
        PrintStream originalOut = System.out; //Salva a saída padrão original
        ByteArrayOutputStream out;  //Aloca a nova saída padrão
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Executa o método a ser testado
        Q1.resolverQuadradoEAoCubo(entrada_int);

        System.setOut(originalOut); // Restaura a saída padrão original

        saida_obtida = out.toString().trim();

        return saida_obtida;

    }

    public static double testQ1(){

        //Variáveis
        List<Teste> testes = new LinkedList<>();
        List<Teste> testes_incorretos = new LinkedList<>();

        int total_acertos = 0;
        int total_testes;


        //Mensagem padrão a ser mostrada caso o teste seja incorreto
        String texto_erro = "## Saída Incorreta!! ##";

        //Teste 0
        // testes.add(new Teste( , ));
        testes.add(new Teste( 1 , "1 1 1" ));
        
        //Teste 1
        testes.add(new Teste( 2 , "1 1 1\n2 4 8" ));
        
        //Teste 2
        testes.add(new Teste( 3 , "1 1 1\n2 4 8\n3 9 27" ));

        //Teste 3
        testes.add(new Teste( 4 , "1 1 1\n2 4 8\n3 9 27\n4 16 64" ));

        //Teste 4
        // testes.add(new Teste( , ));
        // id_teste++;
        // entrada_int[id_teste] = 5;
        // saida_esperada[id_teste] = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125";
        // saida_esperada[id_teste] = saida_esperada[id_teste].trim();

        //Teste 5
        testes.add(new Teste( 6 , "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216" ));

        //Teste 6
        testes.add(new Teste( 7 , "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343" ));

        //Teste 7
        testes.add(new Teste( 8 , "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512" ));

        // //Teste 8
        // testes.add(new Teste( , ));
        // id_teste++;
        // entrada_int[id_teste] = 9;
        // saida_esperada[id_teste] = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729";
        // saida_esperada[id_teste] = saida_esperada[id_teste].trim();

        // //Teste 9
        // testes.add(new Teste( , ));
        // id_teste++;
        // entrada_int[id_teste] = 10;
        // saida_esperada[id_teste] = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000";
        // saida_esperada[id_teste] = saida_esperada[id_teste].trim();

        // //Teste 10
        // testes.add(new Teste( , ));
        // id_teste++;
        // entrada_int[id_teste] = 11;
        // saida_esperada[id_teste] = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331";
        // saida_esperada[id_teste] = saida_esperada[id_teste].trim();

        // //Teste 11
        // testes.add(new Teste( , ));
        // id_teste++;
        // entrada_int[id_teste] = 12;
        // saida_esperada[id_teste] = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728";
        // saida_esperada[id_teste] = saida_esperada[id_teste].trim();

        // //Teste 12
        // testes.add(new Teste( , ));
        // id_teste++;
        // entrada_int[id_teste] = 13;
        // saida_esperada[id_teste] = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197";
        // saida_esperada[id_teste] = saida_esperada[id_teste].trim();

        // //Teste 13
        // testes.add(new Teste( , ));
        // id_teste++;
        // entrada_int[id_teste] = 14;
        // saida_esperada[id_teste] = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744";
        // saida_esperada[id_teste] = saida_esperada[id_teste].trim();

        //Teste 14
        testes.add(new Teste( 15 , "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744\n15 225 3375" ));

        // //Teste 15
        // testes.add(new Teste( , ));
        // id_teste++;
        // entrada_int[id_teste] = 16;
        // saida_esperada[id_teste] = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744\n15 225 3375\n16 256 4096";
        // saida_esperada[id_teste] = saida_esperada[id_teste].trim();

        // //Teste 16
        // testes.add(new Teste( , ));
        // id_teste++;
        // entrada_int[id_teste] = 17;
        // saida_esperada[id_teste] = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744\n15 225 3375\n16 256 4096\n17 289 4913";
        // saida_esperada[id_teste] = saida_esperada[id_teste].trim();

        // //Teste 17
        // testes.add(new Teste( , ));
        // id_teste++;
        // entrada_int[id_teste] = 18;
        // saida_esperada[id_teste] = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744\n15 225 3375\n16 256 4096\n17 289 4913\n18 324 5832";
        // saida_esperada[id_teste] = saida_esperada[id_teste].trim();

        // //Teste 18
        // testes.add(new Teste( , ));
        // id_teste++;
        // entrada_int[id_teste] = 19;
        // saida_esperada[id_teste] = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744\n15 225 3375\n16 256 4096\n17 289 4913\n18 324 5832\n19 361 6859";
        // saida_esperada[id_teste] = saida_esperada[id_teste].trim();

        // //Teste 19
        // testes.add(new Teste( , ));
        // id_teste++;
        // entrada_int[id_teste] = 20;
        // saida_esperada[id_teste] = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744\n15 225 3375\n16 256 4096\n17 289 4913\n18 324 5832\n19 361 6859\n20 400 8000";
        // saida_esperada[id_teste] = saida_esperada[id_teste].trim();

        // //Teste 20
        // testes.add(new Teste( , ));
        // id_teste++;
        // entrada_int[id_teste] = 21;
        // saida_esperada[id_teste] = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744\n15 225 3375\n16 256 4096\n17 289 4913\n18 324 5832\n19 361 6859\n20 400 8000\n21 441 9261";
        // saida_esperada[id_teste] = saida_esperada[id_teste].trim();

        // //Teste 21
        // testes.add(new Teste( , ));
        // id_teste++;
        // entrada_int[id_teste] = 22;
        // saida_esperada[id_teste] = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744\n15 225 3375\n16 256 4096\n17 289 4913\n18 324 5832\n19 361 6859\n20 400 8000\n21 441 9261\n22 484 10648";
        // saida_esperada[id_teste] = saida_esperada[id_teste].trim();

        // //Teste 22
        // testes.add(new Teste( , ));
        // id_teste++;
        // entrada_int[id_teste] = 23;
        // saida_esperada[id_teste] = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744\n15 225 3375\n16 256 4096\n17 289 4913\n18 324 5832\n19 361 6859\n20 400 8000\n21 441 9261\n22 484 10648\n23 529 12167";
        // saida_esperada[id_teste] = saida_esperada[id_teste].trim();

        // //Teste 23
        // testes.add(new Teste( , ));
        // id_teste++;
        // entrada_int[id_teste] = 24;
        // saida_esperada[id_teste] = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744\n15 225 3375\n16 256 4096\n17 289 4913\n18 324 5832\n19 361 6859\n20 400 8000\n21 441 9261\n22 484 10648\n23 529 12167\n24 576 13824";
        // saida_esperada[id_teste] = saida_esperada[id_teste].trim();

        // //Teste 24
        // testes.add(new Teste( , ));
        // id_teste++;
        // entrada_int[id_teste] = 25;
        // saida_esperada[id_teste] = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744\n15 225 3375\n16 256 4096\n17 289 4913\n18 324 5832\n19 361 6859\n20 400 8000\n21 441 9261\n22 484 10648\n23 529 12167\n24 576 13824\n25 625 15625";
        // saida_esperada[id_teste] = saida_esperada[id_teste].trim();

        // //Teste 25
        // testes.add(new Teste( , ));
        // id_teste++;
        // entrada_int[id_teste] = 26;
        // saida_esperada[id_teste] = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744\n15 225 3375\n16 256 4096\n17 289 4913\n18 324 5832\n19 361 6859\n20 400 8000\n21 441 9261\n22 484 10648\n23 529 12167\n24 576 13824\n25 625 15625\n26 676 17576";
        // saida_esperada[id_teste] = saida_esperada[id_teste].trim();

        // //Teste 26
        // testes.add(new Teste( , ));
        // id_teste++;
        // entrada_int[id_teste] = 27;
        // saida_esperada[id_teste] = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744\n15 225 3375\n16 256 4096\n17 289 4913\n18 324 5832\n19 361 6859\n20 400 8000\n21 441 9261\n22 484 10648\n23 529 12167\n24 576 13824\n25 625 15625\n26 676 17576\n27 729 19683";
        // saida_esperada[id_teste] = saida_esperada[id_teste].trim();

        // //Teste 27
        // testes.add(new Teste( , ));
        // id_teste++;
        // entrada_int[id_teste] = 28;
        // saida_esperada[id_teste] = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744\n15 225 3375\n16 256 4096\n17 289 4913\n18 324 5832\n19 361 6859\n20 400 8000\n21 441 9261\n22 484 10648\n23 529 12167\n24 576 13824\n25 625 15625\n26 676 17576\n27 729 19683\n28 784 21952"; 
        // saida_esperada[id_teste] = saida_esperada[id_teste].trim();

        // //Teste 28
        // testes.add(new Teste( , ));
        // id_teste++;
        // entrada_int[id_teste] = 29;
        // saida_esperada[id_teste] = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744\n15 225 3375\n16 256 4096\n17 289 4913\n18 324 5832\n19 361 6859\n20 400 8000\n21 441 9261\n22 484 10648\n23 529 12167\n24 576 13824\n25 625 15625\n26 676 17576\n27 729 19683\n28 784 21952\n29 841 24389";
        // saida_esperada[id_teste] = saida_esperada[id_teste].trim();

        //Teste 29
        testes.add(new Teste( 30 , "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744\n15 225 3375\n16 256 4096\n17 289 4913\n18 324 5832\n19 361 6859\n20 400 8000\n21 441 9261\n22 484 10648\n23 529 12167\n24 576 13824\n25 625 15625\n26 676 17576\n27 729 19683\n28 784 21952\n29 841 24389\n30 900 27000"));

        //Teste 30
        // testes.add(new Teste( , ));
        // id_teste++;
        // entrada_int[id_teste] = 31;
        // saida_esperada[id_teste] = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744\n15 225 3375\n16 256 4096\n17 289 4913\n18 324 5832\n19 361 6859\n20 400 8000\n21 441 9261\n22 484 10648\n23 529 12167\n24 576 13824\n25 625 15625\n26 676 17576\n27 729 19683\n28 784 21952\n29 841 24389\n30 900 27000\n31 961 29791";
        // saida_esperada[id_teste] = saida_esperada[id_teste].trim();
        
        //Teste 31
        // testes.add(new Teste( , ));
        // id_teste++;
        // entrada_int[id_teste] = 32;
        // saida_esperada[id_teste] = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744\n15 225 3375\n16 256 4096\n17 289 4913\n18 324 5832\n19 361 6859\n20 400 8000\n21 441 9261\n22 484 10648\n23 529 12167\n24 576 13824\n25 625 15625\n26 676 17576\n27 729 19683\n28 784 21952\n29 841 24389\n30 900 27000\n31 961 29791\n32 1024 32768";
        // saida_esperada[id_teste] = saida_esperada[id_teste].trim();

        //Teste 32
        // testes.add(new Teste( , ));
        // id_teste++;
        // entrada_int[id_teste] = 33;
        // saida_esperada[id_teste] = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744\n15 225 3375\n16 256 4096\n17 289 4913\n18 324 5832\n19 361 6859\n20 400 8000\n21 441 9261\n22 484 10648\n23 529 12167\n24 576 13824\n25 625 15625\n26 676 17576\n27 729 19683\n28 784 21952\n29 841 24389\n30 900 27000\n31 961 29791\n32 1024 32768\n33 1089 35937";
        // saida_esperada[id_teste] = saida_esperada[id_teste].trim();

        //Teste 33
        // testes.add(new Teste( , ));
        // id_teste++;
        // entrada_int[id_teste] = 34;
        // saida_esperada[id_teste] = "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744\n15 225 3375\n16 256 4096\n17 289 4913\n18 324 5832\n19 361 6859\n20 400 8000\n21 441 9261\n22 484 10648\n23 529 12167\n24 576 13824\n25 625 15625\n26 676 17576\n27 729 19683\n28 784 21952\n29 841 24389\n30 900 27000\n31 961 29791\n32 1024 32768\n33 1089 35937\n34 1156 39304";
        // saida_esperada[id_teste] = saida_esperada[id_teste].trim();

        //Teste 34
        testes.add(new Teste( 35, "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744\n15 225 3375\n16 256 4096\n17 289 4913\n18 324 5832\n19 361 6859\n20 400 8000\n21 441 9261\n22 484 10648\n23 529 12167\n24 576 13824\n25 625 15625\n26 676 17576\n27 729 19683\n28 784 21952\n29 841 24389\n30 900 27000\n31 961 29791\n32 1024 32768\n33 1089 35937\n34 1156 39304\n35 1225 42875"));

        //Teste 35
        testes.add(new Teste( 85, "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744\n15 225 3375\n16 256 4096\n17 289 4913\n18 324 5832\n19 361 6859\n20 400 8000\n21 441 9261\n22 484 10648\n23 529 12167\n24 576 13824\n25 625 15625\n26 676 17576\n27 729 19683\n28 784 21952\n29 841 24389\n30 900 27000\n31 961 29791\n32 1024 32768\n33 1089 35937\n34 1156 39304\n35 1225 42875\n36 1296 46656\n37 1369 50653\n38 1444 54872\n39 1521 59319\n40 1600 64000\n41 1681 68921\n42 1764 74088\n43 1849 79507\n44 1936 85184\n45 2025 91125\n46 2116 97336\n47 2209 103823\n48 2304 110592\n49 2401 117649\n50 2500 125000\n51 2601 132651\n52 2704 140608\n53 2809 148877\n54 2916 157464\n55 3025 166375\n56 3136 175616\n57 3249 185193\n58 3364 195112\n59 3481 205379\n60 3600 216000\n61 3721 226981\n62 3844 238328\n63 3969 250047\n64 4096 262144\n65 4225 274625\n66 4356 287496\n67 4489 300763\n68 4624 314432\n69 4761 328509\n70 4900 343000\n71 5041 357911\n72 5184 373248\n73 5329 389017\n74 5476 405224\n75 5625 421875\n76 5776 438976\n77 5929 456533\n78 6084 474552\n79 6241 493039\n80 6400 512000\n81 6561 531441\n82 6724 551368\n83 6889 571787\n84 7056 592704\n85 7225 614125" ));

        //Teste 36
        testes.add(new Teste( 125, "1 1 1\n2 4 8\n3 9 27\n4 16 64\n5 25 125\n6 36 216\n7 49 343\n8 64 512\n9 81 729\n10 100 1000\n11 121 1331\n12 144 1728\n13 169 2197\n14 196 2744\n15 225 3375\n16 256 4096\n17 289 4913\n18 324 5832\n19 361 6859\n20 400 8000\n21 441 9261\n22 484 10648\n23 529 12167\n24 576 13824\n25 625 15625\n26 676 17576\n27 729 19683\n28 784 21952\n29 841 24389\n30 900 27000\n31 961 29791\n32 1024 32768\n33 1089 35937\n34 1156 39304\n35 1225 42875\n36 1296 46656\n37 1369 50653\n38 1444 54872\n39 1521 59319\n40 1600 64000\n41 1681 68921\n42 1764 74088\n43 1849 79507\n44 1936 85184\n45 2025 91125\n46 2116 97336\n47 2209 103823\n48 2304 110592\n49 2401 117649\n50 2500 125000\n51 2601 132651\n52 2704 140608\n53 2809 148877\n54 2916 157464\n55 3025 166375\n56 3136 175616\n57 3249 185193\n58 3364 195112\n59 3481 205379\n60 3600 216000\n61 3721 226981\n62 3844 238328\n63 3969 250047\n64 4096 262144\n65 4225 274625\n66 4356 287496\n67 4489 300763\n68 4624 314432\n69 4761 328509\n70 4900 343000\n71 5041 357911\n72 5184 373248\n73 5329 389017\n74 5476 405224\n75 5625 421875\n76 5776 438976\n77 5929 456533\n78 6084 474552\n79 6241 493039\n80 6400 512000\n81 6561 531441\n82 6724 551368\n83 6889 571787\n84 7056 592704\n85 7225 614125\n86 7396 636056\n87 7569 658503\n88 7744 681472\n89 7921 704969\n90 8100 729000\n91 8281 753571\n92 8464 778688\n93 8649 804357\n94 8836 830584\n95 9025 857375\n96 9216 884736\n97 9409 912673\n98 9604 941192\n99 9801 970299\n100 10000 1000000\n101 10201 1030301\n102 10404 1061208\n103 10609 1092727\n104 10816 1124864\n105 11025 1157625\n106 11236 1191016\n107 11449 1225043\n108 11664 1259712\n109 11881 1295029\n110 12100 1331000\n111 12321 1367631\n112 12544 1404928\n113 12769 1442897\n114 12996 1481544\n115 13225 1520875\n116 13456 1560896\n117 13689 1601613\n118 13924 1643032\n119 14161 1685159\n120 14400 1728000\n121 14641 1771561\n122 14884 1815848\n123 15129 1860867\n124 15376 1906624\n125 15625 1953125"));

        total_testes = testes.size();

        for ( Teste teste : testes) {
            try {
                //Obtém a saída do método
                teste.setSaidaObtida(obterSaidaPadrao(teste.getEntradaInt()));

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
                    IO.imprimir("Entrada:\n" + teste.getEntradaInt());
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
