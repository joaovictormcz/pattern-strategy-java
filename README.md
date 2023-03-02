# pattern-strategy-java
Example of the design pattern strategy in java
Strategy é um padrão de projeto comportamental que permite que você defina uma família de algoritmos,
coloque cada um deles em uma classe separada e faça seus objetos intercambiáveis.

## Problema
Imagine que você está criando um aplicativo de edição de fotos. Primeiro, o usuário seleciona uma imagem
e o aplicativo a carrega. Em seguida, o usuário pode aplicar alguns filtros a essa imagem. Por exemplo,
ele pode aplicar um filtro de preto e branco ou um filtro de nitidez. Cada filtro é uma classe separada
com uma interface comum. O aplicativo deve ser capaz de alternar entre os filtros sem que o usuário
precise saber qual filtro está sendo aplicado.

## Solução
O padrão Strategy sugere que você pegue uma classe com um comportamento variável e extraia todos os
algoritmos relacionados a esse comportamento em classes separadas chamadas estratégias.

## Estrutura
O padrão strategy dimui a dependência entre o código cliente e o código de serviço. O código cliente
não precisa conhecer as classes concretas de estratégia. Ele só precisa conhecer a interface comum de
estratégia. O código cliente pode trabalhar com qualquer estratégia que implemente essa interface comum.

## Aplicabilidade
Use o padrão Strategy quando você precisa usar diferentes variantes de um algoritmo dentro de um objeto
e ser capaz de alternar entre essas variantes durante a execução do aplicativo.
Utilizando a mesma assinatura de método, você pode executar diferentes algoritmos.
