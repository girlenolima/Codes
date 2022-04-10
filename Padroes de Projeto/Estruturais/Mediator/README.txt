Propósito
O Mediator é um padrão de projeto comportamental que permite que você reduza as dependências caóticas entre objetos. O padrão restringe comunicações diretas entre objetos e os força a colaborar apenas através do objeto mediador.

Problema
Digamos que você tem uma caixa de diálogo para criar e editar perfis de clientes. Ela consiste em vários controles de formulário tais como campos de texto, caixas de seleção, botões, etc.

Relações caóticas entre elementos de uma interface de usuário
As relações entre os elementos da interface de usuário podem se tornar caóticas a medida que a aplicação evolui.

Alguns dos elementos do formulário podem interagir com outros. Por exemplo, selecionando a caixa de “Eu tenho um cão” pode revelar uma caixa de texto escondida para inserir o nome do cão. Outro exemplo é o botão enviar que tem que validar todos os campos antes de salvar os dados.

Elementos da UI são interdependentes
Os elementos podem ter várias relações com outros elementos. Portanto, mudanças a alguns elementos podem afetar os outros.

Ao ter essa lógica implementada diretamente dentro do código dos elementos de formulários você torna as classes dos elementos muito difíceis de se reutilizar em outros formulários da aplicação. Por exemplo, você não será capaz de usar aquela classe de caixa de seleção dentro de outro formulário porque ela está acoplado com o campo de texto do nome do cão. Você pode ter ou todas as classes envolvidas na renderização do formulário de perfil, ou nenhuma.


Solução
O padrão Mediator sugere que você deveria cessar toda comunicação direta entre componentes que você quer tornar independentes um do outro. Ao invés disso, esses componentes devem colaborar indiretamente, chamando um objeto mediador especial que redireciona as chamadas para os componentes apropriados. Como resultado, os componentes dependem apenas de uma única classe mediadora ao invés de serem acoplados a dúzias de outros colegas.

No nosso exemplo com o formulário de edição de perfil, a classe diálogo em si pode agir como mediadora. O mais provável é que a classe diálogo já esteja ciente de todos seus sub-elementos, então você não precisa introduzir novas dependências nessa classe.