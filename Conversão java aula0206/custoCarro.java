package generation;

import java.util.Scanner;
public class custoCarro {
   
    public static void main(String[] args) {
    double cc,cf,imp,pd;
    Scanner calc = new Scanner(System.in);
    System.out.println("Digite o valor da Fabrica:");
    cf = calc.nextFloat();
    imp = cf * 0.45;
    pd = cf * 0.28;
    cc = imp + pd + cf;
    System.out.println("O valor para revenda é de:"+cc);
    }
    }
      

