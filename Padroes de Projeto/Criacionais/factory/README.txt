PADRAO FACTORY

O Factory Method é um padrão criacional de projeto que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados.

PROBLEMAS
Como posso escrever um codigo onde as classes instaciadas possam variar dentro de uma mesma interface ?
Como deixar meu codigo desacoplado das classes concretas ?

SOLUCAO
Extrair a logica de criacaço dos objetos para um factory method.
Invocar o factory  method para receber uma instancia qualquer que implemente um determinada interface.




