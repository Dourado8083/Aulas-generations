Algoritmo "semnome"
// 
//  
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 11/05/2021
Var
// Se��o de Declara��es das vari�veis 
sal:real
novo_sal:real
boni:real
aux:real

Inicio
leia(sal)
SE(sal <= 500)
ENT�O
boni <� sal * 5
SE(sal > 500) e (sal <= 1200)ENT�O
boni <- sal * 12 + aux
fimse
SE(sal > 1200)ENT�O
boni <� 0
SE(sal <= 600)ENT�O
aux <� 150
SE(sal > 600) ENT�O
aux <� 100
novo_sal <� sal + boni + aux
ESCREVA(novo_sal)
FIMSE
FIMALGORITMO