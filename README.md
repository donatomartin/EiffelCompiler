# Compilador MiniEiffel - DLP

- Donato  Martín
- UO288787
- Universidad de Oviedo 
- Diseño de Lenguajes de Programación

# Documentación

- Se pueden encontrar pdfs y documentos acerca de las especificaciones del lenguaje en [este vínculo](./specifications/docs)
- La estructura del código ha sido refactorizada para seguir la forma un proyecto standard de maven
- Todos los scripts necesarios para la ejecución se encuentran en la raíz del proyecto, la mayoría están escritos tanto en cmd como en bash pero puede haber asimetrías
- Podría haber cambios de última hora no reflejados en los pdfs

## Uso

```sh 
./mvnw clean compile # Compila el compilador
```


```sh
java -cp "target/classes:tools/antlr/antlr-4.11.1-complete.jar" compiler.Main # Ejecuta el compilador sobre input.me
```

Opcionalmente se puede pasar un fichero agregando su path al final del comando anterior. En ambos casos el resultado será un output.txt con las instrucciones mapl (cuyas máquinas virtuales - GUI y CLI, se encuentran en la raíz del proyecto)

El resto de comandos propios de un workflow con antlr + vgen se pueden encontrar en la raíz del proyecto o en el script [loadaliases](./loadaliases) que permite un flujo de trabajo mucho más fluído a la hora de desarrollar el compilador.


# Bugs Activos:

- **Nomenclatura:** Si hay dos variables nombradas similar (ejemplo: v y v1, v1 resuelve a v ??? Mirar luego)
- **Precedencia del TypeChecking:** a veces hay errores que no deberían salir en los tests aunque existan en el programa
- **Función principal:** La función main es un nombre reservado para el funcionamiento interno de los creates