Algoritmo "semnome"
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 11/05/2021
Var
// Seção de Declarações das variáveis 
HT:real
VH:real
PD:real
TD:real
SB:real
SL:real
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
Escreva("Digite as horas trabalhadas: ")
Leia(HT)
Escreva("Digite o valor das horas trabalhadas:")
Leia(VH)
Escreva("Digite o porcentual de desconto:")
Leia(PD)
SB <- HT * VH
TD <-(PD/100) * SB // TD Total de desconto
SL <-SB - TD //SL Salário liquido
Escreval("Salário Bruto é: " , SB)
Escreval("Total de Descontos: " , TD)
Escreval("Salário Liquido: " , SL)
Fimalgoritmo
//Horas de trabalho = 160
//Valor das Horas trabalhadas =20,00
//Percentural de desconto = 30