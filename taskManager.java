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
        System.out.print("Enter task name:");
        String name = scanner.nextLine();
        System.out.print("Enter description:");
        String description = scanner.nextLine();
        System.out.print("Enter task due date:");
        String dueDate = scanner.nextLine();
        System.out.print("Enter task priority level:");
        String priority = scanner.nextLine();

        tasks.add(new Task(name, description, dueDate, priority));
        System.out.println("Task added successfully!");
    }

    // view task
    public static void viewTask() {
        System.out.println("Your tasks:");
        // print each task in the list
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    // delete task
    public static void deleteTask() {

    }
}