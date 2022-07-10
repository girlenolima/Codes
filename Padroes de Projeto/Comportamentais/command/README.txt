O Command é um padrão de projeto comportamental que converte solicitações ou operações simples em objetos.

O Command é um padrão de projeto comportamental que transforma um pedido em um objeto independente que contém toda a informação sobre o pedido. Essa transformação permite que você parametrize métodos com diferentes pedidos, atrase ou coloque a execução do pedido em uma fila, e suporte operações que não podem ser feitas.

Problema
Imagine que você está trabalhando em uma nova aplicação de editor de texto. Sua tarefa atual é criar uma barra de tarefas com vários botões para várias operações do editor. Você criou uma classe Botão muito bacana que pode ser usada para botões na barra de tarefas, bem como para botões genéricos de diversas caixas de diálogo.

Soluçao
Um bom projeto de software quase sempre se baseia no princípio da separação de interesses, o que geralmente resulta em dividir a aplicação em camadas. O exemplo mais comum: uma camada para a interface gráfica do usuário e outra camada para a lógica do negócio. A camada GUI é responsável por renderizar uma bonita imagem na tela, capturando quaisquer dados e mostrando resultados do que o usuário e a aplicação estão fazendo. Contudo, quando se trata de fazer algo importante, como calcular a trajetória da lua ou compor um relatório anual, a camada GUI delega o trabalho para a camada inferior da lógica do negócio.