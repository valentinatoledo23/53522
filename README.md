# # Analizador de tableros - Legajo 53522
Valentina Toledo

## ¿Qué hace este proyecto?
Es un analizador que lee descripciones de tableros de datos y verifica si están bien escritas.  
Si la entrada es correcta, muestra:

- Una tabla con los tokens reconocidos 
- El árbol de análisis sintáctico
- Una interpretación del tablero (fuentes, métricas, gráficos, filtros y alertas)
- Código JavaScript generado a partir de la definición del tablero

La gramática está definida con ANTLR4 y el programa corre en Node.js.

## Instalación
1. Clonar el repositorio desde GitHub: git clone https://github.com/valentinatoledo23/53522.git
   
2. Acceder a la carpeta del proyecto:
     cd 53522
   
3. Verificar que Node.js esté instalado en el sistema.
       Si no lo está, descargar e instalar la versión 18 o superior desde nodejs.org.

4. Instalar las dependencias necesarias para el proyecto:
     npm install
   
5. Instalar ANTLR4 de forma global (esto permite generar el parser desde la gramática):
     npm install -g antlr4

6. Generar el parser a partir del archivo de gramática:
     antlr4 -Dlanguage=JavaScript Proyecto/gramatica.g4

Este paso es obligatorio la primera vez. Si se modifica el archivo gramatica.g4, volver a ejecutar este comando.

## ¿Cómo ejecutar?

Opción A: Ejecutar el analizador en modo interactivo
1. Ejecutar el archivo principal desde la terminal:
      node Proyecto/analizador.js

2. Escribir la definición del tablero línea por línea cuando el programa lo solicite.

3. Finalizar la entrada presionando Ctrl + C o escribiendo la palabra FIN (según lo definido en el programa).

Opción B: Ejecutar el analizador pasando un archivo de texto
1. Preparar un archivo de texto (extensión .txt) con la definición del tablero.

2. Ejecutar el analizador indicando la ruta del archivo:
     node Proyecto/analizador.js ruta/del/archivo.txt

Ejemplo concreto:
   node Proyecto/analizador.js mi_tablero.txt

## Qué esperar al ejecutar
Una vez ejecutado, el analizador mostrará en pantalla:

- Una tabla con los tokens reconocidos (análisis léxico)

- El árbol de análisis sintáctico (estructura del tablero)

- Una interpretación del tablero (fuentes, métricas, gráficos, filtros, alertas)

- El código JavaScript generado a partir de la definición

