sealed class Error(val message:String){
    class Network():Error("Network Error")
    class Unknown():Error("Unknown error")
}

var errors = listOf(Error.Network(),Error.Unknown())
errors.forEach(){
    println(it.message)
}
