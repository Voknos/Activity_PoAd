# **Markdown**

## 1. **Pattern Name and Classification:**
* Padrão Observer
* Padrão Comportamental

## 2. **Intent:**
*  Permitir que objeto publique mudanças de estado. Além disso
permite que outros objetos se inscrevam para receber notificações sobre estas mudanças.

## 3. **Motivition:**
* Proporciona baixo acoplamento entre a classe que notifica sobre mudanças e outras classes que recebem esta notificação.

* A classe a ser observada possui uma coleção de observadores que são definidos em tempo de execução (runtime).
## 4. **Applicability:**
* Receber notificação sobre mudanças de estado em outros objetos quando esta mudança for relevante.

* Diminuir acoplamento entre classes dependentes através do encapsulamento.

* Quando uma mudança a um objetos requer mudanças a outros e você não sabe quantos outros objetos devem mudar ou quando um objeto deve ser capaz de avisar outros sem fazer suposições sobre quem são os objetos.

## 5. **Structure:**
![Observer](https://github.com/SsmoothSmooth/Estudo/blob/master/01%20-%20Programa%C3%A7%C3%A3o%20avan%C3%A7ada/Assets/Observer.png)

## 6. **Participants:**

######    **Subject:**
* É a classe que possui a informação o estado que se deseja observar.

######    **Observer:**
* Interface que define os métodos de notificação de interesse dos observadores. 

######    **ConcreteObserverA, ConcreteObserverB:**
* Classes concretas que observam a classe Subject. 


## 7. **Sample Code:**
1. [github.com/SsmoothSmooth/Estudo/Padrão de projetos/Observer/ObserverPattern/](https://github.com/SsmoothSmooth/Estudo/tree/master/01%20-%20Programa%C3%A7%C3%A3o%20avan%C3%A7ada/Padr%C3%A3o%20de%20projetos/Observer/ObserverPattern)
* Neste código é criado uma classe abstrada observer, ele guarda a instancia Subject quando é notificado a mudança de status ele faz um update do que mudou;


