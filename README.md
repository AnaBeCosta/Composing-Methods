# ATIVIDADE 4 - Refatorações
**Julia Stahl e Ana Beatriz Faria**

## Extract Method

##### Objetivo:
O padrão Extract Method é utilizado para melhorar a legibilidade e reutilização do código, extraindo trechos de código repetitivos ou complexos para um novo método, facilitando a manutenção e a compreensão.

##### Implementação:
Criamos o método *appendIfTrue()* para evitar código repetitivo e melhorar a organização do código.

Antes: 

<img src="https://github.com/user-attachments/assets/4307e33d-0a63-4934-9a02-09055daaa79e" width="450">

Depois:  

<img src="https://github.com/user-attachments/assets/c92a05b5-58ca-4a3b-94b7-7885572919a9" width="400">

## Introduce Parameter Object

##### Objetivo:
O padrão Introduce Parameter Object é aplicado para reduzir a quantidade de parâmetros em um método, agrupando-os dentro de um objeto. Isso melhora a clareza, facilita a evolução do código e evita listas extensas de argumentos.

##### Implementação:
Criamos a classe *AlphabetConfig* para agrupar os parâmetros booleanos, reduzindo a quantidade de argumentos passados para os métodos e melhorando a legibilidade do código.

Antes: 

<img src="https://github.com/user-attachments/assets/571dd840-8362-4dad-8eef-eb620f0ac242" width="500">

Depois:  

<img src="https://github.com/user-attachments/assets/815048de-487e-4c11-8896-72e85ea173ce" width="400">
<img src="https://github.com/user-attachments/assets/03609794-8399-4c94-bf53-39fbdcd5afcd" width="400">
