# Spring REST API Forum

<p align="center">
    <img alt="Badge indicando que o projeto foi criado em novembro de 2022" src="https://img.shields.io/badge/Data%20de%20cria%C3%A7%C3%A3o-Novembro%2F2022-blue">
    <img alt="Badge indicando que o status do projeto é 'Em desenvolvimento'" src="https://img.shields.io/badge/Status-Em_Desenvolvimento-yellow">
</p>

<p align="center">
    • <a href="#API Forum">API Forum</a>
    • <a href="#descricao">Descrição</a>
    • <a href="#tecnologias">Tecnologias</a>
    • <a href="#Desenvolvedor">Desenvolvedor</a>
    • <a href="#funcionamento">Funcionamento</a>
</p>

<h2 id="API Forum"> :computer_mouse: API Forum?</h2>

O projeto segue o modelo REST de uma API tradicional, encontrada no mercado tecnologico atual. Todas as boas práticas, arquitetura e funcionalidades estão atualizadas e alinhadas com o que é requisitado de um profissional. O projeto conta com as funcionalidades básicas de um CRUD, uma conexão ao banco de dados, validação da entrada de dados, tratamento de erros, autorização e autenticação de usuários stateless via Token, aplicação de cache e monitoramento.

<h2 id="descricao">:pencil2: Descrição</h2>

### O que faz?

O usuário pode realizar requisições com os métodos GET, sem a necessidade de autorização para tal. Em métodos que realizam alguma alteração no banco de dados, faz-se necessário o uso de um Token.<br>
#### O token pode ser obtido realizando uma requisição para "/auth", no corpo da requisição deve haver:
    {
    "email" : "victor@email.com",
    "senha" : "123456"
    }
A partir disso, um token será gerado e o usuário deve utiliza-lo como autorização do tipo bearer token em todas as requisições. Para fins de desenvolvimento e testes, o token possui validade de um dia (1 dia), podendo ser configurado pelo desenvolvedor.<br>
O usuário pode encontrar na documentação gerada via Swagger, as informações gerais da API, bem como os métodos disponilizados.
#### Para acessar a documentação via Swagger, deve-se acessar:
    localhost:8080/swagger-ui.html

### Qual o objetivo?

O objetivo principal do projeto é a consolidação do conhecimento a respeito do desenvolvimento de uma API REST, seguindo os modelos e boas práticas de desenvolvimento do mercado atual.


<h2 id="tecnologias">:computer: Tecnologias</h2>
<p align="center">
  <a href="https://www.java.com/pt-BR/">
    <img width="48px" alt="Logo do Java" src="https://img.icons8.com/color/48/000000/java--v1.png">
  </a>
  <a href="https://www.eclipse.org/">
    <img width="48px" alt="Logo do Eclipse IDE" src="https://user-images.githubusercontent.com/12565871/49321219-6cdf9100-f506-11e8-82f5-b7a40bba3e86.png">
  </a>
  <a href="https://maven.apache.org/">
    <img width="48px" alt="Logo do gerenciador de dependencias Maven" src="https://roufid.com/wp-content/uploads/2016/05/eyecatch-maven.png">
  </a>
  <a href="https://spring.io/">
    <img width="48px" alt="Logo do framwork Spring" src="https://img.icons8.com/color/480/spring-logo.png">
  </a>
  <a href="https://spring.io/projects/spring-boot">
    <img width="48px" alt="Logo do Spring boot" src="https://images.ctfassets.net/gt6dp23g0g38/5DqlQtFKecFlkqQ8YGDT2p/aa945b648f44dd872e9a1b89f7d203ef/springboot.png">
  </a>
  <a href="https://spring.io/projects/spring-data">
    <img width="48px" alt="Logo do Spring Data" src="https://pbs.twimg.com/profile_images/1235945452304031744/w55Uc_O9_400x400.png">
  </a>
  <a href="https://swagger.io/">
    <img width="48px" alt="Logo api Swagger" src="https://seeklogo.com/images/S/swagger-logo-A49F73BAF4-seeklogo.com.png">
  </a>
  <a href="https://github.com/codecentric/spring-boot-admin">
    <img width="48px" alt="Logo do projeto SpringBootAdmin" src="https://nirajsonawane.github.io/asset/logo-spring-boot-admin.png">
  </a>
  <a href="https://beanvalidation.org/">
    <img width="48px" alt="Logo api de validação Bean Validation" src="https://beanvalidation.org/logo/logo.svg">
  </a>
  
</p>



<h2 id="Desenvolvedor">:man: Desenvolvedor</h2>

<p align="center">
  <a href="https://github.com/vitucomment">
    <img width="120px" src="https://avatars.githubusercontent.com/u/101343369?" alt="desenvolvedor do projeto MUDI">
  </a>
</p>

<p align="center">
Victor Sousa Almeida
</p>

<p align="center">
<a href="https://www.linkedin.com/in/devitu-py/">@Linkedin</a>
</p>

<h2 id="funcionamento">:eye_speech_bubble: Funcionamento</h2>

   ![gif](https://github.com/vitucomment/Spring-REST-API-Forum/blob/master/gif/ForumTeste.gif)
