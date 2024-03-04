# Nexus

API do projeto Nexus - Venda de Periféricos Gamer

## Tarefas

- [ ] CRUD de Categorias
- [ ] CRUD de Movimentações
- [ ] CRUD de Usuários
- [ ] Dashboard

## Documentação da API

### Endpoint
- [Detalhes da Categoria](#detalhes-da-categoria)
- [Apagar Categoria](#apagar-categoria)
- [Atualizar Categoria](#atualizar-categoria)

### Detalhes da Categoria

`GET` /categorias/{id}

Retorna os detalhes da categoria com o ID informado como parâmetro de path.

#### Exemplo de Resposta

```json
// Requisição para /categorias/1
[
{
    "id": 1,
    "nome": "Teclados",
    "icone": "keyboard"
}
]
```
Códigos de Status:

- 200: Os dados da categoria foram retornados com sucesso
- 401: Acesso negado. Você deve se autenticar
- 404: Não existe categoria com o ID informado

### Apagar Categoria

`DELETE` /categorias/{id}

Apaga a categoria com o ID especificado no parâmetro de path.

Códigos de Status:

- 204: Categoria foi apagada com sucesso
- 401: Acesso negado. Você deve se autenticar
- 404: Não existe categoria com o ID informado

### Atualizar Categoria

`PUT` /categorias/{id}

Altera dos dados da categoria especificada pelo ID, utilizando as informações enviadas no corpo da requisição.

#### Corpo da Requisição

```json
[
{
    "nome": "Mouses Ópticos",
    "icone": "mouse"
}
]
```
Códigos de Status:

- 200: Categoria alterada com sucesso
- 400: Dados enviados são inválidos. Verifique o corpo da requisição
- 401: Acesso negado. Você deve se autenticar
- 404: Não existe categoria com o ID informado
