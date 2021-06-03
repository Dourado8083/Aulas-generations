package generation;

import java.util.Scanner;
public class ClassificaNatação {
public static void main(String[] args) {
int idade;
Scanner calc = new Scanner(System.in);
System.out.println("Digite Sua idade :");
idade = calc.nextInt();
if(idade >= 10 && idade <=14) {
System.out.println("Sua classificação é infantil!");
}
else if(idade >= 15 && idade <= 17) {
System.out.println("Sua classificação é Juvenil!");  
}
else if(idade >=  18 && idade <= 25) {
System.out.println("Sua classificação é Adulto!");
}
else {
System.out.println("Opção Inválida!");
}
}
}
