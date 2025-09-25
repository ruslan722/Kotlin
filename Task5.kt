fun pluralForm(n: Long, form1: String, form2: String, form5: String): String {
    val nAbs = n % 100                        // Для чисел 11-14 используется особая форма
    return if (nAbs in 11..14) form5
    else when (n % 10) {                       // Определяем правильную форму по последней цифре
        1L -> form1
        2L,3L,4L -> form2
        else -> form5
    }
}

fun main() {
    var sec = 100000L                          // Задаём количество секунд

    val days = sec / 86400                     // Считаем дни
    sec %= 86400                               // Оставшиеся секунды после дней
    val hours = sec / 3600                     // Считаем часы
    sec %= 3600                                // Оставшиеся секунды после часов
    val minutes = sec / 60                     // Считаем минуты
    sec %= 60                                  // Остаток секунд

    println("${days} ${pluralForm(days,"день","дня","дней")}, " +
            "${hours} ${pluralForm(hours,"час","часа","часов")}, " +
            "${minutes} ${pluralForm(minutes,"минута","минуты","минут")}, " +
            "${sec} ${pluralForm(sec,"секунда","секунды","секунд")}") // Выводим результат
}
