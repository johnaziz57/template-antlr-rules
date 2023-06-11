package org.example

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!")

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (i in 1..5) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            println("i = $i")
        }
    }
}