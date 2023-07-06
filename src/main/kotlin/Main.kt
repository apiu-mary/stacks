fun main(){
//    var myStack=Stack()
//    println(myStack.pop())
//    myStack.push(24)
//    myStack.push(62)
//    println(myStack.pop())
//    println(myStack.peel())
//    myStack.push(14)
//    myStack.push(51)
//    myStack.push(88)
//    val x=myStack.pop()
//    val y=myStack.pop()
//    val z=x!!+y!!
//    println(z)

}
class  Stack{
    var data= mutableListOf<Int>()
    fun push(value:Int){
        data.add(value)
    }
    fun pop():Int?{
        if (data.isEmpty()){
            return  null
        }
        var top=data[data.lastIndex]
        data.removeAt(data.lastIndex)
        return  top
    }
    fun peel():Int?{
        if (data.isEmpty()){
            return null
        }
        return data[data.lastIndex]
    }
    fun  isEmpty():Boolean{
        return data.isEmpty()
    }
}