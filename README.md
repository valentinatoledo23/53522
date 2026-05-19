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
Clona este repositorio: git clone https://github.com/valentinatoledo23/53522.git

## Cómo ejecutar
**1.** Abrir la terminal integrada (Ctrl + ñ)

**2.** Ubicarse en la raíz del proyecto 

       cd Proyecto

**3.** Ejecutar el analizador

     node index.js

**4.** Ejecutar con un archivo específico

     node index.js nombre_archivo.txt

**5.** Depurar y ver el árbol sintáctico

     F5

## Qué esperar al ejecutar
Una vez ejecutado, el analizador mostrará en pantalla:

- Una tabla con los tokens reconocidos (análisis léxico)

- El árbol de análisis sintáctico (estructura del tablero)

- Una interpretación del tablero (fuentes, métricas, gráficos, filtros, alertas)

- El código JavaScript generado a partir de la definición

