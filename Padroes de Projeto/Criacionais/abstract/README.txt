PADRAO FACTORY

Permite elaborar uma interface para criação de famílias de objetos relacionados ou interdependentes, que não especifica suas classes concretas. A partir desse padrão consegue-se criar fábricas concretas, que são responsáveis pela criação de novos objetos para atender as necessidades do cliente. Portanto, essa prática ajuda a excluir a dependência entre o cliente e a classe dos objetos usados por ele.


PROBLEMAS
Como posso escrever um codigo onde as classes instaciadas possam variar dentro de uma mesma interface ?
Como garantir que um conjunto de objetos relacionados possam ser criados mantendo o contexto unico?


SOLUCAO
Extrair a logica de criaçao dos objetos para um abstract factory.
Criar uma implementacao do  abstract factory para cada contexto, garantindoque todos os objetos criados estejam relacionados.






