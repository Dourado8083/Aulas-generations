package generation;
import java.util.Scanner;

public class idadePessoas {
    public static void main(String[] args) {
        int idade,contidade=50,cotivi=21,menor=0,maior=0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        idade = ler.nextInt();
        while(idade!=-99) {
        if(idade<=21) {
        menor++;
        }
        if(idade>=50) {
        maior++;
        }
        System.out.println("Digite sua idade:");
        idade = ler.nextInt();
        }
        
        System.out.println("\nTotal com idade 21: "+menor);
        System.out.println("\nTotal com idade acima de 50: "+maior);
        }
        }
          

