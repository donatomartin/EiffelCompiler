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

## Clase 6

rules
| Node | Predicates | Column3 |
| --------------- | --------------- | --------------- |
| program -> varDefinition | Item2.1 | Item3.1 |
| varDefinition -> type | Item2.2 | Item3.2 |
| intType:type -> € | Item2.3 | Item3.3 |
| floatType:type -> € | Item2.3 | Item3.3 |


| Column1 | Column2 | Column3 |
| --------------- | --------------- | --------------- |
| variable:expression -> intValue:int | variables[name] != null // la variable se ha definido previamente | Item3.1 |
| Item1.2 | Item2.2 | Item3.2 |
| Item1.3 | Item2.3 | Item3.3 |


# Más Apuntes
- terminar typechecking para la clase siguiente

## Para TypeChecking
- el orden más común 
        1. Los atributos heredados
        2. Los hijos
        3. Las operaciones sintetizadas
        4. (Opt) se podrían repetir 2 y/o 3 indefinidamente de nuevo

## Ejercicio de examen
- Comprobar que por todos los caminos posibles hay un return
- Comprobar código muerto
