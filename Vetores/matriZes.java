package Vetores;

public class matriZes {
    public static void main(String[] args) {
        int [] vet ={1,0,5,-2,-5,7};
        int soma,calc;
        calc = vet[0]+vet[1]+vet[5];
        System.out.printf("A soma é  %d",calc);
        vet[4]=100;
        for(soma=0;soma<6;soma++) {
        System.out.printf("\n %d",vet[soma]);
        }
        }   
}
