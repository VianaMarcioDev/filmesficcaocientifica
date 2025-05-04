# 🎬 Filmes de Ficção Científica em San Francisco

Aplicação backend desenvolvida em Java com Spring Boot que fornece uma API RESTful para consultar locações de filmes de ficção científica gravados em San Francisco, Califórnia, EUA. O projeto utiliza uma API pública como fonte de dados e segue boas práticas de desenvolvimento para ambientes de produção.

---

## 🚀 Funcionalidades

- 🔍 Consulta de filmes por título, ou todos.
- 📍 Informações sobre locações de filmagens em San Francisco.

---

## 🛠️ Tecnologias Utilizadas

- Java 17
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- Maven

---

## 📁 Estrutura do Projeto

filmesficcaocientifica/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/
│ │ │ └── vianamarciodev/
│ │ │ └── filmesficcaocientifica/
│ │ │ ├── controller/
│ │ │ ├── model/
│ │ │ ├── repository/
│ │ │ ├── service/
│ │ │ └── FilmesFiccaoCientificaApplication.java
│ │ └── resources/
│ │ ├── application.properties
│ │ └── data.sql
├── .gitignore
├── mvnw
├── mvnw.cmd
└── pom.xml

yaml
Copiar
Editar

---

## 📦 Instalação e Execução

### Pré-requisitos

- Java 17 ou superior
- Maven 3.8+

### Passos para execução

1. **Clone o repositório**

```bash
git clone https://github.com/VianaMarcioDev/filmesficcaocientifica.git
cd filmesficcaocientifica
Compile o projeto

bash
Copiar
Editar
./mvnw clean install
Execute a aplicação

bash
Copiar
Editar
./mvnw spring-boot:run
A aplicação estará disponível em http://localhost:8080/movies para listar todos e http://localhost:8080/query=title par busca por título .

🗃️ Fonte de Dados
Os dados utilizados sobre locações de filmes são provenientes de fontes públicas, como:

San Francisco Film Locations Dataset

🤝 Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

📝 Licença
Este projeto está licenciado sob a MIT License.

👨‍💻 Autor
Desenvolvido por Márcio Viana
