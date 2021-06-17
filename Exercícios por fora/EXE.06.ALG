Algoritmo "semnome"
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 11/05/2021
Var
// Seção de Declarações das variáveis 
sal:real
novo_sal:real
boni:real
aux:real

Inicio
leia(sal)
SE(sal <= 500)
ENTÃO
boni <— sal * 5
SE(sal > 500) e (sal <= 1200)ENTÃO
boni <- sal * 12 + aux
fimse
SE(sal > 1200)ENTÃO
boni <— 0
SE(sal <= 600)ENTÃO
aux <— 150
SE(sal > 600) ENTÃO
aux <— 100
novo_sal <— sal + boni + aux
ESCREVA(novo_sal)
FIMSE
FIMALGORITMO