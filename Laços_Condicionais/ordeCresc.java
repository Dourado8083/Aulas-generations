package generation;

import java.util.Scanner;
//Feito com auxilio do Professor
public class ordeCresc {
public static void main(String[] args) {
int n1,n2,n3;
Scanner cre = new Scanner(System.in);
System.out.println("Digite o primero valor :");
n1 = cre.nextInt();
System.out.println("Digite o segundo valor :");
n2 = cre.nextInt();
System.out.println("Digite o terceirovalor :");
n3 = cre.nextInt();
if(n1 <= n2 && n2 <= n3) {
System.out.println(n1+"-"+n2+"-"+n3);
}
else if(n1 <=n3 && n3<=n2) {
System.out.println(n1+"-"+n3+"-"+n2);
}
else if(n2 <= n1 && n1 <= n3) {
System.out.println(n2+"-"+n1+"-"+n3);
}
else if(n2 < n3 && n3 < n1) {
System.out.println(n2+"-"+n3+"-"+n1);
}
else if(n3<=n1 && n1<=n2){
System.out.println(n3+"-"+n1+"-"+n2);
}
else {
System.out.println(n3+"-"+n2+"-"+n1);
}
}
}

