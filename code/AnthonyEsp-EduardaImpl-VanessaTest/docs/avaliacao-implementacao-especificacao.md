
### Review da Especificação e Implementação da Estrutura de Dados: Fila (Queue)
#### Especificação: Anthony
#### Implementação da especificação: Eduarda
#### Implementação do teste: Vanessa

### Geral:
No geral  a implementação está de acordo com a especificação. Os métodos possuem comportamente assim como foram especificados. O teste foi relativamente simples de ser feito e apurado.

### Métodos:
- Em geral a especificação e implementação dos métodos estão bastante coesas.
- A especificação dos métodos remove( ) e first( ), no entanto, possui uma certa ambiguidade. Esses métodos devem retornar o primeiro elemento da fila (sendo a diferença entre eles o fato de que o remove removerá o elemento e depois o retornará) e caso a fila esteja vazia, o valor nulo é retornado. Porém, é possível, a partir da implementação do método add( ), adicionar o elemento nulo. Ou seja, o primeiro elemento a ser retornado poderá ser nulo. O que poderá causar algum tipo de confusão, pois não se sabe se a fila estava vazia ou se o primeiro elemento dela é o elemento nulo.

### Avaliação:
4,2
