//Lucas de montaigne teixeira brito

import java.util.Scanner;

public class vendasLoja {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] vendas = new double[5][4];
        double[] totalVendedor = new double[5];
        double maiorVenda = 0;
        double mediaGeral = 0;

        int vendedorMaior = 0;
        int totalVendas = 0;

        for (int i = 0; i < vendas.length; i++) {

            double soma = 0;

            for (int j = 0; j < vendas[i].length; j++) {

                System.out.println("Digite a venda do vendedor "
                        + (i + 1) + " semana " + (j + 1) + ":");

                vendas[i][j] = sc.nextDouble();

                soma += vendas[i][j];

                mediaGeral += vendas[i][j];
                totalVendas++;
            }

            totalVendedor[i] = soma;

            if (totalVendedor[i] > maiorVenda) {
                maiorVenda = totalVendedor[i];
                vendedorMaior = i + 1;
            }
        }

        mediaGeral /= totalVendas;

        System.out.println("Maior venda: R$ " + maiorVenda);
        System.out.println("Vendedor com maior venda: " + vendedorMaior);
        System.out.println("Média geral de vendas: R$ " + mediaGeral);

        for (int i = 0; i < vendas.length; i++) {

            System.out.println("Vendedor " + (i + 1));
            System.out.println("Total vendido: R$ " + totalVendedor[i]);

            if (totalVendedor[i] > 5000) {
                System.out.println("Meta atingida");
            }
        }

        sc.close();
    }
}
