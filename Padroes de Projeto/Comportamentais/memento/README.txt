O Memento é um padrão de projeto comportamental que permite que você salve e restaure o estado anterior de um objeto sem revelar os detalhes de sua implementação.

Problema
Imagine que você está criando uma aplicação de editor de texto. Além da simples edição de texto, seu editor pode formatar o texto, inserir imagens em linha, etc.

Em determinado momento você decide permitir que os usuários desfaçam quaisquer operações realizadas no texto. Essa funcionalidade tem se tornado tão comum nos últimos anos que, hoje em dia, as pessoas esperam que toda aplicação a tenha. Para a implementação você decide usar a abordagem direta. Antes de realizar qualquer operação, a aplicação grava o estado de todos os objetos e salva eles em algum armazenamento. Mais tarde, quando um usuário decide reverter a ação, a aplicação busca o último retrato do histórico e usa ele para restaurar o estado de todos os objetos.

Solucao
Todos os problemas que vivenciamos foram causados por um encapsulamento quebrado. Alguns objetos tentaram fazer mais do que podiam. Para coletar os dados necessários para fazer uma ação, eles invadiram o espaço privado de outros objetos ao invés de deixar esses objetos fazer a verdadeira ação.

O padrão Memento delega a criação dos retratos do estado para o próprio dono do estado, o objeto originador. Portanto, ao invés de outros objetos tentarem copiar o estado do editor “a partir do lado de fora”, a própria classe do editor pode fazer o retrato já que tem acesso total a seu próprio estado.

O padrão sugere armazenar a cópia do estado de um objeto em um objeto especial chamado memento. Os conteúdos de um memento não são acessíveis para qualquer outro objeto exceto aquele que o produziu. Outros objetos podem se comunicar com mementos usando uma interface limitada que pode permitir a recuperação dos metadados do retrato (data de criação, nome a operação efetuada, etc.), mas não ao estado do objeto original contido no retrato.