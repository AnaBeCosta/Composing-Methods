# ATIVIDADE 4 
**Julia Stahl e Ana Beatriz Faria**

## Template Method

##### Refatoração aplicada:
Extraímos a repetição da lógica para um método separado **appendIfTrue()**, tornando o código mais modular, a técnica de refatoração usada é a extract method.

##### Relação com o Padrão de Design:
O Template Method Pattern define a estrutura geral de um algoritmo e permite que partes específicas sejam implementadas por subclasses ou métodos auxiliares.
No nosso caso, extraímos a repetição de if (config.includeUppercase) pool.append(UPPERCASE_LETTERS); para um método reutilizável.

Antes: 

<img src="https://github.com/user-attachments/assets/4307e33d-0a63-4934-9a02-09055daaa79e" width="450">

Depois:  

<img src="https://github.com/user-attachments/assets/c92a05b5-58ca-4a3b-94b7-7885572919a9" width="400">

## Builder

##### Refatoração aplicada:
Criamos a classe **AlphabetConfig** para evitar passar múltiplos parâmetros booleanos ao construtor da classe Alphabet. A técnica de refatoração usada é a Introduce Parameter Object.

##### Relação com o Padrão de Design:
O Builder Pattern (Padrão Construtor) é utilizado quando temos um objeto que precisa ser configurado com muitos parâmetros.
Embora o AlphabetConfig não seja exatamente um Builder, ele tem a mesma ideia de agrupar parâmetros em um objeto.

Antes: 

<img src="https://github.com/user-attachments/assets/571dd840-8362-4dad-8eef-eb620f0ac242" width="500">

Depois:  

<img src="https://github.com/user-attachments/assets/815048de-487e-4c11-8896-72e85ea173ce" width="400">
<img src="https://github.com/user-attachments/assets/03609794-8399-4c94-bf53-39fbdcd5afcd" width="400">
