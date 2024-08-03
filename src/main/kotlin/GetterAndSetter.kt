//simulating a square
class GetterAndSetter( var width: Int, var height: Int) {
    /**
     *Instead of
     *------ val area: Int
     *-------get() = this.width * this.height
     *
     * because property type can be omitted.
     * --- val area get() = this.width * this.height //"this" also can be omitted
     *
     *
     *     // Getter personalized (if needed for personalized code) and Setter personalized for width
     *         var customWidth: Int = width
     *              get() {
     *                  // returns the current property value using 'field'
     *                  return field
     *              }
     *              /it
     *              set(value) {
     *                  println("Setting width to $value")
     *                 field = value
     *             }
     *
     *      // Getter personalized (if needed fo personalized code) and Setter personalized for height
     *
     *         var customHeight: Int = height
     *              get() {
     *                  // returns the current property value using 'field'
     *                  return field
     *              }
     *              set(value) {
     *                  println("Setting height to $value")
     *                  field = value
     *              }
     *
     *              //It can be applied test cases or validation inside the set()
     */

    //DYNAMICALLY AND EASIER
    val area get() = width * height //type implicit, no use of 'this' - less verbosity
}

fun main() {
    val square = GetterAndSetter(5, 10)
    println(square.area) //get easier

    square.width = 3
    square.height = 5
    println(square.area)

}