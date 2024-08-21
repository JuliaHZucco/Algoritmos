/* busca binaria precisa dos elementos ordenados 

inicio = 0
fim = vetor.lenth -1 

meio = (inicio + fim)/2

if (num == vetor[meio])
    "encontrei"
else if (num < vetor[meio]) // significa que eu teenho certeza que meu numero é a esquerda do meio
    fim = meio - 1
else 

ajustar para usar so metade do array (o numero do meio em si nao precisa pq ja testamos e nao é o numero)
e ai dividir pela metade da metade e fazer o mesmo ciclo de busca
se o numero nao bater, adiiconar else ajustando o inicio

while (inicio <= fim)
if (num == vetor[meio])
    "encontrei"
else if (num < vetor[meio]) // significa que eu teenho certeza que meu numero é a esquerda do meio
    fim = meio - 1
else 
    inicio = meio + 1; (pois vimos que o numero que buscamos é maior que o meio)

    quando fim == inicio, cheguei ao final da busca e nao encontrei quem eu queria 

se eu tiver 1024 elementos, while vai aocntecer no maximo 10x ( posso encontrar antes o valor )

      n          1024
x= log    = log       = 
      2         2




*/