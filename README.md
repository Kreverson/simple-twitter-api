# simple-twitter-backend
A simple Twitter project  to apply the main Spring Security and oAuth 2 features

![image](https://github.com/user-attachments/assets/9293e35c-be37-468c-8959-9bf261ddd692)


# Instalação

1 - Baixar o repositório e executar o docker da pasta /docker
```
docker compose up
```

2 - Executar o projeto

3 - Configurar o postman/bruno para salvar o accesstoken em uma variável

```
accessToken = res.body.accessToken
```
Em seguida, configurar o Auth como Bearer Token

4 - Criar um usuário

```
curl --request POST \
  --url http://localhost:8080/users \
  --header 'content-type: application/json' \
  --data '{
  "username": "bruno",
  "password": "123"
}'
```

5 - Realizar o login

```
curl --request POST \
  --url http://localhost:8080/login \
  --header 'content-type: application/json' \
  --data '{
  "username": "admin",
  "password": "123"
}'
```

6 - Criar um tweet

```
curl --request POST \
  --url http://localhost:8080/tweets \
  --header 'authorization: Bearer {{accessToken}}' \
  --header 'content-type: application/json' \
  --data '{
  "content": "bruno tweet"
}'
```

7 - Deletar um tweet

```
curl --request DELETE \
  --url http://localhost:8080/tweets/2 \
  --header 'authorization: Bearer {{accessToken}}'
```

8 - Visualizar todos os feeds

```
curl --request GET \
  --url 'http://localhost:8080/feed?pageSize=20&page=0' \
  --header 'authorization: Bearer {{accessToken}}'
```

9 - Listar todos os usuários

Deve-se logar como username admin, senha 123

```
curl --request GET \
  --url http://localhost:8080/users \
  --header 'authorization: Bearer {{accessToken}}'
```
