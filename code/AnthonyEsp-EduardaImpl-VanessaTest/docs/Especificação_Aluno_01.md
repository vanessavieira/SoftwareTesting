# aluno-01

# MyQueue

Implementação de estrutura de dados de fila com suas operações básicas.

Internamente, os elementos são armazenados por meio de um vetor e as operaçes impõem restrições de acesso aos elementos.

O tamanho da fila é fixo e passado através do seu construtor.

## Métodos:

### boolean add(T t)

Adiciona um elemento t ao final da fila caso não haja restrições de capacidade.

Retorna true se a operação for efetuada com sucesso e false caso contrário.

### T remove()

Recupera o primero elemento da fila. O elemento é removido da fila.

Retorna o elemento, caso exista ou null caso contrário.

### boolean isEmpty()

Retorna true caso a lista se encontre vazia e false caso contrário.

### T first()

Recupera o primeiro elemento da lista, sem removê-lo.

Retorna o elemento, caso exista ou null caso contrário.

### int size()

Retorna um valor representando o número de elementos presentes na fila.
