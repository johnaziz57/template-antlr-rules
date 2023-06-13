package org.example

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.RecognitionException
import org.example.jsonantlr.JSONLexer
import org.example.jsonantlr.JSONParser
import java.lang.RuntimeException
import kotlin.io.path.Path

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val filePaths = listOf(
            "testing/src/main/templates/template.tmpl",
            "testing/src/main/templates/template-1.tmpl"
        )
        val red = "\u001b[31m"
        val green = "\u001b[32m"
        val reset = "\u001b[0m"

        for (path in filePaths) {
            val lexer = JSONLexer(CharStreams.fromPath(Path(path)))
            val tokens  = CommonTokenStream(lexer)
            val parser = JSONParser(tokens)
            try {
                parser.json()

                if (parser.numberOfSyntaxErrors == 0) {
                    println("$path has $green succeeded $reset")
                } else {
                    println("$path has $red failed $reset")
                }
            } catch (e: RecognitionException) {
                println("$path has failed")
            } catch (e: RuntimeException) {
                println("$path has failed")
            }
        }
    }
}