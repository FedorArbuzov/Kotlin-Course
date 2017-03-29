package task2

/**
 * Created by fedor on 29.03.17.
 */

class BookInfo constructor(val bookName: String, val authorName: String, val publishingHouse: String, val publishingYear: Int, val pageNumber: Int, val city: String = "", val paperType: String = "", val coverType: String = "", val isbn: String = "", val format: String = ""){

    override fun toString(): String {
        return "\nНазвание: $bookName \nИмя автора: $authorName \nИздательство: $publishingHouse \nГод издания: $publishingYear\nКоличество страниц: $pageNumber \nГород: ${checkInfo(city)} \nТип бумаги: ${checkInfo(paperType)}  \nТип обложки: ${checkInfo(coverType)}  \nISBN: ${checkInfo(isbn)} \nФормат: ${checkInfo(format)}"
    }

    fun checkInfo(checkIT: String) : String{
        if (checkIT.isNullOrEmpty())
            return "-"
        return checkIT
    }
}


open class Book constructor(val bInfo: BookInfo) {

    override fun toString(): String {
        return bInfo.toString()
    }
}


fun main(args: Array<String>) {
    val bookInfo : BookInfo = BookInfo("Колобок", "Народная книга", "Питер", 1981, 5, "Воронеж")
    val Kolobok : Book = Book(bookInfo)
    println(Kolobok.toString())
}