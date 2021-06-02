package generation;

import java.util.Scanner;
public class mediaPonderado {
public static void main(String[] args) {
double n1,n2,n3,media;
Scanner calc = new Scanner(System.in);
System.out.println("Digite a primeira nota: ");
n1 = calc.nextFloat();
System.out.println("Digite a segunda nota: ");
n2 = calc.nextFloat();
System.out.println("Digite a terceira nota");
n3 = calc.nextFloat();
media = (n1 * 2 + n2 * 3 + n3  * 5)/10;
System.out.printf("A media Ponderada é %.2f: ",media); 
}
}
