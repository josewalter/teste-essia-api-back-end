# INSTRUÇÕES DA API ESSIA

# 1° passo
 OBS: Para rodar a API localmente, faça um clone do projeto, instele o MySQL na sua maquina ou crie um container Docke das duas formas funciona adicione as  regras de usuário 
senha e as siga as intruções de instalação do MySQL na sua máquina que vc pode ver em qualquer tutorial no youtube ou na documentação da Oracle.
 
# 2° passo MySQL
Criar a base da dados no MySQL.
VERSÃO DO MySQL:8.0

# 3° passo rodar o projeto na sua máquina.
 Feito isso é só subir o projeto na tua máquina, usando o STS, Eclipse ou Intellij qualquer uma dessas interfaces vai funcionar.

# 4° passo framework do projeto
O Spring Boot 3.4.0 vai gerar as tabelas e adcionar os dados já existentes se tiverem ou criar novos dados.

# 5° passo fazer o build do projeto
RODAR O COMANDO build: Crique como botão direito do mouse na raiz do projeto, vai até a opção Maven e ai clique em (RELOAD PROJECT) para que o Maven atualize as dependêcias do
projeto.

# 6° passo url usadas para teste
POST http://localhost:8080/clientes
GET http://localhost:8080/clientes
GET POR ID http://localhost:8080/clientes/60bca048-bd4d-48fc-9dd8-4416f93b7928
PUT http://localhost:8080/clientes/60bca048-bd4d-48fc-9dd8-4416f93b7928
DELETE http://localhost:8080/clientes/3ef5af16-13f9-4833-9e63-7c585308a46e




