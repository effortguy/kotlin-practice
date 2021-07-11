package practice

import practice.StringProcessor as StringProcessor1

class StringPrinter: StringProcessor1 {
    override fun process(value: String?) {
        if (value != null) {
            println(value)
        }
    }
}