# Sistema de Gerenciamento de Biblioteca - API REST

Este projeto é uma API REST simples para gerenciamento de livros e autores, desenvolvida com Spring Boot, Spring Data JPA e banco de dados H2 em memória. Atividade avaliativa prática.

## Componentes do Grupo
- Klayton 01812049
- Yuri 01821876

## Endpoints Disponíveis
- `POST /autores` - Cadastrar um autor
- `GET /autores` - Listar todos os autores
- `POST /livros` - Cadastrar um livro (associando ao ID de um autor)
- `GET /livros` - Listar todos os livros
- `PUT /livros/{id}` - Atualizar os dados de um livro existente
- `DELETE /livros/{id}` - Excluir um livro por ID

## Como Rodar
1. Importar o projeto na IDE como um projeto Maven.
2. Executar a classe principal da aplicação.
3. Acessar o banco de dados H2 em: `http://localhost:8080/h2-console` (URL: jdbc:h2:mem:bibliotecadb)
