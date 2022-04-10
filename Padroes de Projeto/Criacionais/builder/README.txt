PADRAO BUILDER

Builder é um padrão que visa separar a construção de um objeto complexo de sua representação, de forma que o mesmo processo de construção possa construir diferentes 
representações desse objeto. Padrão builder telescópico é ideal para ser usado em construtores com múltiplos argumentos, ele demostrar para quem não tem conhecimento
da classe o que cada item é.

Problema
Como uma classe pode criar diferentes representaçoes do mesmo objeto complexo.

Soluçao
Delegar a criaçao do objeto para um builder.
Dividir a criaçao em partes.
Encapsular a criaçao e montagem em um builder separado.