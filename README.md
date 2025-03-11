# Compilador 



# Apuntes

## Clase 4
Siempre hacerse la pregunta en una lista:
    numero mínimo de elementos
    con o sin separadores


Reemplazar los args con el input por terminal sube nota


Para empezar la asociación por la derecha ponemos lo siguiente:
expression : <assoc=right> left=expression '^' right=expression

Crear el run f(...) como un nodo a parte

## Clase 5

## TG

AbstractGrammar
- Hay que tener un tipo void.
    - Así no tenemos que comprobar si el tipo de retorno es null constantemente, más elegante.
- varReference
- Separar las lógicas y las relacionales
- Evitar nombres cortos como e en la g4
- Separar en (global,local,param) y (campo) -- Declarar campo como elemento a parte
    - Más que nada porque global, local y param podrían chocar entre sí.
- Crear elemento común definición, mirar transparencias de la TG

