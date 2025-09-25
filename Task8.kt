fun main() {
    val nums = listOf(5,2,9,1,5,6)            // Задаём список чисел

    var min = nums[0]                          // Инициализируем минимум первым элементом
    var max = nums[0]                          // Инициализируем максимум первым элементом
    for (v in nums) {                           // Перебираем все элементы
        if (v < min) min = v                   // Обновляем минимум
        if (v > max) max = v                   // Обновляем максимум
    }

    println("Список: ${nums.joinToString(", ")}") // Выводим список
    println("min = $min, max = $max")             // Выводим min и max
}
