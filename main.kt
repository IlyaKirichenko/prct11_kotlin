fun main(){
    println("---Цвета---")
    var c : Color = Color.Red
    println(c.colors())
    println("Противоположный цвет Red: ${Color.Red.OpositeColor()}")
    println("Противоположный цвет Yellow: ${Color.Yellow.OpositeColor()}")
    println("Цвет Red на русском: ${Color.Red.RussianName()}")
    println("Цвет Жёлтый на русском: ${Color.Yellow.RussianName()}")
    println("Цвет Чёрный на русском: ${Color.Black.RussianName()}")
    println("-Светофор-")
    println("Красный: ${Color.Red.Svetofor()}")
    println("Жёлтый: ${Color.Yellow.Svetofor()}")
    println("Зёленый: ${Color.Green.Svetofor()}")
    println(" ")

    println("---Дни недели---")

    println("Введите день недели")
    DayOfWeek.Понедельник.Day()

    val payed = 1000.0
    println("Зарплата в среду: ${CalcPay(DayOfWeek.Среда, payed)} руб.")
    println("Зарплата в воскресенье: ${CalcPay(DayOfWeek.Воскресенье, payed)} руб.")

    println("Сколько дней до пятницы")
    println("Понедельник до пятницы: ${DayOfWeek.Понедельник.Friday()} дня")
    println("Среда до пятницы: ${DayOfWeek.Среда.Friday()} дня")
    println("Суббота до пятницы: ${DayOfWeek.Суббота.Friday()} дня")

    println("-Тип дня-")
    val dayt = DayOfWeek.Понедельник
    println("Среда: ${dayt.DayType(DayOfWeek.Среда)}")
    println("Пятница: ${dayt.DayType(DayOfWeek.Пятница)}")
    println("Воскресенье: ${dayt.DayType(DayOfWeek.Воскресенье)}")
    println(" ")

    println("---Статус---")
    val processing = Status.Processing
    println(processing.Changing())
    println(processing.Finished())
    println(processing.Opisanie())
    println(processing.NextStatus())
}