#!/bin/bash

if [ -z "$1" ]; then
    echo "Falta el nombre del fichero de entrada (por ejemplo, \"./antlr-gui input.txt\")."
    exit 1
else
    java -cp "bin:tools/antlr/antlr-4.11.1-complete.jar" org.antlr.v4.gui.TestRig parser.Grammar program -gui -diagnostics "$1"
fi

