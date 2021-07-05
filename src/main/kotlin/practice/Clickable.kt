package practice

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

class Button: Clickable {
    override fun click() = println("I was clicked")
}