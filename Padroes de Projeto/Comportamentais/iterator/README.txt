Problema
Coleções são um dos tipos de dados mais usados em programação. Não obstante, uma coleção é apenas um contêiner para um grupo de objetos.
A maioria das coleções armazena seus elementos em listas simples. Contudo, alguns deles são baseados em pilhas, árvores, grafos, e outras estruturas complexas de dados.

Mas independente de quão complexa uma coleção é estruturada, ela deve fornecer uma maneira de acessar seus elementos para que outro código possa usá-los. Deve haver uma maneira de ir de elemento em elemento na coleção sem ter que acessar os mesmos elementos repetidamente.

Isso parece uma tarefa fácil se você tem uma coleção baseada numa lista. Você faz um loop em todos os elementos. Mas como você faz a travessia dos elementos de uma estrutura de dados complexas sequencialmente, tais como uma árvore. Por exemplo, um dia você pode apenas precisar percorrer em profundidade em uma árvore. No dia seguinte você pode precisar percorrer na amplitude. E na semana seguinte, você pode precisar algo diferente, como um acesso aleatório aos elementos da árvore.

Solução
A ideia principal do padrão Iterator é extrair o comportamento de travessia de uma coleção para um objeto separado chamado um iterador.
Além de implementar o algoritmo em si, um objeto iterador encapsula todos os detalhes da travessia, tais como a posição atual e quantos elementos faltam para chegar ao fim. Por causa disso, alguns iteradores podem averiguar a mesma coleção ao mesmo tempo, independentemente um do outro.

Geralmente, os iteradores fornecem um método primário para pegar elementos de uma coleção. O cliente pode manter esse método funcionando até que ele não retorne mais nada, o que significa que o iterador atravessou todos os elementos.

Todos os iteradores devem implementar a mesma interface. Isso faz que o código cliente seja compatível com qualquer tipo de coleção ou qualquer algoritmo de travessia desde que haja um iterador apropriado. Se você precisar de uma maneira especial para a travessia de uma coleção, você só precisa criar uma nova classe iterador, sem ter que mudar a coleção ou o cliente.