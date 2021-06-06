programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
	 real base,altura,area

	 escreva("Entre com o valor da base :")
	 leia(base)
	 escreva("entre com o valor da altura :")
	 leia(altura)
	 se(base > 0 e altura>0){
	 area = (base * altura) / 2
	 escreva("O valor da area é ",Matematica.arredondar(area,2))
	 }senao{
	 escreva("Opção Negada")
	 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 302; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */