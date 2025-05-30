# Java Application:

Engineering focused on the following structural concepts: Core Isolation, Safety, Reusability, Separation of Concerns – SoC.

## Status: Developing

[![Generic badge](https://img.shields.io/badge/status-developing-yellow.svg)](/#/)

````
📦Java-Application
 ┣ 📂docker-local
 ┃ ┣ 📜docker-compose.yml
 ┣ 📂src
 ┃ ┣ 📂main
 ┃ ┃ ┣ 📂java
 ┃ ┃ ┃ ┣ 📂com
 ┃ ┃ ┃ ┃ ┗ 📂luiza
 ┃ ┃ ┃ ┃ ┃ ┗ 📂arch
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂config
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂core
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dataprovider
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FindClienteById.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FindRegiaoByCep.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜InsertCliente.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SendCpfValidacao.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂domain
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Cliente.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Regiao.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂usecase
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂impl
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FindClienteByIdUseCaseImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜InsertClienteUseCaseImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FindClienteByIdUseCase.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜InsertClienteUseCase.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dataprovider
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂client
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂mapper
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜RegiaoResponseMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂response
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜RegiaoResponse.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜FindRegiaobyCepCliente.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂repository
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂mapper
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ClienteTabelaMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂tabelas
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ClienteTabela.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜RegiaoTabela.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ClienteRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Regiao.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FindRegiaoByCepImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜InsertClientImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂eventdriven
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂consumer
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂producer
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Application.java
 ┃ ┃ ┗ 📂resources
 ┃ ┃ ┃ ┣ 📜application.yml
 ┃ ┗ 📂test
 ┃ ┃ ┣  📂java
 ┣ 📜.gitignore
 ┣ 📜mvnw
 ┣ 📜mvnw.cmd
 ┣ 📜pom.xml
 ┗ 📜README.md
````
