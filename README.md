# ✊✋✌️ Pedra, Papel e Tesoura

Jogo de pedra, papel e tesoura para o terminal, feito em Java. Você joga contra o computador e quem chegar primeiro a **5 pontos** vence a partida.

## Como funciona

- Escolha entre pedra, papel ou tesoura digitando o número da opção.
- O computador sorteia a jogada dele aleatoriamente.
- O resultado de cada rodada (vitória, derrota ou empate) é exibido junto com o placar.
- A partida termina quando alguém faz 5 pontos, ou quando você escolhe sair.

## Menu

```
1 - Pedra
2 - Papel
3 - Tesoura
4 - Sair
```

## Regras

| Jogador  | Vence de |
|----------|----------|
| Pedra    | Tesoura  |
| Papel    | Pedra    |
| Tesoura  | Papel    |

Jogadas iguais resultam em empate e ninguém pontua.

## Exemplo de execução

```
1 - Pedra, 2 - Papel, 3 - Tesoura, 4 - Sair
1
Computador: Tesoura
Jogador = Pedra
Parabens voce ganhou
Placar: voce 1 X 0 Computador
```

## Conceitos praticados

- `Scanner` para entrada de dados
- `Random` para sortear a jogada do computador
- Laço `do/while` com `break` e `continue`
- Tratamento de entrada inválida com `try/catch`
- `switch` e condicionais compostas (`&&`, `||`)
- Contagem de placar com variáveis

## Possíveis melhorias

- Perguntar se quer jogar outra partida ao final
- Escolher quantos pontos são necessários para vencer
