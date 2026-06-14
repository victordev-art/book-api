# 📚 Books API

API REST para gerenciamento de livros, desenvolvida com **Spring Boot 3** e **PostgreSQL**.

## 🛠️ Tecnologias

- Java 17
- Spring Boot 3.2
- Spring Data JPA
- PostgreSQL
- Lombok
- Maven

## 🚀 Como rodar

### Pré-requisitos
- Java 17+
- Maven
- PostgreSQL rodando localmente

### 1. Criar o banco de dados

```sql
CREATE DATABASE booksdb;
```

### 2. Configurar credenciais

Edite o arquivo `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/booksdb
spring.datasource.username=postgres
spring.datasource.password=sua_senha_aqui
```

### 3. Rodar a aplicação

```bash
mvn spring-boot:run
```

A API estará disponível em: `http://localhost:8080`

---

## 📌 Endpoints

| Método | Rota | Descrição |
|--------|------|-----------|
| GET | `/api/books` | Lista todos os livros |
| GET | `/api/books/{id}` | Busca livro por ID |
| POST | `/api/books` | Cria novo livro |
| PUT | `/api/books/{id}` | Atualiza livro |
| DELETE | `/api/books/{id}` | Remove livro |
| GET | `/api/books/search?author=` | Busca por autor |
| GET | `/api/books/search?genre=` | Busca por gênero |
| GET | `/api/books/search?title=` | Busca por título |

---

## 📦 Exemplo de payload

```json
{
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "isbn": "978-0132350884",
  "genre": "Tecnologia",
  "publishedAt": "2008-08-01",
  "price": 89.90
}
```

---

## 🗂️ Estrutura do projeto

```
src/
└── main/
    └── java/com/example/booksapi/
        ├── controller/     # Camada HTTP (REST)
        ├── service/        # Regras de negócio
        ├── repository/     # Acesso ao banco (JPA)
        ├── model/          # Entidades JPA
        ├── dto/            # Objetos de transferência
        └── exception/      # Tratamento de erros
```
