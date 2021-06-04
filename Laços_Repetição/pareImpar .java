package generation;

import java.util.Scanner;

public class pareImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int par=0,num,impa=0;
Scanner ler = new Scanner(System.in);
for(int x =1;x<=10;x++) {
System.out.println("\nDigite um valor:");
num = ler.nextInt();
if(num % 2 ==0) {
par++;
}else {
impa ++;
}
}
System.out.println("O total de números que são pares :"+par);
System.out.println("O total de números que são impar é :"+impa);

	}

}