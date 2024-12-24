import java.util.*;

public class Task {
    private String name;
    private String description;
    private String dueDate;
    private String priority;
    private boolean isComplete;

    // basic contructor
    public Task(String name, String description, String dueDate, String priority) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
        this.isComplete = false;
    }
    
    // complete task
    public void markComplete() {
        this.isComplete = true;
    }

}
