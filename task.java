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

    // get task name
    public String getName() {
        return name;
    }

    // get task description
    public String getDescription() {
        return description;
    }

    // get task due date
    public String getDueDate() {
        return dueDate;
    }

    // get task priority
    public String getPriority() {
        return priority;
    }

    // get task status
    public boolean isComplete() {
        return isComplete;
    }

    // set task name
    public void setName(String name) {
        this.name = name;
    }

    // set task description
    public void setDescription(String description) {
        this.description = description;
    }

    // set task due date
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    // set task priority
    public void setPriority(String priority) {
        this.priority = priority;
    }

    // set task status
    public void setComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    // override toString method
    @Override
    public String toString() {
        return "Task: " + name + "\nDescription: " + description + "\nDue Date: " + dueDate + "\nPriority: " + priority
                + "\nStatus: " + (isComplete ? "Completed" : "Pending");
    }
}
