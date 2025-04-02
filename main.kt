fun main(){
    println("Введите день недели")
    DayOfWeek.Понедельник.Day()

    println("Цвета")
    var c : Color = Color.Red
    println(c.colors())

    val payed = 1000.0
    println("Зарплата в среду: ${CalcPay(DayOfWeek.Среда, payed)} руб.")
    println("Зарплата в воскресенье: ${CalcPay(DayOfWeek.Воскресенье, payed)} руб.")
}