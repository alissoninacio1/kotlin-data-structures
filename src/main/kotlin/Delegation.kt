// Interface
interface Task {
    fun perform()
}

// Class who implements the interface
class SimpleTask : Task {
    override fun perform() {
        println("Task is being performed")
    }
}

// Delegating class
class DelegatingTask(task: Task) : Task by task

fun main() {
    val simpleTask = SimpleTask()  // Instance of the class who already implements the interface
    val delegatingTask = DelegatingTask(simpleTask)  // Delegating the implementation
    delegatingTask.perform()  // Calls the delegated class method
}
