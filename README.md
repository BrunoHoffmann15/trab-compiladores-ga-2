Alunos: Bruno Hoffmann e Rafael Klauck

# Trabalho II - Compiladores

## Pré-Requisitos

1. Baixe as dependências do ANTLR.

```bash
cd /usr/local/lib
curl -O https://www.antlr.org/download/antlr-4.13.2-complete.jar
```

2. Configure os caminhos:

```bash
export CLASSPATH=".:/usr/local/lib/antlr-4.13.2-complete.jar:$CLASSPATH"
```

3. Além disso, configure dentro do seu .bash_profile ou .zsh_profile:

```bash
alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.13.2-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
alias grun='java -Xmx500M -cp "/usr/local/lib/antlr-4.13.2-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig'
```

## Como Executar - Árvore Sintática

1. Transforme o arquivo `.g4` em uma classe java, para isso execute:

```bash
antlr4 FoolGrammar.g4
```

2. Após instalar os pré-requisitos você precisa executar a compilação do `.java`, para isso execute:
   Obs: ao utilizar o `/tools/antlr-4.x-complete.jar` você garante o uso das bibliotecas do antlr.

```bash
javac -cp ../tools/antlr-4.13.2-complete.jar **.java
```

3. A partir disso você pode executar os comandos para testar as árvores sintática:

```bash
grun FoolGrammar <<regra de prod>> -gui
```

Ou:

```bash
grun FoolGrammar <<regra de prod>> -tree
```

Observações: o <<regra de prod>> você substitui para a regra inicial.

Exemplo:

```bash
grun FoolGrammar declaracaoMetodo -gui
int metodo() {}
ˆD
```

## Como Executar - Gerador de TAC e Tabela de Símbolos

1. Após instalar os pré-requisitos você precisa executar a compilação do `.java`, para isso execute:
   Obs: ao utilizar o `/tools/antlr-4.x-complete.jar` você garante o uso das bibliotecas do antlr.

```bash
javac -cp ../tools/antlr-4.13.2-complete.jar **.java
``` 

2. Entre no diretório `src`:
```bash
cd src
```

3. Para gerar código intermediário e a tabela de símbolos:

- No linux/macos:
```bash
java -cp "../tools/antlr-4.13.2-complete.jar:." Main input.txt output.txt
```

- No windows:

```bash
java -cp "../tools/antlr-4.13.2-complete.jar;." Main input.txt output.txt
```