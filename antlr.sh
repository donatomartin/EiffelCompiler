#!/bin/bash

cd specifications || exit

java -jar "../tools/antlr/antlr-4.11.1-complete.jar" -no-listener -package parser -o ../src/parser Grammar.g4

cd ..
rm -f src/parser/*.tokens
rm -f src/parser/*.interp
