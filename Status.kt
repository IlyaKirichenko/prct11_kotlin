enum class Status {
    Created,
    Processing,
    Shipped,
    Delivered,
    Canceled;
    fun Opisanie():String {
        return when (this) {
            Created -> "Заказ создан"
            Processing -> "Заказ в обработке"
            Shipped -> "Заказ отправлен"
            Delivered -> "Заказ доставлен"
            Canceled -> "Заказ отменён"
        }
    }
        fun Finished (): String{
            return when(this){
                Delivered -> "Заказ успешно доставлен"
                Canceled -> "Заказ отменён"
                else -> "Заказ ешё не завершён"
            }
        }
        fun Changing (): String{
            return when (this) {
            Created ,Processing -> "Вы еще можете внести измения в заказ"
             else -> "Изменить заказ больше нельзя"
            }
        }
    fun NextStatus():String{
        return when(this){
            Created -> "Следующий шаг: обработка заказа"
            Processing -> "Следующий шаг: отправление заказа"
            Shipped -> "Следующий шаг: доставка заказа"
            Delivered -> "Ожидайте заказ"
            else -> "Следующих действий не требуется"
        }
    }
}
