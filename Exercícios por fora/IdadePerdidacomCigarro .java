package generation;
import java.util.Scanner;
public class IdadePerdidacomCigarro  {
    public static void main(String[] args) {
        int ano,qtd,diaspedi=0,total=0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o quantidade de cigarro que voc� fuma:");
        qtd = ler.nextInt();
        System.out.println("Digite quantos anos voc�fuma:");
        ano =  ler.nextInt();
        total =(ano * 365) * qtd; //anos 
        diaspedi = (total * 10) /24; //10 minutos duração de um cigarro
        System.out.println("Voc� perdeu : "+diaspedi +" anos ");
        }   
}
