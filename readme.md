<h3 align="center">Back-end trabalho de projeto de software</h3>

<p align="center">
    Aplicação back-end de um sistema de compras de loja  </p>


## Como compilar o código
Para rodar o projeto é necessário a utilização do java versão 8+, maven, docker e docker-compose.

Basta rodar os comandos:


  ```sh
  docker-compose up &
  sh run.sh
  ```
o script run.sh vem com os comandos necessários para recompilar o projeto e rodar o artefato gerado.

A aplicação utiliza a porta padrão 8080.

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
