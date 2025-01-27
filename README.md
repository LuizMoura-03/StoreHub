# **StoreHub - Gerenciamento de Produtos**

Este projeto é uma aplicação para o gerenciamento de produtos, permitindo realizar operações de CRUD (Criar, Ler, Atualizar e Deletar) com validações específicas para os dados dos produtos.

## **Funcionalidades**
- **Cadastro de Produtos**: Adicione novos produtos ao sistema com informações como nome, preço, quantidade em estoque e categoria.
- **Listagem de Produtos**: Visualize todos os produtos cadastrados no sistema.
- **Busca de Produto por ID**: Consulte os detalhes de um produto específico.
- **Atualização de Produtos**: Atualize as informações de produtos existentes.
- **Exclusão de Produtos**: Remova produtos do sistema.

## **Tecnologias Utilizadas**
- **Java**: Linguagem principal do projeto.
- **Spring Boot**: Framework para criação de aplicações web.
- **JPA/Hibernate**: Para persistência de dados.
- **H2 Database**: Banco de dados em memória para testes e desenvolvimento.

## **Pré-requisitos**
- Java 17 ou superior instalado.
- Maven instalado para gerenciamento de dependências.

## **Como Baixar e Utilizar o Projeto**

1. **Clone o repositório**:
   ```bash
   git clone <git@github.com:LuizMoura-03/StoreHub.git>
   
2. **Navegue até a pasta do projeto**:

   cd StoreHub

3. **Execute o projeto**:

   mvn spring-boot:run

4. Acesse a aplicação**:

   http://localhost:8085/products

