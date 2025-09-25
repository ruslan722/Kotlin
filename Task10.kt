fun main() {
    val n = 50L                                 // Задаём N

    val result = mutableListOf<Long>()          // Список для чисел Фибоначчи
    var a=0L                                    // Первое число
    var b=1L                                    // Второе число
    if (a<=n) result.add(a)                     // Добавляем 0, если <= N
    if (b<=n) result.add(b)                     // Добавляем 1, если <= N

    while (true) {                              // Генерируем следующие числа
        val c = a+b                              // Следующее число = сумма двух предыдущих
        if (c>n) break                           // Если больше N — выходим
        result.add(c)                            // Добавляем число в список
        a=b                                      // Сдвигаем числа
        b=c
    }

    println("Числа Фибоначчи ≤ $n: ${result.joinToString(", ")}") // Выводим результат
}

