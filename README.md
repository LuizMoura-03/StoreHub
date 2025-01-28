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


## **Diagrama UML de Classes**
**Abaixo está o diagrama UML de classes que representa a estrutura do projeto:**

![Diagrama de Classes - StoreHub](src/main/resources/docs/DiagramaDeClasseStoreHub.png)
 
*Explicação do Diagrama*

  **1. ProductController:**

  É o ponto de entrada da aplicação para lidar com requisições HTTP relacionadas a produtos.
  
**Ligação:** Depende do ProductService para realizar as operações de negócio. Ele chama os métodos do ProductService para
buscar, criar, atualizar ou deletar produtos

   **2. ProductService:**

  Contém a lógica de negócios para manipular os produtos.

 **Ligação:** Depende do ProductRepository para acessar o banco de dados. Ele utiliza o ProductRepository para realizar 
 operações como salvar, buscar, atualizar e deletar produtos no banco de dados.

  **3. ProductRepository:**

  É uma interface que estende o JpaRepository do Spring Data JPA.

  **Ligação:**  Está diretamente conectado ao ProductModel, pois manipula a entidade ProductModel no banco de dados.
  Ele fornece métodos prontos para persistir e recuperar dados.

  **4. ProductModel:**

  Representa a entidade Product no banco de dados.

  **Ligação:**  Está relacionado ao ProductRepository, que é responsável por salvar e recuperar instâncias
  dessa classe no banco de dados.

  **Ligação:**  Possui um atributo chamado categoria, que é do tipo CategoriaProduto (um Enum).

  **5. CategoriaProduto:**

  É um Enum que define as categorias possíveis para os produtos(ELETRONICOS, ROUPAS e ALIMENTOS).

  **Ligação:** Está relacionado ao ProductModel através do atributo categoria. Cada produto deve ter uma
  categoria definida com base nesse Enum.

 ## Resumo das Ligações ## 
 *ProductController -> ProductService: O ProductController chama os métodos do ProductService para realizar as operações de negócio.
 
*ProductService -> ProductRepository: O ProductService utiliza o ProductRepository para acessar o banco de dados.
 
*ProductRepository -> ProductModel: O ProductRepository manipula diretamente a entidade ProductModel no banco de dados.
 
*ProductModel -> CategoriaProduto: O ProductModel possui um atributo chamado categoria, que é do tipo CategoriaProduto.

