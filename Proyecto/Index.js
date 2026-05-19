import tableroLexer from "./generated/tableroLexer.js";
import tableroParser from "./generated/tableroParser.js";
import { CustomTableroVisitor } from "./CustomTableroVisitor.js";
import antlr4, { CharStreams, CommonTokenStream } from "antlr4";
import readline from 'readline';
import fs from 'fs';

async function main() {
    let input;
    let inputFilename = process.argv[2];

    if (inputFilename) {
        try {
            input = fs.readFileSync(inputFilename, 'utf8');
            console.log(`📂 Leyendo archivo: ${inputFilename}\n`);
        } catch (err) {
            console.error(`❌ Error: No se pudo leer el archivo "${inputFilename}"`);
            console.error(`   ${err.message}`);
            process.exit(1);
        }
    } else {
        input = await leerCadena();
    }

    let inputStream = CharStreams.fromString(input);
    let lexer = new tableroLexer(inputStream);
    let tokenStream = new CommonTokenStream(lexer);
    
    // ========== TABLA DE LEXEMAS-TOKENS ==========
    console.log("\n📋 TABLA DE LEXEMAS-TOKENS");
    console.log("┌─────────────────────────┬──────────────────────────────────┐");
    console.log("│ Lexema                  │ Token                            │");
    console.log("├─────────────────────────┼──────────────────────────────────┤");
    
    tokenStream.fill();
    const tokens = tokenStream.getTokens(0, tokenStream.size - 1);
    
    for (let token of tokens) {
        let lexema = token.text;
        if (lexema.length > 23) lexema = lexema.substring(0, 20) + "...";
        lexema = lexema.replace(/\n/g, '\\n').replace(/\t/g, '\\t');
        
        let tokenName = tableroParser.symbolicNames[token.type] || "DESCONOCIDO";
        
        console.log(`│ ${lexema.padEnd(23)} │ ${tokenName.padEnd(32)} │`);
    }
    console.log("└─────────────────────────┴──────────────────────────────────┘");
    
    let parser = new tableroParser(tokenStream);
    
    // ========== MANEJADOR DE ERRORES DETALLADOS ==========
    parser.removeErrorListeners();
    parser.addErrorListener({
        syntaxError: (recognizer, offendingSymbol, line, column, msg, err) => {
            console.error(`\n❌ ERROR DE SINTAXIS en línea ${line}:${column}`);
            console.error(`   ${msg}`);
            if (offendingSymbol && offendingSymbol.text) {
                console.error(`   Token problemático: "${offendingSymbol.text}"`);
            }
        }
    });
    // =====================================================
    
    let tree = parser.programa();

    if (parser.syntaxErrorsCount > 0) {
        console.error(`\n❌ Se encontraron ${parser.syntaxErrorsCount} error(es) de sintaxis.`);
        console.error(`   El análisis se detuvo. Corregí los errores y volvé a ejecutar.\n`);
    } else {
        console.log("\n✅ Entrada válida.\n");
        
        // ========== ÁRBOL DE DERIVACIÓN ==========
        console.log("🌳 ÁRBOL DE DERIVACIÓN:");
        const cadena_tree = tree.toStringTree(parser.ruleNames);
        console.log(cadena_tree);
        
        // ========== INTERPRETACIÓN Y GENERACIÓN DE JS ==========
        const visitor = new CustomTableroVisitor();
        visitor.visit(tree);
    }
}

function leerCadena() {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    return new Promise(resolve => {
        rl.question("Ingrese la definición del tablero: ", (answer) => {
            rl.close();
            resolve(answer);
        });
    });
}

main();