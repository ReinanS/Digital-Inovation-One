# Conceitos Básicos de Orientação a Objetos

### Classe e Objetos

Uma representação de dados em objetos ou entidades para o processamento de outros objetos.

**Funciona como uma fábrica de objetos.**

### Associação de Classes

Quando utilizamos uma classe dentro de outra classe

### Herança

É a utilização de uma classe base, fazendo com que uma nova classe tenha todos os atributos e funções da classe pai, mais as suas próprias

### Encapsulamento

É a capacidade de proteger alguns dados ou funcionalidades da classe, não permitindo que seus consumidores possam acessá-la.

### Polimorfismo

Aqui podemos criar funções que terão o mesmo nome, mas que podem ter diferentes processamentos, implementações, ou na mesma classe, o mesmo nome e diferentes entradas.

**Dica para decidir entre usar Integer ou Stringer**

- Posso somar os dois e obter um novo valor? → **Integer**
- Não posso fazer operações com ele? → **String**
- **Exemplo**:
    - CPF → Stringer
    - ValorDaCompra → BigDecimal, ou Integer

**Qual é a diferença entre Classes e Objetos?**

Antes de um objeto ser criado, devemos definir quais serão suas propriedades e métodos, tais definições são realizadas através de uma classe. A partir de uma classe, podemos construir objetos na memória do computador que executa a nossa aplicação. Usando uma analogia, uma classe funciona como uma “receita” para criar objetos. Inclusive, vários objetos podem ser criados a partir de uma única classe.
