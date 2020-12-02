# **Markdown**

## 1. **Pattern Name and Classification:**
* Padrão strategy ou chamado Policy
* Padrão Comportamental

## 2. **Intent:**
*  Delega responsabilidades, aumentando coesão e aprimorando a comunicação entre objetos.

* Strategy permite que o algoritmo varie independentemente dos clientes que o utilizam.

## 3. **Motivition:**
* Permite definir novos algoritmos sem alterar as classes dos elementos sobre os quais opera. Facilitar a escolha dos algoritmos criados para uma determinada função.

* Segundo GoF: Definir uma família de algoritmos, encapsular cada uma delas e torná-las intercambiáveis. Strategy permite que o algoritmo varie independentemente dos clientes que o utilizam.

## 4. **Applicability:**
* Quando se tem muitas classes que se relacionam e que diferem no modo de atuação.

* Quando há a necessidade de variar (intercambiar) o algoritmo de acordo com as condições da chamada.

## 5. **Structure:**
![Strategy](https://github.com/SsmoothSmooth/Estudo/blob/master/01%20-%20Programa%C3%A7%C3%A3o%20avan%C3%A7ada/Assets/Strategy.png)

## 6. **Participants:**

######    **Context:**
* Define e mantém a referência para um classe Strategy específica.

######    **Strategy:**
* Interface (ou classe abstrata) comum a todos os algoritmos suportados.

######    **ConcreteStrategy:**
* Um ou mais algoritmos fornecidos para a aplicação.

## 7. **Sample Code:**
1. [github.com/SsmoothSmooth/Estudo/Padrão de projetos/Strategy/StrategyPatten/](https://github.com/SsmoothSmooth/Estudo/tree/master/01%20-%20Programa%C3%A7%C3%A3o%20avan%C3%A7ada/Padr%C3%A3o%20de%20projetos/Strategy/StrategyPatten)
* Neste exemplo o padrão strategy é fica responsável de atribuir o calculo do imposto conforme o cargo dos funcionarios 


