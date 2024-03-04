<div align='center'>
  <image src="src/main/resources/images/logo.png"></image>
</div>

## - Desenvolvedor 
  - <a href="https://www.linkedin.com/in/bruno-miguel-correa-17904829b/">Bruno Miguel Correa </a>

## - Objetivos

- [x] [Ex 1 - Spring Initializer e Repositório no GitHub](#-m1s8-ex-1-spring-initializer-e-repositorio-no-github)
- [x] [Ex 2 - Alunos](#-m1s8-ex-2---alunos)
- [x] [Ex 3 - Cursos](#-m1s8-ex-3---cursos)
- [ ] [Ex 4 - Service: Alunos](#-m1s8-ex-4---service:-alunos)
- [ ] [Ex 5 - Service: Cursos]()
- [ ] [Ex 6 - Controller: Alunos]()
- [ ] [Ex 7 - Controller: Cursos]()
- [ ] [Ex 8 - Matricular Alunos]()


## [M1S8] Ex 1 - Spring Initializer e Repositório no GitHub

### - Descrição:

Crie um projeto Spring para gerenciamento de uma instituição de ensino. 

**Obs:** Fique à vontade para dar o nome do projeto. 

**Atenção!** <br>

Não esqueça de utilizar seus commits após o desenvolvimento.

## [M1S8] Ex 2 - Alunos

### Descrição

A primeira implementação do projeto:

Crie uma classe _Aluno_.  
A classe deve conter ao menos os atributos:

* ID (Sequencial)
* Nome
* Data de Nascimento

**!!! IMPORTANTE !!!**

1. A classe deve conter um método estático para controlar a sequência dos IDs.
2. A classe deve estar devidamente encapsulada.
3. O atributo ID não deve possuir um método "`set`".

## [M1S8] Ex 3 - Cursos

### Descrição

O próximo passo:

Crie uma classe _Cursos_.  
A classe deve conter ao menos os atributos:

- ID (Sequencial)
- Nome
- Descrição
- Carga Horária

**!!! IMPORTANTE !!!**

1. A classe deve conter um método estático para controlar a sequencia dos IDs.
2. A classe deve estar devidamente encapsulada.
3. O atributo ID não deve possuir um método "`set`".

## [M1S8] Ex 4 - Service: Alunos

### Descrição

Com todas as nossas classes modelo criadas:

Crie uma classe *Service* para manter a regra de negócio dos alunos:

- Cadastro de alunos
- Consulta de todos os alunos

**!!! Atenção!!!**

Para concluir o exercício será necessário realizar adequações na clase _Aluno_:
* Utilize um atributo estático e privado para armazenamento dos _alunos_ cadastrados.
  * crie um método "`get`".
  * crie um método responsável pela inclusão

## [M1S8] Ex 5 - Service: Cursos

### Descrição

Seguindo com as classes _Service_:

crie uma classe _Service_ para manter a regra de negócio dos cursos:

- Cadastro de cursos
- Consulta de todos os cursos

**!!! Atenção !!!**

Para concluir o exercício será necessário realizar necessário realizar adequações na classe _Curso_:

- Utilize um atributo estático e privado para o armazenamento dos _cursos_ cadastrados
  - crie um método "`get`";
  - crie um método responsável pela inclusão

## [M1S8] Ex 6 - Controller: Alunos

### Descrição

Com todos os services criados:

Crie uma classe *Controller* para os _alunos_.  
O Controlador deve conter métodos para:

* Cadastro de novos alunos(**POST**)
* Consulta de todos os alunos (**GET**)

**!!! Atenção !!!**

Utilize a injeção de dependências para usar a classe _Service_ de alunos

## [M1S8] Ex 7 - Controller: Cursos


### Descrição

Assim como foi criada para os Alunos, faça o mesmo com os Cursos

Crie uma classe *Controller* para os _cursos_.  
O Controlador deve conter métodos para:

* Cadastro de novos cusros(**POST**)
* Consulta de todos os cursos (**GET**)

**!!! Atenção !!!**

Utilize a injeção de dependências para usar a classe _Service_ de cursos

## [M1S8] Ex 8 - Matricular Alunos

### Descrição

No _Controller_ de _cursos_ crie um novo métodod para matricular alunos no curso  
O método deve receber:

* ID do curso no _Path Parm_;
* ID do aluno no _RequestBody_.

Para concluir o exercício será necessário realizar adequações no projeto:

* Na classe _Curso_:
  * crie um atributo para representar uma lista de alunos matriculados;
  * utilize encapsulamento
* No _Service_ de alunos:
  * crie um método para encontrar um _aluno_usando seu ID.
* No _Service_ de cursos:
  * crie um método para encontrar um _curso_ usando seu ID;
  * crie um método para realizar a matrícula (inclusão de um _aluno_ na lista de alunos).

**Obs:** A regra de negócios deverá sempre ser utilizada no _Service_, não utilize o controlador para realizar buscas ou inserções.













