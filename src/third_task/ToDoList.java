package third_task;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Task> tasks = new ArrayList<Task>();

    public void addTask() {
        System.out.print("Add task name: ");
        String taskName = scanner.nextLine();

        Task task = new Task();
        task.setTittle(taskName);
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    public void displayTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        System.out.println("Your tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println((i + 1) + ". " + task.getTittle() + " (Status: " + (task.status ? "Completed" : "Pending") + ")");
        }
    }

    public void markTaskAsComplete() {
        displayTask();
        if (tasks.isEmpty()) return;

        System.out.print("Enter task number to mark as completed: ");
        int taskIndex = scanner.nextInt();
        scanner.nextLine();

        if (taskIndex > 0 && taskIndex <= tasks.size()) {
            tasks.get(taskIndex - 1).markCompleted();
            System.out.println("Task marked as completed!");
        } else {
            System.out.println("Invalid task number!");
        }
    }

    public void start() {
        while (true) {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Complete");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    displayTask();
                    break;
                case 3:
                    markTaskAsComplete();
                    break;
                case 4:
                    System.out.println("Exiting the app. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}