[![NPM](https://img.shields.io/npm/l/react)]()

# Refatoração em Java: boas práticas no seu código

<br>

## Técnicas de Refatoração de código:

<br>

- Introduzir variável explicativa: 
```
- Selecione "Refactor" e "Extract Local Variable".
- Escolha um nome para a nova variável e confirme.
- A expressão selecionada será atribuída à nova variável.
- Substitua todas as ocorrências da expressão pela nova variável.
```

<br>

- Internalizar variável temporária: 
```
- Selecione "Refactor" e "Inline" e confirme.
- A variável será removida e a expressão atribuída a ela substituirá seus usos.
```
<br>

- Substituir variável temporária por consulta: 
```
- Verifique se a variável tem apenas uma atribuição (use "final" se necessário).
- Selecione o lado direito da atribuição e aplique "extract method".
- Substitua todas as referências à variável pelo novo método.
```
<br>

- Dividir variável temporária: 
```
- Use "Refactor" e "Rename" para renomear a variável com seu valor inicial.
- Declare a variável como "final" para encontrar todas as atribuições.
- Crie novas variáveis para cada atribuição seguinte.
- Substitua a variável original por essas novas variáveis.
```

<br>

- Remover atribuições a parâmetros: 
```
- Identifique parâmetros alterados no método.
- Crie variáveis para cada parâmetro e atribua os valores.
- Substitua as referências ao parâmetro pela nova variável.
```

<br>

- Substituir método por objeto método: 
```
- Crie uma classe com nome do método e o método como atributo.
- Crie atributos correspondentes para cada parâmetro.
- Crie um construtor que inicialize esses atributos.
- Crie um método executar() na nova classe com a lógica do método antigo.
- Copie o código do método antigo para o novo método.
- Realize ajustes necessários na nova classe.
- Substitua chamadas ao método antigo pela nova classe.
```

<br>

- Substituir algorítmo: 
```
- Quando um método parece confuso, reescreva-o para clareza.
- Certifique-se de que nenhuma refatoração prévia é necessária.
- Algumas refatorações podem tornar essa substituição desnecessária.
```

<br>

## 👨‍🎓 Aluno

#### Lucas Araujo

<a href="https://www.linkedin.com/in/lucarauj"><img alt="lucarauj | LinkdeIN" width="40px" src="https://user-images.githubusercontent.com/43545812/144035037-0f415fc7-9f96-4517-a370-ccc6e78a714b.png" /></a>

