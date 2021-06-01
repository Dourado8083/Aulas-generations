programa
{
	
	funcao inicio()
	{
		//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
         //atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
         inteiro valor[5],x,mai = 0
         para(x=0;x<5;x++){
         	escreva("Digite um valor:")
         	leia(valor[x])
         }
         para( x =0;x<5;x++){
         	se(mai < valor[x]){
         	mai = valor[x]
         	}
         	//se fosse necessario colocar o menor valor 
         	//poderia ter feito assim 
         	//se(menor > valor[x] ,menor = valor[x],e colocava ali em baixo
         }
         escreva("\nMaior valor: ",mai)
      }
  }


      
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 250; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */