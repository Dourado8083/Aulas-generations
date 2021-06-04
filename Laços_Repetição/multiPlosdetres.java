package generation;
import java.util.Scanner;
public class multiPlosdetres {
    public static void main(String[] args) {
        int num=0,soma=0;
        float media=0,cont=0;
        Scanner ler = new Scanner(System.in);
        do {
        System.out.println("Digite um número: ");
        num =ler.nextInt();
        if(num % 3 == 0) {
        cont ++;
        }
        }
        while(num!=22); //troquei pois 0 é multiplo de 3
        System.out.println("Quantidade de multiplos de 3 é "+ cont);
        }
        }    

