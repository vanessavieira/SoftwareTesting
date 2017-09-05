
### Especificação da Estrutura de Dados: Fila (Queue)
##### Teste de Software - Instituto de Computação - Universidade Federal de Alagoas
##### (COMP-259 M)
##### Professor: Willy Tiengo
##### Aluna: Vanessa Soares Vieira
##### Matrícula: 15112025
##### Código da aluna: 15

### Métodos:
#### public MyQueue(int size):
Construtor da fila que aceita como parâmetro um inteiro que representa a capacidade máxima de elementos que a fila poderá carregar.

#### public void enqueue(T element):
Método de inserção de elementos genéricos na fila. Deverá inserir sempre na primeira posição livre após o último elemento da fila.
Caso tente inserir mais elementos do que a fila pode carregar, deverá ser lançada a exceção “QueueIsFullException”.
Ao fim de cada inserção, os valores dos atributos (first, last e currentSize) são atualizados de acordo com suas especificações.
Esta função não retorna nenhum valor.

#### public int size():
Método que retorna o valor do atributo currentSize.

#### public T element():
Método que retorna o primeiro elemento da fila. Lança exceção em caso de a fila estar vazia. Não retorna nenhum valor.

#### public T dequeue():
Método de remoção de elemento da fila. Deverá remover sempre o primeiro elemento da fila.
Caso se tente remover elementos quando a fila já estiver vazia, deverá ser lançada uma exceção “QueueIsEmptyException”.
Ao fim de cada remoção, lembrar de atualizar os valores dos atributos (first, last e currentSize) de acordo com suas especificações.
Esta função retorna o elemento removido.

#### public String toString():
Método para visualização dos elementos da fila. Deverá ser retornado uma String no seguite formato: “Queue = {elemento1, elemento2, … elementon}”.

#### public void resetQueue():
Método para reinicialização da fila. Excluirá todos os elementos da fila. Lançará exceção caso a fila esteja vazia.
Esta função não retorna nenhum valor.
