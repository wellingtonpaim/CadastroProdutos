<h1 align="center">Título do Projeto: Cadastro de Produtos</h1>

<p align="center">API Restful para cadastro de produtos com organização por familias de produtos</p>

![Badge](https://img.shields.io/badge/WJBC-Sofwares-%237159c1?style=for-the-badge&logo=ghost)

<p align="center">
 <a href="#Objetivo">Objetivo</a> •
 <a href="#Features">Features</a> • 
 <a href="#Pré-Requisitos">Pré-Requisitos</a> •
 <a href="#Rodando-a-API">Rodando-a-API</a> • 
 <a href="#Tecnologias">Tecnologias</a> • 
 <a href="#MIT-License">MIT-License</a> • 
 <a href="#Autor-do-Projeto">Autor-do-Projeto</a>
</p>

<h4 align="center"> 
	🚧  API Restful 🚀 Em construção...  🚧
</h4>

## Objetivo

Este projeto tem como objetivo a construção de uma API Restful para gerenciar o cadastro de produtos e clientes, com um sistema automatizado de logs de alterações cadastrais

## Features

- [x] Cadastro de produtos
- [ ] Sistema de logs de alterações cadastrais
- [ ] Cadastro de cliente


## Pré-Requisitos

Para a utilização desta API será necessário uma JRE Versão 11 ou superior no ambiente de produção, e o MySql Server instalado no seu servidor de banco de dados, por padrão a api está apontando na porta padrão(3306) do MySql para utilizar uma porta distinta faça a devida alteração.

## Rodando-a-API

```bash
# Clone este repositório
$ git clone <https://https://github.com/wellingtonpaim/CadastroProdutos>

# Acesse o projeto em sua maquina com sua ide e faça a adequação das variáveis de ambiente utilizadas para o acesso ao banco de dados, no arquivo application.properties, sendo a variavel da url, do username e da password, respectivamente: DB_URL, DB_USER, DB_KEY, configure estas variáveis com os valores correspondentes ao seu banco de dados. Caso seja necessário alterar a porta de acesso ao banco de dados faça esta alteração no valor que segue na url como por exemplo em: spring.datasource.url=jdbc:mysql://localhost:3306/cadastro-produtos. O arquivo application.properties fica em:
$ src/main/resources/application.properties

# O arquivo executavel desta API está em src/target/cadastro-produtos.jar. Estando no diretorio acima citado, com o cmd ou terminal execute a aplicação com o comando:
$ java - jar cadastro-produtos.jar

# O servidor inciará na porta:8080 - acesse <http://localhost:8080>
```
## Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [Java-Versão - 11](https://java.com/)
- [Spring Boot - 2.7.3](https://spring.io/projects/spring-boot/)
- [MySql - 8.0.30](https://mysql.com/)
- [Maven - 4.0.0](https://maven.apache.org)

## MIT-License

Copyright (c) <2022> <Wellington Paim>

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

## Autor-do-Projeto


![Wellington Paim](https://github.com/wellingtonpaim/CadastroProdutos/blob/main/src/main/resources/static/fotoperfil.png)

<https://www.linkedin.com/in/paimwellington/>

<https://github.com/wellingtonpaim>