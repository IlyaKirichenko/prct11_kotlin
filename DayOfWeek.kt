enum class DayOfWeek {
    Понедельник,
    Вторник,
    Среда,
    Четверг,
    Пятница,
    Суббота,
    Воскресенье;

    fun Name() = DayOfWeek.values().asList()
    fun Day() {
        try {
            var n = readln().toInt()
            when (n) {
                1 -> println(DayOfWeek.Понедельник)
                2 -> println(DayOfWeek.Вторник)
                3 -> println(DayOfWeek.Среда)
                4 -> println(DayOfWeek.Четверг)
                5 -> println(DayOfWeek.Пятница)
                6 -> println(DayOfWeek.Суббота)
                7 -> println(DayOfWeek.Воскресенье)
                else -> println("Такого дня нету")
            }
        } catch (e: Exception) {
            println("Ошибка ввода")
        }
    }


fun Friday() : Int {
    return when (this) {
        Понедельник -> 4
        Вторник -> 3
        Среда -> 2
        Четверг -> 1
        Пятница -> 0
        Суббота -> 6
        Воскресенье -> 5
    }
}
    fun DayType (day: DayOfWeek): String{
        return if (day == Суббота || day == Воскресенье)
            "Выходной"
        else
            "Рабочий"
    }
} fun CalcPay (day: DayOfWeek, basePay : Double, weekendPay : Double = 1.5):Double{
        return when (day){
            DayOfWeek.Суббота, DayOfWeek.Воскресенье -> basePay * weekendPay
            else -> basePay
        }
}
