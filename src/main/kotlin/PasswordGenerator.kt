
import java.time.LocalTime
import java.time.format.DateTimeFormatter

fun passwordGen(planta: String) {
    val currentTime = LocalTime.now()
    val formatted = DateTimeFormatter.ofPattern("HHmm")
    val timeFormatted = currentTime.format(formatted)
   
    val resumedName = planta
     .toLowerCase()
         .trim() //eliminate spaces
                      .split("") //convert the string into an array, separating by each letter
                      .slice(0..3)//defines a range and slice from zero to third (not included)
                      .joinToString("") //then, join them with no space.
                     
    val adjustedName =  resumedName[0].toUpperCase() + resumedName.slice(1..2)  
   
    val password = "$adjustedName.$timeFormatted"
   
    println(password)
}

fun main() {
    passwordGen("  Monterrey  ");
}