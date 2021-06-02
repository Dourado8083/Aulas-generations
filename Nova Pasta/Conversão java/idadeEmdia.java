package generation;

import java.util.Scanner;
public class idadeEmdia {
    public static void main(String[] args) {
        int idade,ano,mes,dias;
        Scanner calc = new Scanner(System.in);
        System.out.println("Digite o mês  :");
        mes = calc.nextInt();
        System.out.println("Digite os dias :");
        dias = calc.nextInt();
        System.out.println("Digite o ano :");
        ano = calc.nextInt();
        idade = (ano * 365 + mes * 30 + dias);
        System.out.println("Total de dias é: "+idade);
        }   
}
