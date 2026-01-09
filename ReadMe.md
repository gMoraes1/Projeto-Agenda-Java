# Projeto de Agendamentos – Java & Spring Boot

## 📌 Descrição
Este projeto foi desenvolvido com o objetivo de **consolidar conceitos de Orientação a Objetos** e posteriormente evoluído para uma **API REST utilizando Spring Boot**.

Na primeira fase, o foco foi a modelagem do domínio aplicando **herança**, **polimorfismo** e boas práticas de programação em Java. Em sua evolução, o projeto passou a adotar a **arquitetura MVC**, camada de **Repository** e **banco de dados H2 em memória**, aproximando-se de um cenário real de aplicações back-end.

---

## 🧠 Conceitos Aplicados

- Orientação a Objetos (OO)
  - Encapsulamento
  - Herança
  - Polimorfismo
- Java Collections (`ArrayList`)
- Java Streams (filter, map, reduce, etc.)
- Arquitetura MVC
- API REST com Spring Boot
- Padrão Repository
- Persistência com JPA/Hibernate
- Banco de dados H2 em memória

---

## 🏗️ Estrutura do Projeto

```
src/main/java
 └── com.exemplo.projeto
     ├── controller   # Camada de controle (REST Controllers)
     ├── model        # Entidades do domínio
     ├── dto        # Entidades de validação do model
     ├── repository   # Interfaces de acesso a dados (JPA)
     ├── service      # Regras de negócio
     └── ProjetoApplication.java
```

---

## 📦 Principais Entidades

- **Cliente**  
  Representa os clientes do sistema.

- **Agendamento**  
  Responsável por armazenar informações de agendamentos realizados pelos clientes.

- **Serviço**  
  Classe base que representa um serviço comum.

- **ServiçoEspecial**  
  Extensão da classe Serviço, aplicando **herança** e **polimorfismo** para comportamentos específicos.

---

## 🔄 Evolução do Projeto

- ✔️ Modelagem OO em Java puro
- ✔️ Manipulação de dados com Java Streams
- ✔️ Migração para Spring Boot
- ✔️ Implementação de API REST
- ✔️ Arquitetura MVC
- ✔️ Persistência com JPA
- ✔️ Banco H2 em memória

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

---

## ▶️ Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone <https://github.com/gMoraes1/Projeto-Agenda-Java.git>
   ```

2. Acesse o diretório do projeto:
   ```bash
   cd projeto-Agenda-java
   ```

3. Execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```

4. A aplicação estará disponível em:
   ```
   http://localhost:8080
   ```

5. Console do H2:
   ```
   http://localhost:8080/h2-console
   ```

---

## 🧪 Objetivo do Projeto

Este projeto tem caráter **educacional**, focado em demonstrar evolução técnica, aplicação de conceitos fundamentais de Java e boas práticas no desenvolvimento de APIs REST com Spring Boot.

