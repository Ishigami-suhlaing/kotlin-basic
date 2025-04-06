//Requirements
//Primary Constructor:
//
//Accepts three parameters:
//
//title (String)
//
//author (String)
//
//publicationYear (Int)
//
//Initializes corresponding properties.
//
//Secondary Constructor:
//
//Accepts only two parameters:
//
//title (String)
//
//author (String)
//
//Uses the primary constructor by supplying a default value (for example, 0 or another indicator like -1) for publicationYear.
//
//Optionally, prints a message indicating that the secondary constructor was called.
//
//Main Function:
//
//Create at least two instances of Book:
//
//One using the primary constructor (with all three values).
//
//One using the secondary constructor (with only the title and author).
//
//Print the details of both books to the console.
var publicationYears:Int = 1

class Books(var title:String, var author:String, var publicationYear:Int){
    constructor(title:String, author:String):this(title,author,publicationYears){
        this.publicationYear = 4
    }
}

var b1 = Books("Kotlin", "Google")
println(b1.title)
println(b1.author)
println(b1.publicationYear)

var b2 =Books("Copilot", "Microsoft", 2024)
println(b2.title)
println(b2.author)
println(b2.publicationYear)

