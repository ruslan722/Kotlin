fun main() {
    val n = 7                                 // Задаём число

    if (n <= 1) { println("false"); return }  // Числа <=1 не являются простыми
    if (n == 2) { println("true"); return }   // 2 — простое число
    if (n % 2 == 0) { println("false"); return } // Чётные >2 — не простые

    var isPrime = true                        // Предполагаем, что число простое
    for (i in 3..kotlin.math.sqrt(n.toDouble()).toInt() step 2) { // Проверяем делители от 3 до sqrt(n)
        if (n % i == 0) {                     // Если есть делитель
            isPrime = false                   // Число не простое
            break                             // Прерываем цикл
        }
    }

    println("Число = $n")                     // Выводим число
    println("Простое? $isPrime")              // Выводим результат проверки
}
