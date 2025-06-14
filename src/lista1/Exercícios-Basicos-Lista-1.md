Lista de Exercícios I
Aquecimento: Faça um algoritmo em Java que receba três notas calcule e mostre a média dessas notas.
1. Faça um algoritmo em Java que receba três notas e seus respectivos pesos, calcule e mostre a média ponderada dessas notas.
__________________________________________________________
Média Aritmética Ponderada - MAP: Às vezes, é importante atribuir-se pesos diferenciados a cada valor, para o cálculo da média e, neste caso, a média recebe o nome de média ponderada. Assim, dados n valores x1, x2, x3, ... , xn aos quais são atribuídos os pesos k1, k2, k3, ... , kn respectivamente, a média ponderada destes n valores será dada por:
Mp = (x1.k1 + x2.k2 + x3.k3 + ... xn.kn) / (k1 + k2 + k3 + ... + kn)
Exemplo: Se os valores 10, 8 e 6 possuem pesos 4, 3 e 2 respectivamente, a média ponderada destes valores será igual a:
Mp = (10.4 + 8.3 + 6.2) / (4 + 3 + 2) = 76 / 9 = 8,44.
__________________________________________________________

2. Faça um algoritmo em Java que receba o salário-base de um funcionário e mostre o salário a receber, sabendo-se que esse funcionário tem gratificação de 5% sobre o salário-base e paga imposto de 7% sobre o salário-base.
3. Faça um programa em Java que leia a média final de um aluno e forneça uma mensagem associada ao conceito obtido. Utilize "if/else".
   Informações a serem apresentadas:
- Se a média é menor que 7, "Você precisa estudar mais";
- Se a média é  igual a 7, "Você foi aprovado";
- Se a média está entre 7 e 8, ou seja de 7.1 à 7.99 "Parabéns, suas notas ficaram acima da média";
- Se a média é maior ou igual a 8 e menor que 9, "Parabéns,sua média ficou próxima da nota máxima";
- Se a média é maior ou igual a 9, "Parabéns, você é um excelente aluno";

4. Elabore um algoritmo que leia um número inteiro entre 1 e 12 e imprima o mês correspondente. Caso seja digitado um valor fora desse intervalo, deverá ser exibida uma mensagem informando que não existe mês com esse número.

5. Elabore um algoritmo que leia dois números e faça uma das quatro operações. A operação (soma, subtração, multiplicação ou divisão) será escolhida pelo usuário.
6. Elabore um algoritmo que imprima todos os números de 1 até 100.
7. Elabore um algoritmo que imprima todos os números de 100 até 1.

8. Elabore um algoritmo que imprima todos os números ímpares de 250 a 500 e também a soma destes números.

9. Elabore um algoritmo que entre com números enquanto forem positivos e imprimir os números positivos digitados.

10. Elabore um algoritmo que imprima todos os números pares de 500 a 250 e também a soma destes números.

DESAFIO
/**
Leia um determinado número de pacientes e
Exiba um relatório contendo:
i.   a quantidade de pacientes.
ii.  a quantidade de pacientes com idade entre 18 e 25.
iii. a média de idade dos homens.
iv.  a quantidade de mulheres com altura entre 1,60 e 1,70 e
peso acima de 70kg.
v.   o nome do paciente homem mais velho.
vi.  o nome da mulher mais baixa.
*/
