# **StoreHub - Gerenciamento de Produtos**

Este projeto é uma aplicação para o gerenciamento de produtos, permitindo realizar operações de CRUD (Criar, Ler,
Atualizar e Deletar) com validações específicas para os dados dos produtos.

## **Funcionalidades**

- **Cadastro de Produtos**: Adicione novos produtos ao sistema com informações como nome, preço, quantidade em estoque e
  categoria.
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


4. **Acesse a aplicação**:

   http://localhost:8085/products


5. **Acesse o console do banco de dados H2**

URL: http://localhost:8085/h2-console

 **Configurações:**
JDBC URL: jdbc:h2:mem:storehubdb

 **User Name**: sa

 **Password: (deixe em branco)**


## **Endpoints Disponíveis**

 **Acesse os endpoints da aplicação**:
 * Listar Produtos: http://localhost:8085/products (método GET) 
 * Buscar Produto por ID: http://localhost:8085/products/{id} (método GET)
 * Cadastrar Produto: http://localhost:8085/products (método POST)
 * Atualizar Produto: http://localhost:8085/products/{id} (método PUT)
 * Excluir Produto: http://localhost:8085/products/{id} (método DELETE)

  **Produtos:**
1. Listar Produtos
   Método: GET
   URL: http://localhost:8085/products
   Descrição: Retorna a lista de todos os produtos cadastrados.
   
       Exemplo de Resposta:
   [
   {
   "id": 3,
   "name": "Arroz",
   "descricao": "Pacote de arroz de 5kg",
   "preco": 29.99,
   "estoque": 100,
   "categoria": "ALIMENTOS"
   },
   {
   "id": 4,
   "name": "Camiseta",
   "descricao": "Camiseta de algodão tamanho M",
   "preco": 49.9,
   "estoque": 200,
   "categoria": "ROUPAS"
   }
   ]


 2. Buscar Produto por ID
    Método: GET
    URL: http://localhost:8085/products/{id}
    Descrição: Retorna os detalhes de um produto específico pelo ID.

        Exemplo de Resposta:

    {
   "id": 3,
   "name": "Arroz",
   "descricao": "Pacote de arroz de 5kg",
   "preco": 29.99,
   "estoque": 100,
   "categoria": "ALIMENTOS"
   }


 3. Cadastrar Produto
    Método: POST
    URL: http://localhost:8085/products
    Body (JSON):
    {
    "name": "Celular",
    "descricao": "Smartphone com 128GB",
    "preco": 1500.99,
    "estoque": 10,
    "categoria": "ELETRONICOS"
    }

          Exemplo de Resposta:
    {
 "id": 5,
 "name": "Celular",
 "descricao": "Smartphone com 128GB",
 "preco": 1500.99,
 "estoque": 10,
 "categoria": "ELETRONICOS"
 }
 

 4. Atualizar Produto
    Método: PUT
    URL: http://localhost:8085/products/{id}
    Body (JSON):
    {
    "name": "Celular Atualizado",
    "descricao": "Smartphone com 256GB",
    "preco": 2000.99,
    "estoque": 8,
    "categoria": "ELETRONICOS"
    }

        Exemplo de Resposta:
    {
"id": 5,
"name": "Celular Atualizado",
"descricao": "Smartphone com 256GB",
"preco": 2000.99,
"estoque": 8,
"categoria": "ELETRONICOS"
}


5. Excluir Produto
   Método: DELETE
   URL: http://localhost:8085/products/{id}
   Descrição: Remove um produto do sistema.
   Exemplo de Resposta:
   Status: 204 No Content


## **Validações**
* O nome do produto é obrigatório e deve ter entre 3 e 100 caracteres.
* O preço do produto é obrigatório e deve ser maior que zero.
* A quantidade em estoque é obrigatória e deve ser maior ou igual a zero.
* A categoria do produto é obrigatória e deve ser uma das opções válidas (ex.: ELETRONICOS, ROUPAS, ALIMENTOS).

