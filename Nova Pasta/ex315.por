programa
{
	
	
	funcao inicio()
	{
//Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
//em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
//diagonal, ou seja, diagonal principal.
inteiro num[3][3],linha=0,coluna=0,soma=0,calc,diasec
para(linha=0;linha<3;linha++){
para(coluna=0;coluna<3;coluna++){
	escreva("\nEntre com o valor da linha e coluna")
	leia(num[linha][coluna])
	
  soma = soma + num[linha][coluna]
  
    }
 }
escreva("O valor da soma das matrizes:",soma)
calc = num[0][0] + num[1][1] + num[2][2] //peguei um codigo de auxilio e peguei a base do final,mais entendia logica 
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 645; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {num, 10, 8, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */