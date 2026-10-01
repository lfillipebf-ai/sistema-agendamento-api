# Sistema de Agendamento API

API REST para gerenciamento de clientes, profissionais e agendamentos.

## Tecnologias
Java 17, Spring Boot, Spring Data JPA, PostgreSQL, Maven, Docker e REST API.

## Funcionalidades
- Cadastro de clientes
- Cadastro de profissionais
- Cadastro de serviços
- Criação de agendamentos
- Consulta e cancelamento de agendamentos
- Validação de dados
- Persistência em PostgreSQL

## Execução
```bash
docker compose up --build
```

API: http://localhost:8080

## Endpoints
- GET/POST /api/clients
- GET/POST /api/professionals
- GET/POST /api/services
- GET/POST /api/appointments
- DELETE /api/appointments/{id}

Projeto educacional/portfólio desenvolvido para praticar APIs REST, Java, Spring Boot, banco de dados e orientação a objetos.

Autor: Luis Fillipe Backer Faria
GitHub: https://github.com/lfillipebf-ai
