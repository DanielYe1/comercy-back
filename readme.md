<h3 align="center">Back-end trabalho de projeto de software</h3>

Aplicação back-end de um sistema de compras de loja.

A aplicação já está rodando na url: http://ec2-54-242-33-175.compute-1.amazonaws.com:8080/


## Como compilar o código
Para rodar o projeto é necessário a utilização do java versão 8+, maven, docker e docker-compose.

Basta rodar os comandos:


  ```
  docker-compose up &
  sh run.sh
  ```
o script run.sh vem com os comandos necessários para recompilar o projeto e rodar o artefato gerado.

A aplicação utiliza a porta padrão 8080.

Para fazer o teste em conjunto com o front-end, pode-se popular o banco de itens com o json:
```
{
    "preco": 2000,
    "quantidade": 50,
    "codigoDeBarras": "12345",
    "urlImagem": "",
    "descricao": "caneca"
}
```
no endpoint: http://ec2-54-242-33-175.compute-1.amazonaws.com:8080/item, com o metodo POST

## Organização dos pacotes

<details open="open">
  <ol>
    <li>
      controller
      <ul>
      dto
      </ul>
    </li>
    <li>
    model
      <ul>
        <li>pagamentos</li>
        <li>pessoas</li>
        <li>repositorio</li>
        <li>vendas</li>
      </ul>
    </li>
    <li>service</li>
  </ol>
</details>

## Relatório

O relatório está na pasta raiz do projeto

