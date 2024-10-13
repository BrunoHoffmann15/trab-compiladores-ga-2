#!/bin/bash

# Caminho para o arquivo JAR do ANTLR
ANTLR_JAR="antlr-4.13.2-complete.jar"

# Verifica se o número de argumentos é maior que 0
if [ "$#" -lt 1 ]; then
java -jar "$ANTLR_JAR"
fi

# Executa o comando java com os argumentos fornecidos
java -jar "$ANTLR_JAR" "$@"
