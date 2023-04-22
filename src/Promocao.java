import javax.swing.*;
import java.util.Scanner;

public class Promocao {

    private double valorLitroGasolina = 5.50;
    private double valorLitroAlcoo = 4.25;

    public void gasolina() {
        // entreda de dados
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe Quantos Litros Deseja Abastecer:\n");
        double abastecimento = sc.nextDouble();

        // calculos dos descontos

        if (abastecimento > 25) {
            double precoSemDesconto = abastecimento * valorLitroGasolina;
            double desconto = precoSemDesconto * 0.05;
            double precoFinal = precoSemDesconto - desconto;
            System.out.println("Valor R$ " + precoSemDesconto + " Valor Final R$  " + precoFinal);

        } else  {
            double precoSemDesconto = abastecimento * valorLitroGasolina;
            double desconto = precoSemDesconto * 0.03;
            double precoFinal = precoSemDesconto - desconto;
            System.out.println("Valor R$ " + precoSemDesconto + " Valor Final R$ " + precoFinal);

        }
    }

      public void alcool () {
            // entreda de dados
            Scanner sc = new Scanner(System.in);
            System.out.println("Informe Quantos Litros Deseja Abastecer:\n");
            double abastecimento = sc.nextDouble();

            // calculos dos descontos

            if (abastecimento > 25) {
                double precoSemDesconto = abastecimento * valorLitroAlcoo;
                double desconto = precoSemDesconto * 0.04;
                double precoFinal = precoSemDesconto - desconto;
                System.out.println("Valor R$ " + precoSemDesconto + " Valor Final R$  " + precoFinal);

            } else {
                double precoSemDesconto = abastecimento * valorLitroAlcoo;
                double desconto = precoSemDesconto * 0.02;
                double precoFinal = precoSemDesconto - desconto;
                System.out.println("Valor R$ " + precoSemDesconto + " Valor Final R$ " + precoFinal);

            }


        }


    }
