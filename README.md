1 - Qual padrão de projeto pode ser utilizado no desenvolvimento de uma solução?
R: O padrão de projeto Strategy se encaixa perfeitamente neste cenário de cálculo de descontos dinâmico, pois permite: Encapsular diferentes algoritmos de desconto em classes
separadas: Cada tipo de desconto (porcentagem fixa, progressivo, aniversário) é implementado em uma classe própria, promovendo alta coesão e separação de responsabilidades.
Escolher o algoritmo de desconto em tempo de execução: O usuário seleciona o tipo de desconto desejado, e o programa utiliza a classe correspondente para calcular o valor final.
Essa flexibilidade garante adaptabilidade às diferentes promoções.
Adicionar novos tipos de desconto sem modificar o código existente: A criação de novas classes de desconto segue a mesma lógica das classes já existentes, sem afetar o código
principal. Isso facilita a manutenção e extensibilidade do sistema.


2 - Como poderíamos implementar estes tipos de desconto sem utilizar Padrões de Projetos?
R: Implementação sem Padrões de Projetos: Abordagem Procedural

3 - Quais os problemas que tal implementação traria?
R: Sem o padrão Strategy, a implementação seria realizada através de uma estrutura condicional extensa.

4 - Implemente o projeto e envie o link para repositório no GitHub, onde o README deve conter as respostas.
R: Feito.
