# Tratamento de Exceções

### Definição:

É um evento não esperado que ocorre no sistema quando está em tempo de execução (Runtime).

### Classficação:

- **Implícitas:** Exceções que não precisam de tratamento e demonstram serem contornáveis. Esse tipo origina-se da subclasse Error ou RunTimeException.
- **Explícitas**: Exceções que precisam ser tratadas e que apresentam condições incontornáveis. Esse tipo origina do modelo throw e necessita ser declarado pelos métodos. É originado da subclasse Exception ou IOException.

### Hierarquia de exceções

No Java, todas as classes de exceção  e error herdam direta ou indiretamente da classe **Throwable**

- **Exception (java.lang.Exception)** – É a raiz das classes originárias da classe Throwable, onde mostra as situações em que a aplicação pode querer capturar e realizar um tratamento para conseguir realizar o processamento.
- **Error (java.lang.Error)** – Também é raiz das classes originárias da classe Throwable, indicando as situações em que a aplicação não deve tentar tratar, como ocorrências que não deveriam acontecer.

O “**Erro**” é algo que não pode mais ser tratado, ao contrário da “**Exceção**” que trata seus erros, pois todas as subclasses de Exception (menos as subclasses RuntimeException) são exceções e devem ser tratadas. Os erros da classe Error ou RuntimeException são erros e não precisam de tratamento, por esse motivo é usado o **try/catch** e/ou propagação com **throw/throws.**

**Exemplo:**

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploDivisao {

  public static int calculaQuociente(int numerador, int denominador) throws ArithmeticException{
    return numerador / denominador;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean continua = true;

    do{
      try{
        System.out.print("Numerador: ");
        int numerador = sc.nextInt();

        System.out.print("Denominador: ");
        int denominador = sc.nextInt();

        int resultador = calculaQuociente(numerador, denominador);
        System.out.println("Resultado: "+resultador);

        continua = false;

      }catch (InputMismatchException erro1) {
        System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
        sc.nextLine(); //descarta a entrada errada do usuário
      }catch(ArithmeticException erro2){
        System.err.println("O número do divisor deve ser diferente de 0!");
      }finally{
        System.out.println("Execução do Finally!");
      }
    }while(continua);
  }
}
```
