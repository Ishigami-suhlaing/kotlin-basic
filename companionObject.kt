val BookList = mutableListOf<Book>()


class Book(val title:String, val id:Int){
    companion object{
        private var nextId = 1

        fun addNewBook(title: String){

            val book:Book = Book(title, nextId)

            nextId++

            BookList.add(book)
            
        }
    }

    override fun toString(): String {
        return "Book(title='$title', id=$id)"
    }
}

fun main(){
    Book.addNewBook("The Art of Not Giving a F*ck")
    Book.addNewBook("Kotlin: A Headway to Android Development")
    for(book in BookList){
        println(book)
    }
}