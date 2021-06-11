package generation;

import java.util.Scanner;

public class TesteAni {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sca = new Scanner(System.in);	
CachorrO dog = new CachorrO();
CavalO hor = new CavalO();
PreguiÇa per = new PreguiÇa();
AnimaL anim= null;
int ani;
do {
System.out.println("Escolha um animal\n1-Cachorro\n2-Cavalo\n3-Preguiça");
ani = sca.nextInt();
System.out.println("Fazenda Dourado");
System.out.println("Seja bem-vindo");
System.out.println("------------------------------------------------------");
if(ani==1)
{
	anim = dog;
	System.out.println("\nQual o nome do seu cachorro?");
	String nome = sca.next();
	System.out.println("\nQuantos anos seu cachorro tem?");
	int idade = sca.nextInt();
	System.out.println("\nEssa é legal!!!Qual o som que seu cachorro emite?");
	String som = sca.next();
	System.out.println("------------------------------------------------------");
	dog.Nome(nome);
	dog.Idade(idade);
	dog.Som(som);
}
else if(ani==2)
{
	anim=hor;
	System.out.println("\nQual o nome do seu cavalo?");
	String nome = sca.next();
	System.out.println("\nQuantos anos seu cavalo tem?");
	int idade = sca.nextInt();
	System.out.println("\nEssa é legal!!!Qual o som que seu cavalo emite?");
	String som = sca.next();
	System.out.println("------------------------------------------------------");
	hor.Nome(nome);
	hor.Idade(idade);
	hor.Som(som);
	
}
else if(ani==3)
{
	anim=per;
	System.out.println("\nQual o nome da sua preguiça?");
	String nome = sca.next();
	System.out.println("\nQuantos anos sua preguiça tem?");
	int idade = sca.nextInt();
	System.out.println("\nEssa é legal!!!Qual o som que sua preguiça emite?");
	String som = sca.next();
	System.out.println("------------------------------------------------------");
	per.Nome(nome);
	per.Idade(idade);
	per.Som(som);
}
else
{
	System.out.println("\nInformação Inválida!!!");
}
}
while(ani<=0 || ani>=4);
}

}

