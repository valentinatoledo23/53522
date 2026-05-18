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
Clonar el repositorio desde GitHub: git clone https://github.com/valentinatoledo23/53522.git

Acceder a la carpeta del proyecto:
bash
cd 53522
Verificar que Node.js esté instalado en el sistema.
Si no lo está, descargar e instalar la versión 18 o superior desde nodejs.org.

Instalar las dependencias necesarias para el proyecto:

bash
npm install
Instalar ANTLR4 de forma global (esto permite generar el parser desde la gramática):

bash
npm install -g antlr4
Generar el parser a partir del archivo de gramática:

bash
antlr4 -Dlanguage=JavaScript Proyecto/gramatica.g4
Este paso es obligatorio la primera vez. Si se modifica el archivo gramatica.g4, volver a ejecutar este comando.

## ¿Cómo funciona?
