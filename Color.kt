enum class Color {
    Red,
    Yellow,
    White,
    Black,
    Green,
    Blue;
    fun colors() = "Красный Жёлтый Белый Чёрный Оранжевы"
    fun OpositeColor(): Color {
        return when (this) {
            Red -> Green
            Blue -> Yellow
            Green -> Red
            Yellow -> Blue
            Black -> White
            White -> Black
        }
    }
    fun RussianName(): String {
        return when (this){
            Red -> "Красный"
            Blue -> "Синий"
            Green -> "Зелёный"
            Yellow -> "Жёлтый"
            Black -> "Чёрный"
            White -> "Белый"
        }
    }
    fun Svetofor():String{
        return when (this){
            Red -> "Стоп!"
            Yellow -> "Подождите..."
            Green -> "Можно ехать"
            else -> "Такого цвета нету в светофоре"
        }
    }
}

