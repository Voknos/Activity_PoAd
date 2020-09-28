# **Markdown**
## 1. **Pattern Name and Classification:**

- Singleton, Padrao de Criacional

## 2. **Intent:**

- O Padrão Singleton define que uma, e somente uma instância concorrente de uma classe existirá no ciclo de vida da aplicação

## 3. **Motivition:**

- Temos diversas implementações de um algoritmo ou classe que seguem um “esqueleto” comum, mas que variam em alguns pequenos aspectos

## 4. **Applicability:**

- Aplicável para casos em que se precisa controlar a forma como a classe é instanciada.
 - O construtor da classe é protegido
 - Todo o programa usa o Singleton para acessar os comportamentos nele definidos.
 
## 5. **Structure:**

 ![Structure Composite Basic](https://github.com/Voknos/Activity_PoAd/blob/master/Singleton/Singletonimg.png)
 
## 6. **Participants:**

1. Singleton:
   - É a única classe deste padrão.
   - O construtor é privado, não sendo acessível externamente.
   
2. Client:
   - Usuario do Singleton.
   - Está interessado na instância, não importa se é uma só no programa todo.

## 7. **Sample Code:**

* Neste código é cria uma única instância de um novo objeto.
1. [github.com/Voknos/Activity_PoAd/tree/master/Singleton/Singleton](https://github.com/Voknos/Activity_PoAd/tree/master/Singleton/Singleton)

* Neste código é implementado uma classe que manipula um arquivo e aplicando o singleton garante que não havera mais de uma instância dessa classe no programa
 2. [github.com/Voknos/Activity_PoAd/tree/master/Singleton/SingletonArquivo](https://github.com/Voknos/Activity_PoAd/tree/master/Singleton/SingletonArquivo)
 
