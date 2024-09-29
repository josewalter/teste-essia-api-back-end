# INSTRUÇÕES DA API ESSIA

# 1° passo
 OBS: Para rodar a API localmente, faça um clone do projeto, instele o MySQL na sua maquina ou crie um container Docker das duas formas funciona adicione as  regras de usuário 
senha e as siga as intruções de instalação do MySQL na sua máquina que vc pode ver em qualquer tutorial no youtube ou na documentação da Oracle.
 
# 2° passo MySQL
Criar a base da dados no MySQL.
VERSÃO DO MySQL:8.0.39

# 3° passo rodar o projeto na sua máquina.
 Feito isso é só subir o projeto na tua máquina, usando o STS, Eclipse ou Intellij qualquer uma dessas interfaces vai funcionar.

# 4° passo framework do projeto
O Spring Boot 3.4.0 é a versão que eu usei para gerar o projeto e vai gerar as tabelas e adcionar os dados já existentes se tiverem ou criar novos dados.

# 5° passo fazer o build do projeto
RODAR O COMANDO build: Crique como botão direito do mouse na raiz do projeto, vai até a opção Maven e ai clique em (RELOAD PROJECT) para que o Maven atualize as dependêcias do
projeto.

# 6° passo url usadas para teste
POST http://localhost:8080/clientes
GET http://localhost:8080/clientes
GET POR ID http://localhost:8080/clientes/60bca048-bd4d-48fc-9dd8-4416f93b7928
PUT http://localhost:8080/clientes/60bca048-bd4d-48fc-9dd8-4416f93b7928
DELETE http://localhost:8080/clientes/3ef5af16-13f9-4833-9e63-7c585308a46e

# 7° passo comando para rodar o docker
 docker-compose -f mysql-docker-compose.yml up -d
 OBS: rodei na porta:3307, porque na minha máquina eu tenho o MySQL intalado e ele usa a porta 3306 se vc não tiver o MySQL instalado
 na sua máquina vc pode rodar o container na porta 3306.
E a porta para rodar o container é: http://localhost:8000/
Usuário: root
Senha:12345

# 7°.1 passo configurando o properties
 Fazer a configuração no properties para que a aplicação se  conecte com o container e vc possa estar usando o banco de dados em conta-
iner, não vou colocar o passo a passo porque essas configurações são basicas então acredito que vcs consigam fazer sem as instruços.
Pode ser usado a interface: PhpAdmin, DBeaver, Workbenck.




