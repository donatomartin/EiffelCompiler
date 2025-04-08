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

## Para Sintaxis

AbstractGrammar
- Hay que tener un tipo void.
    - Así no tenemos que comprobar si el tipo de retorno es null constantemente, más elegante.
- varReference
- Separar las lógicas y las relacionales
- Evitar nombres cortos como e en la g4
- Separar en (global,local,param) y (campo) -- Declarar campo como elemento a parte
    - Más que nada porque global, local y param podrían chocar entre sí.
- Crear elemento común definición, mirar transparencias de la TG

## Para TypeChecking
- el orden más común 
        1. Los atributos heredados
        2. Los hijos
        3. Las operaciones sintetizadas
        4. (Opt) se podrían repetir 2 y/o 3 indefinidamente de nuevo

- algunas pruebas del typechecking del campusvirtual, pueden tener un error (algo de un ;)

## Para Memory Allocation
| Symbol | Java Type | Inherited/Synthesized | Description |
| --------------- | --------------- | --------------- | --------------- | --------------- |
| VarDefinition | address | int | Más facil heredado pero se pueden ambos | Guarda la dirección de la variable |

Auxiliar

getSize() - devuelve el tamaño del tipo

## Ejercicio de examen
- Comprobar que por todos los caminos posibles hay un return
- Comprobar código muerto


