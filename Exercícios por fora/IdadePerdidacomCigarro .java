package generation;
import java.util.Scanner;
public class IdadePerdidacomCigarro  {
    public static void main(String[] args) {
        int ano,qtd,diaspedi=0,total=0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o quantidade de cigarro que você fuma:");
        qtd = ler.nextInt();
        System.out.println("Digite quantos anos vocêfuma:");
        ano =  ler.nextInt();
        total =(ano * 365) * qtd; //anos 
        diaspedi = (total * 10) /24; //10 minutos duraÃ§Ã£o de um cigarro
        System.out.println("Você perdeu : "+diaspedi +" anos ");
        }   
}
