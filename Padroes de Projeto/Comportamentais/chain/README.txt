O Chain of Responsibility é um padrão de projeto comportamental que permite que você passe pedidos por uma corrente de handlers. Ao receber um pedido, cada handler decide se processa o pedido ou o passa adiante para o próximo handler na corrente.

Imagine que você está trabalhando em um sistema de encomendas online. Você quer restringir o acesso ao sistema para que apenas usuários autenticados possam criar pedidos. E também somente usuários que tem permissões administrativas devem ter acesso total a todos os pedidos.

Após um pouco de planejamento, você se dá conta que essas checagens devem ser feitas sequencialmente. A aplicação pode tentar autenticar um usuário ao sistema sempre que receber um pedido que contém as credenciais do usuário. Contudo, se essas credenciais não estão corretas e a autenticação falha, não há razão para continuar com outras checagens.


Como muitos outros padrões de projeto comportamental, o Chain of Responsibility se baseia em transformar certos comportamentos em objetos solitários chamados handlers. No nosso caso, cada checagem devem ser extraída para sua própria classe com um único método que faz a checagem. O pedido, junto com seus dados, é passado para esse método como um argumento.

O padrão sugere que você ligue esses handlers em uma corrente. Cada handler ligado tem um campo para armazenar uma referência ao próximo handler da corrente. Além de processar o pedido, handlers o passam adiante na corrente. O pedido viaja através da corrente até que todos os handlers tiveram uma chance de processá-lo.

E aqui está a melhor parte: um handler pode decidir não passar o pedido adiante na corrente e efetivamente parar qualquer futuro processamento.

Em nosso exemplo com sistema de encomendas, um handler realiza o processamento e então decide se passa o pedido adiante na corrente ou não. Assumindo que o pedido contenha os dados adequados, todos os handlers podem executar seu comportamento principal, seja ele uma checagem de autenticação ou armazenamento em cache.

