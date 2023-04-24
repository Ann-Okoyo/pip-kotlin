fun main() {
val person=Person("Ann",20,"69870A")
val person3 =Person("Jeff",16,"9078W")
println(person.name)
println(person3.age)
println(person.age)

var books= listOf(Book ("Born a Crime","Trevor Noah",2018 ),
                 Book("Becoming","Mitchelle Obama",2017),
                 Book("Finding Me","Viola Davis",2022))

    for( book in books){
        println(book.title)
    }

    var rectangle=listOf(
            Rectangle(24,60),
            Rectangle(70,90)
    )
    println( $area)

    val contact = Contact("Ann Muyale", listOf("67457", "1234-9087"))

    println(contact.name)
    println(contact.phoneNumbers)





}
//Create a data class Person with properties name (String),
//age (Int), and address (String). Then, create two objects of
//this class and print their properties.
data class Person(var name:String ,var age:Int,var address:String){

}
//Create a data class Book with properties title (String),
//author (String), and year (Int). Then, create a list of
//books and print their titles.
data class Book(var title:String,var author:String,var year:Int){

}
//Create a data class Rectangle with properties width (Int) and height (Int).
//Then, create a function that takes a list of Rectangle objects and returns
//the total area of all rectangles.
data class Rectangle(var width:Int,var height:Int) {


    fun rectangleArea(rectangles: List<Rectangle>): Int {
        var area =0
        for (rectangle in rectangles){
            area+=rectangle.width*rectangle.height

        }

        return area
    }

}
//Create a data class Contact with properties name (String)
//and phoneNumbers (List<String>). Then, create an object
//of this class and print its properties.
data class Contact(val name: String, val phoneNumbers: List<String>)
