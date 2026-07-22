# MiniRust_PC

Compilador da linguagem **MiniRust** desenvolvido para a disciplina de **Projeto de Compiladores**.

O trabalho consiste em implementar, usando **JavaCC**, um compilador que traduz programas escritos em MiniRust (uma linguagem simplificada com sintaxe inspirada em Rust) para código equivalente em **Java**. O compilador realiza tradução dirigida por sintaxe: durante a análise sintática são executadas ações semânticas que constroem uma árvore sintática abstrata (AST) do programa, a qual é posteriormente percorrida para gerar o código Java correspondente.

## Sobre a linguagem MiniRust

MiniRust é uma linguagem simplificada que suporta:

- Declaração de variáveis dos tipos `f32`, `bool` e `void`
- Definição de funções com parâmetros e tipo de retorno
- Comandos de atribuição, `if`, `while`, `return`, `println!` e leitura de entrada (`read_float`)
- Expressões aritméticas e lógicas (`+`, `-`, `*`, `/`, `&&`, `||`, `<`, `>`, `==`)
- Chamadas de função, tanto como comando quanto como expressão

A gramática completa (definições léxicas e sintáticas) está implementada no arquivo [`MiniRust.jj`](./MiniRust.jj).

## Estrutura do repositório

```
MiniRust_PC/
├── ast/                      # Classes da árvore sintática (Prog, Main, Fun, Comando, Exp, etc.)
├── out/                      # Saída gerada pelo compilador
├── MiniRust.jj                # Gramática JavaCC com as ações semânticas
├── MiniRust.java              # Classe principal (parser + geração de código)
├── MiniRustConstants.java     # Gerado automaticamente pelo JavaCC
├── MiniRustTokenManager.java  # Gerado automaticamente pelo JavaCC
├── SimpleCharStream.java       # Gerado automaticamente pelo JavaCC
├── Token.java                 # Gerado automaticamente pelo JavaCC
├── TokenMgrError.java          # Gerado automaticamente pelo JavaCC
├── ParseException.java         # Gerado automaticamente pelo JavaCC
├── exemplo.rs                  # Programa de exemplo em MiniRust
├── teste1.rs                   # Programa de teste em MiniRust
└── teste2.rs                   # Programa de teste em MiniRust
```

## Como compilar e executar

### Pré-requisitos

- JDK instalado
- [JavaCC](https://javacc.github.io/javacc/) instalado (necessário apenas caso queira regerar o parser a partir do `.jj`)

### Gerando o parser (opcional, caso o `.jj` seja alterado)

```bash
javacc MiniRust.jj
```

### Compilando o projeto

```bash
javac *.java ast/*.java
```

### Executando o compilador

O compilador recebe como argumento o caminho de um arquivo-fonte MiniRust (`.rs`) e gera o código Java equivalente:

```bash
java MiniRust exemplo.rs
```

O código Java gerado é salvo na pasta `out/`.

## Exemplos de programas

O repositório inclui três programas de exemplo escritos em MiniRust, utilizados para testar as principais construções da linguagem (variáveis, funções, condicionais, laços, entrada/saída e expressões):

- [`exemplo.rs`](./exemplo.rs)
- [`teste1.rs`](./teste1.rs)
- [`teste2.rs`](./teste2.rs)

## Tecnologias utilizadas

- **Java**
- **JavaCC** (geração do analisador léxico/sintático)
- **Rust-like syntax** (linguagem-fonte MiniRust)

## Autoria

Trabalho desenvolvido por:
- [@VeePollux](https://github.com/VeePollux)
- [@vinilol467](https://github.com/vinilol467)

