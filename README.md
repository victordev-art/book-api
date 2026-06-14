<div align="center">

<img width="100%" src="https://capsule-render.vercel.app/api?type=waving&color=0:0f0c29,50:1a4731,100:0f0c29&height=160&section=header&text=Book%20API&fontSize=36&fontColor=ffffff&fontAlignY=38&desc=API%20REST%20de%20Livros%20com%20Spring%20Boot%20%2B%20PostgreSQL&descAlignY=58&descSize=14&animation=fadeIn"/>

</div>

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-22c55e?style=for-the-badge)

</div>

---

## 📖 Sobre o Projeto

> API REST completa para gerenciamento de livros, desenvolvida como projeto de estudo para aprender **Java com Spring Boot** na prática. A aplicação segue arquitetura em camadas e aplica boas práticas de desenvolvimento back-end.

---

## 🧠 O que aprendi

### ☕ Fundamentos Java
| Conceito | Descrição |
|---|---|
| Classes, construtores | Estrutura e organização do código orientado a objetos |
| Getters e Setters | Encapsulamento e acesso aos atributos |
| Anotações | `@Entity`, `@RestController`, `@Service` e outras |
| Injeção de dependência | Inversão de controle via construtor |

### 🌱 Spring Boot
| Conceito | Descrição |
|---|---|
| Arquitetura em camadas | Controller → Service → Repository → Banco |
| CRUD completo | `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping` |
| Validação | `@Valid`, `@NotBlank`, `@NotNull` |
| Tratamento de erros | `@RestControllerAdvice` para respostas padronizadas |

### 🗄️ Banco de Dados
| Conceito | Descrição |
|---|---|
| PostgreSQL + Spring | Configuração e conexão com banco relacional |
| JPA e Hibernate | Mapeamento de classes Java em tabelas do banco |
| Anotações JPA | `@Entity`, `@Table`, `@Id`, `@GeneratedValue` |
| Spring Data JPA | Queries automáticas como `findByAuthor` |

### 🔧 Ferramentas
| Ferramenta | Uso |
|---|---|
| Maven | Gerenciamento de dependências |
| pgAdmin | Administração visual do banco de dados |
| Thunder Client | Testes de endpoints da API |
| VS Code | Ambiente de desenvolvimento |

---

## 🏗️ Arquitetura

```
book-api/
├── controller/        # Recebe as requisições HTTP
│   └── BookController.java
├── service/           # Regras de negócio
│   └── BookService.java
├── repository/        # Comunicação com o banco
│   └── BookRepository.java
├── model/             # Entidade do banco de dados
│   └── Book.java
└── exception/         # Tratamento de erros
    └── GlobalExceptionHandler.java
```

---

## 🔗 Endpoints

| Método | Rota | Descrição |
|---|---|---|
| `GET` | `/books` | Lista todos os livros |
| `GET` | `/books/{id}` | Busca livro por ID |
| `POST` | `/books` | Cadastra novo livro |
| `PUT` | `/books/{id}` | Atualiza um livro |
| `DELETE` | `/books/{id}` | Remove um livro |

---

## 🛠️ Tecnologias Utilizadas

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![pgAdmin](https://img.shields.io/badge/pgAdmin-316192?style=for-the-badge&logo=postgresql&logoColor=white)

</div>

---

## 🚀 Como executar

```bash
# Clone o repositório
git clone https://github.com/victordev-art/book-api

# Entre na pasta
cd book-api

# Configure o banco no application.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/bookdb
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

# Execute com Maven
./mvnw spring-boot:run
```

---

## 👨‍💻 Autor

<div align="center">

**Victor Oliveira Bezerra**
Engenheiro de Software | Especializando em Back-End

[![GitHub](https://img.shields.io/badge/GitHub-victordev--art-6DB33F?style=for-the-badge&logo=github)](https://github.com/victordev-art)
[![Email](https://img.shields.io/badge/Email-dev.oliveira1717@gmail.com-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:dev.oliveira1717@gmail.com)

</div>

<div align="center">
<img width="100%" src="https://capsule-render.vercel.app/api?type=waving&color=0:0f0c29,50:1a4731,100:0f0c29&height=100&section=footer"/>
</div>
