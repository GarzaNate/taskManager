import java.util.*;

public class TaskManager {
    private static ArrayList<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Task Manager");
            System.out.println("1. Add Task");
            System.out.println("2. View Task");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // check if the input is an integer
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid choice. Please try again.");
                scanner.nextLine();
                continue;
            }
            // get the choice from the user
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    viewTask();
                    break;
                case 3:
                    deleteTask();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // add task 
    public static void addTask(Scanner scanner) {
        System.out.print("Enter task name: ");
        String name = scanner.nextLine();
        System.out.print("Enter description: ");
        String description = scanner.nextLine();
        System.out.print("Enter task due date: ");
        String dueDate = scanner.nextLine();
        System.out.print("Enter task priority level: (High, Medium, Low) ");
        String priority = scanner.nextLine();

        tasks.add(new Task(name, description, dueDate, priority));
        System.out.println("Task added successfully!");
    }

    // view task
    public static void viewTask() {
        // check if the list is empty
        if (tasks.isEmpty()) {
            System.out.println("No tasks found in your list.");
            return;
        }

        // print each task in the list
        System.out.println("Your tasks: ");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    // delete task
    public static void deleteTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter task name to delete: ");
        String name = scanner.nextLine();

        // find the task with the given name
        Task task = null;
        for (Task t : tasks) {
            if (t.getName().equals(name)) {
                task = t;
                break;
            }
        }

        // remove the task from the list
        if (task != null) {
            tasks.remove(task);
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Task not found.");
        }
    }
}