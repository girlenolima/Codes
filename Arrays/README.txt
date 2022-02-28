Em DEITEL (2005, pág. 673), uma coleção é uma estrutura de dados, na realidade um objeto, que pode armazenar ou agrupar referências a outros objetos (um contêiner). As classes e interfaces da estrutura de coleções são membros do pacote java.util e a Figura 1 apresenta a hierarquia de algumas destas interfaces oferecidas pelo Java.

1) Conjunto (Set e SortedSet):
- Sem indexação 
- Nao conta elementos
- Sem repetiçao de elementos
- Pode ser ordenados ou nao

2) Lista (List):
- Com indexacao
- Primeiro elemento é zero
- É um interface
- Principais implementacoes  Arrays list ,LinkedList e Vector


3) Fila (Queue):
- Ordem linear
- FIFO

4) Mapa (Map e SortedMap):
- Pares chave e valor
- Chave nao pode ser duplicada
- Chaves sao ordenadas ou nao


5) Quando Usar  ?
- Array List  : onde tiver operaçoes de pesquisa
- Vector
- LindList    : onde tiver operaçoes de inserçao e exclusao

6) Formas de inicializaçao List
ArrayList<String> agenda = new ArrayList();

-Java 5.
 List notas = new ArrayList<>();

-Java 6.
 List<Double> notas2= new ArrayList<Double>();

-Java 7.
 List<Double> notas3= new ArrayList<>();

-Nao recomendado mas possivel.
 ArrayList<Double> notas4 = new ArrayList<Double>();

-Populando a list.
 List<Double>  notas5 = new ArrayList<>(Arrays.asList(7d,5d,6d,5d));

-Pouco usado, deste modo nao é possivel adicionar novos elementos ou remover
 List<Double>  notas6 = Arrays.asList(7d,5d,6d,5d);

-Desta forma a lista fica imutavel
 List<Double>  notas7 = List.of(7d,5d,6d,5d);

7) Alguns metodos possiveis de List

-index of mostra o posicao do elemento
 System.out.println(notasF.indexOf(9.0));

-verificar se um elemento esta na lista
 System.out.println(notasF.contains(2.0));

-Percorrendo com for each
-Para cada elemento do arrey faca
    for (Double elemento : notasF) {
         System.out.println(elemento);
     }

-Exibir o menor e Maior elemento
 System.out.println(Collections.min(notasF));
 System.out.println(Collections.max(notasF));

-Soma dos valores
  Double resultado = 0.0;
  for (Double elemento : notasF) {
       resultado += elemento;
  }

-Media
  System.out.println(notasF.size() / resultado);

-Remova as notas menores que 7
 Nao é possivel remover elementos de um array durante acesso via for...
 Necessario usar interator

        Iterator<Double> interator = notasF.iterator();
        while(interator.hasNext()){
            Double next = interator.next();
            if(next < 7 ){
                interator.remove();
            }
        }
