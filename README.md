[![NPM](https://img.shields.io/npm/l/react)]()

# Refatoração em Java: boas práticas no seu código

<br>

## Técnicas de Refatoração de código:

<br>

- Introduzir variável explicativa: 
```
selecionar "Refactor" e "Extract Local Variable", fornecer um nome para a nova variável e confirmar. O Eclipse atribuirá a expressão selecionada à nova variável e substituirá o local onde a expressão é usada pela nova variável;
```

<br>

- Internalizar variável temporária: 
```
selecionar "Refactor" e "Inline" e confirme a refatoração. O Eclipse removerá a variável e colocará a expressão atribuída anteriormente a ela em todos os locais onde a variável era usada;
```
<br>

- Substituir variável temporária por consulta: 
```
verificar se a variável recebe mais de uma atribuição, por meio de inserção do modificador de acesso final à variável. Se ela sofrer apenas uma atribuição, ela poderá participar dessa refatoração. Em seguida, selecionar o lado direito da atribuição e aplicar a técnica "extract method". Por último, substituir todos os pontos onde a variável é usada pelo novo método, e remover a variável, visto que ela não é mais útil;
```
<br>

- Dividir variável temporária: 
```
selecionar "Refactor" e "Rename", para podermos renomear a variável com o valor que queremos que ela tenha na sua primeira atribuição. Em seguida, a declaramos como final. Assim, o Eclipse nos informará onde mais ocorrem atribuições a ela, visto que uma variável final aceita apenas uma atribuição. Com isso, podemos ir criando novas variáveis, e substituindo a anterior por essas novas variáveis;
```

<br>

## 👨‍🎓 Aluno

#### Lucas Araujo

<a href="https://www.linkedin.com/in/lucarauj"><img alt="lucarauj | LinkdeIN" width="40px" src="https://user-images.githubusercontent.com/43545812/144035037-0f415fc7-9f96-4517-a370-ccc6e78a714b.png" /></a>

