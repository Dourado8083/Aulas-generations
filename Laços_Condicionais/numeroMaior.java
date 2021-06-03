package Laços_Condicionais;
import java.util.Scanner;
public class numeroMaior {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner calc = new Scanner(System.in);
        System.out.println("Digite o Primeiro Valor: ");
        n1 = calc.nextInt();
        System.out.println("Digite o Segundo Valor: ");
        n2 = calc.nextInt();
        System.out.println("Digite o Terceira Valor:");
        n3 = calc.nextInt();
        
        if(n1 > n3 && n1 > n2) {
        System.out.println("O maior valor é de "+n1+".");
        }
        else if(n2 > n1 && n2 > n3) {
        System.out.println("O maior valor é de ."+n2+".");	
        }
            
        else if(n3 > n1 && n3 > n2) {
        System.out.println("O maior valor é de ."+n3+".");
        }
        else {
        System.out.println("Valores são iguais");
        }
        }
           
}
