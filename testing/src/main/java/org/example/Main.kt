package org.example

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.RecognitionException
import org.example.jsonantlr.JSONLexer
import org.example.jsonantlr.JSONParser
import java.io.File
import java.lang.RuntimeException
import kotlin.io.path.Path

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
object Main {
    private const val red = "\u001b[31m"
    private const val green = "\u001b[32m"
    private const val reset = "\u001b[0m"
    @JvmStatic
    fun main(args: Array<String>) {
        testTemplates()
//        testDirectory()
    }

    private fun testTemplates() {
        val filePaths = listOf(
            "testing/src/main/templates/template.tmpl",
            "testing/src/main/templates/template-1.tmpl",
            "testing/src/main/templates/template-2.tmpl",
            "testing/src/main/templates/template-3.tmpl",
            "testing/src/main/templates/template-4.tmpl",
            "testing/src/main/templates/template-5.tmpl",
            "testing/src/main/templates/template-6.tmpl",
            "testing/src/main/templates/template-7.tmpl",
            "testing/src/main/templates/template-8.tmpl",
            "testing/src/main/templates/template-9.tmpl",
            "testing/src/main/templates/template-10.tmpl",
            "testing/src/main/templates/template-11.tmpl",
            "testing/src/main/templates/template-12.tmpl",
            "testing/src/main/templates/template-13.tmpl",
            "testing/src/main/templates/template-14.tmpl",
            "testing/src/main/templates/template-15.tmpl",
            "testing/src/main/templates/template-16.tmpl",
            "testing/src/main/templates/template-17.tmpl",
            "testing/src/main/templates/template-18.tmpl",
            "testing/src/main/templates/template-19.tmpl",
            "testing/src/main/templates/template-20.tmpl",
            "testing/src/main/templates/template-21.tmpl",
            "testing/src/main/templates/template-22.tmpl",
            "testing/src/main/templates/template-23.tmpl",
            "testing/src/main/templates/template-24.tmpl",
            "testing/src/main/templates/template-25.tmpl",
            "testing/src/main/templates/template-26.tmpl",
            "testing/src/main/templates/template-27.tmpl",
            "testing/src/main/templates/template-28.tmpl",
            "testing/src/main/templates/template-29.tmpl",
            "testing/src/main/templates/template-30.tmpl",
            "testing/src/main/templates/template-31.tmpl",
        )

        for (path in filePaths) {
            parseFile(path)
        }
    }

    private fun testDirectory() {
        val templateFolder = File("testing/src/main/templates/")
        iterateDirectory(templateFolder)
    }

    private fun parseFile(path: String) {

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

    private fun iterateDirectory(file: File) {
        if (file.isDirectory) {
            file.listFiles()?.forEach { iterateDirectory(it) }
        } else {
            parseFile(file.path)
        }
    }
}