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
Clona este repositorio: https://github.com/valentinatoledo23/53522.git

## Cómo ejecutar
**1. Abrir la terminal**
Ubicarse en la carpeta raíz del proyecto clonado:

     cd 53522
   
**2. Ejecutar el analizador con un archivo de ejemplo**
Usar el siguiente comando general:

    node Proyecto/analizador.js ruta/del/archivo
   
Reemplazar ruta/del/archivo por la ubicación del archivo .txt que se desea analizar.

**Ejemplos concretos de ejecución**

Si el archivo está dentro de la carpeta Proyecto/:

      node Proyecto/analizador.js Proyecto/ejemplo_valido_1.txt
      
Si el archivo está en la raíz del repositorio:

      node Proyecto/analizador.js ejemplo_valido_1.txt

Si el archivo está en el escritorio (Windows):

      node Proyecto/analizador.js C:/Users/TuUsuario/Desktop/ejemplo_invalido_1.txt

Si el archivo está en el escritorio (Mac/Linux):

      node Proyecto/analizador.js /home/tuusuario/Desktop/ejemplo_invalido_1.txt

**3. Interpretar la salida**
- Si el ejemplo es válido:
  El analizador mostrará en pantalla:
   **-** Tabla de tokens reconocidos
   **-** Árbol de análisis sintáctico
   **-** Interpretación semántica del tablero
   **-** Código JavaScript generado

- Si el ejemplo es inválido:
  El analizador mostrará un mensaje de error indicando:
   **-** Tipo de error (léxico, sintáctico o semántico)
   **-** Línea y columna donde ocurrió el error
   **-** Breve descripción del problema

## Qué esperar al ejecutar
Una vez ejecutado, el analizador mostrará en pantalla:

- Una tabla con los tokens reconocidos (análisis léxico)

- El árbol de análisis sintáctico (estructura del tablero)

- Una interpretación del tablero (fuentes, métricas, gráficos, filtros, alertas)

- El código JavaScript generado a partir de la definición

