import javax.print.attribute.standard.NumberUpSupported

fun main() {
    myFriends()
    statistics()










}
fun myFriends() {
    var friends = arrayOf("Ben", "Yvonne", "Leila", "Brenda", "Casey") //array of nullable strings by use (?)//
    println(friends.contentToString())    //inbuilt function
    println(friends[3])
    println(friends.get(3))

    //slicing array//
    println(friends.slice(1..4))

    //Replacing//
    friends.set(4, "Nancy")
    println(friends.contentToString())
    friends[1] = "Keru"
    println(friends.contentToString())

    //Remove an element using null

    //Adding an element to an array
    friends = friends.plus("hamza")
    println(friends.contentToString())
    friends = friends.plus(arrayOf("Natallie", "Faith", "Gitahi"))
    println(friends.contentToString())

    //indexOf//determines if a certain character exists in a array
    println(friends.indexOf("Leila"))
}

    //IN-BUILT ARRAY FUNCTIONS
    fun statistics (){
        var number = arrayOf(21,14,56,18,9,32,5,6,32,67,88,43)
        println(number.maxOrNull())//returns null if there is no maximum element
        println(number.minOrNull())
        //empty array
        var mt = Array(8){6}
        mt[0]=82
        mt[1]=85
        mt[2]=8
        mt[3]=84
        mt[4]=6
        mt[5]=9
        println(mt.contentToString())
        //how many Elements in your Array//the size of the array
        println(number.count()) //function
        println(number.size) //properties
        //Average
        println(number.average())
        //average in normal world
        println(number.sum().toDouble()/number.count())

        //SORTING
        var friends = arrayOf("Ben", "Yvonne", "Leila", "Brenda", "Casey")
        friends = friends.sortedArray()
        println(friends.contentToString())

        //LOOPING THROUGH ARRAYS//prints each string on its own(f is  a block variable #can be anything
        friends.forEach { f->
            println(f)
        }
        number.forEach { x ->
            println(x*4)
        }
        //use of (For) Loop
        for (f in friends){
            println(f)
        }
        for (g in number){
            println(g*g)
        }
        //For selected indices //option 1
        friends.forEachIndexed{ r, t->
            if (r==1 || r==4){
                println(t)
            }
        }
        //option 2//













}

