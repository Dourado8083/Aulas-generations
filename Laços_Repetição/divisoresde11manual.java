package Laços_Repetição;
import java.util.Scanner;
public class divisoresde11manual {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num;
	float cont=0,cot=0;
   Scanner ler = new Scanner(System.in);
   for(int x = 1;x<=5;x++) {
   System.out.println("\nDigite um valor:");
   num = ler.nextInt();
   if(num % 11 == 5) {
	cont ++;
   }
   else {
	cot++;
   }
 }
   System.out.println("\nTotal de números que são multiplo de 11 e o resto é 5: "+cont);
   System.out.println("\nOutros números"+cot);
	}    
}
