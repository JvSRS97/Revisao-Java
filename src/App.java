import Produto.java;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        double a, b, c;
        String p, q, r;

        // double
        a = 3.1415;

        // truncamento transformando em inteiro
        x = (int) a;

        // teste saída de texto
        System.out.println(" Este programa é um teste!");

        // teste saída para inteiro
        System.out.println(" x = " + x);

        // teste saída para double
        System.out.println(" a = " + a);
        // ----------------------------------------------------------

        System.out.println(" \n Digite uma palavra, um número inteiro e outra palavra, separados por espaços: ");
        // teste entrada de algo digitado
        p = sc.next();

        // teste entrada de inteiro
        y = sc.nextInt();

        // teste entrada de texto até que haja quebra de linha [poderia ser um nome
        // completo, por exemplo]
        q = sc.nextLine();

        // teste de saída das informações recebidas
        System.out.println("\n p = " + p);
        System.out.println(" y = " + y);
        System.out.println(" q = " + q);

        // teste de concatenação
        System.out.println("\n Concatenando p+q: " + p + "," + q);
        // ----------------------------------------------------------

        // teste de entrada convertendo para inteiro
        System.out.print("\n Digite um inteiro: ");
        z = Integer.parseInt(sc.nextLine());

        // teste de entrada convertendo para double
        System.out.print("\n Digite um número real com ponto decimal: ");
        b = Double.parseDouble(sc.nextLine());

        // teste de entrada de qualquer texto
        System.out.print("\n Digite um texto qualquer: ");
        r = sc.nextLine();

        // teste de saída das informações recebidas
        System.out.println("\n z = " + z);
        System.out.println(" b = " + b);
        System.out.println(" r = " + r);
        // ----------------------------------------------------------
        // ----------------------------------------------------------

        // testando classe Produto
        Produto D, E, F;

        // declarando objeto
        // testando construtor
        D = new Produto("Notebook Dell Inspiron 15700", 3099.99, 4);
        E = new Produto("Notebook Acer Aspire Nitro 5", 5104.99, 7);
        /*
         * D.Descricao = "Notebook Dell Inspiron 15700";
         * D.Valor = 3099.99;
         * D.Quantidade = 4;
         */

        // testando função de saída de informações do produto
        D.Produto_Info();
        E.Produto_Info();

        //testando funções de entrada e saída de produtos do estoque
        D.Registrar_Entrada(8);
        E.Registrar_Saida(3);

        //imprimindo informações atualizadas
        D.Produto_Info();
        E.Produto_Info();
    }
}
