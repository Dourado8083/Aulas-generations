package Vetores;
import java.util.Scanner;
public class parImapar {
    public static void main(String[] args) {
        int[] vet = new int[6];
        int par = 0,qtdipar = 0,y;
        Scanner ler = new Scanner(System.in);
        for(y=0;y<6;y++) {
        System.out.println("Digite um valor: ");
        vet[y] = ler.nextInt();
        if(vet[y] % 2 == 0) {
        par += vet[y];
        }
        else {
        qtdipar++;
        }
        }
        for(y=0;y<6;y++) {
        if(vet[y] % 2 == 0) {	
        System.out.println("Numeros pares: "+vet[y]);
        }
        else {
        System.out.println("Numeros Impares: "+vet[y]);
        }
        }
        System.out.println("A soma de todos os números pares "+par);
        System.out.println("Quantidade de números impares "+qtdipar);
        }   
}
