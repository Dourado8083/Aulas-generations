package generation;

import java.util.Scanner;

public class parOuImpar {
public static void main(String[] args) {
double num = 0;
Scanner comp = new Scanner(System.in);
System.out.println("Digite um valor:");
num = comp.nextInt();
if(num % 2 == 0) {
System.out.printf("Raiz quadrada%.2f ",Math.sqrt(num));	
}
else{
System.out.println(Math.pow(num, 2));	
}
}
}
