# Sistema de Gerenciamento de Biblioteca com Spring Boot 📚

## Descrição

Este projeto é um sistema de gerenciamento que permite o cadastro de livros na biblioteca.

## Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas antes de começar:

- Java 17
- Maven
- Thunder Client ou ECHOAPI (Extensao do INTELLIJ) são softwares de requests HTTP

## Funcionalidades

### Cadastro de Livros

- Não será permitido cadastrar livro com nome, isbn, autor, editora e ano de publicacao nulo.
- Exemplo de requisição para cadastro de livro:

```json
{
  "isbn": "9781234567897",
  "nome": "Dom Quixote",
  "autor": "Miguel de Cervantes",
  "editora": "Editora A",
  "ano_publicacao": "1605-01-16",
  "disponivel": true
}
```

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- Models: Contém as classes de entidade.
- Repositories: Contém as interfaces de repositório.
- Services: Contém a lógica de negócios e as validações.
- Controllers: Contém os endpoints da API.

Dependências

- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok

Executando o Projeto

1. Clone o repositório:

```bash
git clone https://github.com/WendellBaresiZup/grupo3.git
Navegue até o diretório do projeto: src/main/java/br/com/zup/dinamica_em_grupo_biblioteca/DinamicaEmGrupoBibliotecaApplication.java
```
2. Navegue até o diretório do projeto:
```bash
cd e-ecommerce
Execute o projeto: DinamicaEmGrupoBibliotecaApplication.java
```
3. Execute o projeto:
```bash
Clicando com o botao direito em cima da classe DinamicaEmGrupoBibliotecaApplication.java e clique Run 'DinamicaEmGrupoBibliotecaApplication.java...main()'
```
O projeto estará disponível em http://localhost:8080


Endpoints da API

Endpoints da API
- POST /cadastrarLivro: Cadastrar um novo livro.
- GET /listarLivros: Listar todos os livros.
- PUT /atualizarLivro/{id}: Atualizar um livro existente.
- DELETE /excluirLivro/{id}: Deletar um livro.

Contribuições

- Se você deseja contribuir com o projeto, sinta-se à vontade para enviar pull requests ou fazer comentários.
