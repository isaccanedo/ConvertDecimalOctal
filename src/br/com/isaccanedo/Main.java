package br.com.isaccanedo;

import java.util.Scanner;

/**
 * @author Isac Canedo
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Conversor octal-decimal\n");
        // Converter Decimal em Octal usando o método de divisão por 8 repetida :

        ConvertDecimal convertDecimal = new ConvertDecimal();
        int getDecimal;

        System.out.print("Insira um decimal: ");
        Scanner decimal = new Scanner(System.in);
        getDecimal = decimal.nextInt();

        // obtenha o valor octal de um decimal
        convertDecimal.getOctal(getDecimal);

        System.out.print("\n");

        // Conversor Octal em Decimal
        ConvertOctal convertOctal = new ConvertOctal();
        int getOctal;
        Scanner octal = new Scanner(System.in);

        System.out.print("Insira um número octal: ");
        getOctal = octal.nextInt();

        // obtenha o valor decimal de um octal
        convertOctal.getDecimal(getOctal);

        octal.close();
        decimal.close();
    }


}

