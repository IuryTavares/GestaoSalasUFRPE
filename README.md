# GestaoSalasUFRPE
Projeto de IP2 referente à segunda avaliação do período 2018.1.

## Requisitos

- Versão do Java: Java SE Development Kit 10.0.1
- Implementado no Compilador e Editor: IntelliJ IDEA
- Bibliotecas Utilizadas: JavaFX, JavaIO e JavaUtil

## Requisitos Funcionais:

- Cadastro de novos Professores ou alunos
- Alocação de Salas ou desalocação
- Consulta de disponibilidade de salas em cada prédio
- Sistema de login/senha

## Instruções de Uso:

####Instalação:
- Para utilizar o programa de Gestão de Salas UFRPE, basta ir na pasta fonte do programa, e executar o arquivo "GestaoSalasUFRPE.jar".

####Uso interno do programa:
- Caso seja o administrador do sistema, basta logar com Login: admin e Senha: admin, que será redirecionado para um menu específico para Administradores, onde poderá fazer o Cadastro de: Salas, Professores, e novas Alocações, além de obter listas de salas alocadas e de professores cadastrados no sistema.
- Caso seja Professor, utilizando-se de seu Login e Senha providos pelo administrador, poderá Alocar Salas e Consultar as Salas já alocadas.

#### Instruções ao Administrador:
 - Para cadastrar uma nova Sala, basta informar o que se pede na Tela de Cadastro de Salas, quando uma nova sala é criada, um ID para a mesma é gerado automáticamente pelo algoritmo.
 - Para cadastrar um novo Professor, basta informar o que se pede na Tela de Cadastro de Professor, e, ceder o login e senha para o novo Professor cadastrado.
 - Para Alocar uma Sala, basta informar o professor, o ID da Sala, mostrado na primeira coluna da Tabela de Salas, a Hora de Início e a Hora de Fim do uso da sala, além da data da Alocação.
 
#### Instruções ao Professor: 
 - Para Alocar uma Sala, basta informar seu CPF, o ID da Sala, mostrado na primeira coluna da Tabela de Salas, a Hora de Início e a Hora de Fim do uso da sala, além da data da Alocação.

## Definição da arquitetura: 

![alt text](https://imgur.com/UKjap4U.png)

