fun main() {
    val s = "hello world"                      // Задаём строку

    val freq = linkedMapOf<Char, Int>()        // Создаём карту для подсчёта частоты символов
    for (ch in s) freq[ch] = freq.getOrDefault(ch,0)+1 // Для каждого символа увеличиваем счётчик

    println("Строка: $s")                      // Выводим исходную строку
    println("Частотный словарь: ${freq.entries.joinToString(", "){"${it.key}:${it.value}"}}") // Выводим частотный словарь
}
