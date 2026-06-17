# 📚 Sistema de Gerenciamento de Biblioteca

Projeto acadêmico Full-Stack desenvolvido para o gerenciamento e controle de um acervo de biblioteca. O sistema conta com uma interface Single Page Application (SPA) responsiva e uma API RESTful para realizar operações de CRUD (Create, Read, Update, Delete) de Autores e Livros.

## Desenvolvedores
* Klayton 01812049
* Yuri 01821876

## Tecnologias Utilizadas

**Frontend:**
* HTML5
* Tailwind CSS (via CDN)
* Vanilla JavaScript (Fetch API com requisições assíncronas)

**Backend:**
* Java
* Spring Boot
* Spring Data JPA / Hibernate
* Banco de Dados H2 (Em memória)

## Como Executar o Projeto

### 1. Inicializando o Backend (API)
O backend foi construído em Spring Boot e possui uma configuração de CORS global liberada para facilitar o acesso do frontend.

1. Abra a pasta do projeto Java na sua IDE (IntelliJ, Eclipse ou VS Code).
2. Execute a classe principal (`ProjetoEdjaneTentativaApplication.java`).
3. O Tomcat embutido iniciará o servidor automaticamente na **porta local 8080**.
   * A URL base da API será: `http://localhost:8080`

### 2. Inicializando o Frontend (Interface)
A comunicação do frontend com a API já está configurada para apontar para `http://localhost:8080` na constante `API_URL`.

1. Navegue até a pasta onde está o arquivo `index.html`.
2. Dê um duplo clique para abri-lo no seu navegador web preferido.
3. **Opcional:** Se estiver usando o VS Code, você pode abrir o HTML utilizando a extensão *Live Server* para uma experiência de desenvolvimento mais fluida.

## Endpoints Principais (Localhost:8080)

### Autores
* `GET /autores` - Retorna a lista de autores.
* `POST /autores` - Cadastra um novo autor.
* `PUT /autores/{id}` - Atualiza os dados de um autor.
* `DELETE /autores/{id}` - Remove um autor do banco.

### Livros
* `GET /livros` - Retorna a lista de livros (incluindo o ID do autor relacionado).
* `POST /livros` - Cadastra um novo livro. *(Exige o ID do autor no formato JSON aninhado)*.
* `PUT /livros/{id}` - Atualiza os dados de um livro.
* `DELETE /livros/{id}` - Remove um livro do banco.

---
*Projeto desenvolvido para fins acadêmicos.*
