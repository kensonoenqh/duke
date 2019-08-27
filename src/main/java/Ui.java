import java.util.Scanner;

public class Ui {

    /**
     * reads the user input.
     * @return The user input as a command.
     */
    public static String readCommand() {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        return command;
    }

    /**
     * prints a indented line.
     */
    public static void showLine() {
        String indentedline = "    ____________________________________________________________";
        System.out.println(indentedline);
    }

    /**
     * prints a welcome message.
     */
    public static void greet() {
        echo("Hello! I'm Duke\nWhat can I do for you?");
    }

    /**
     * prints a goodbye message.
     */
    public static void exit() {
        echo("Bye. Hope to see you again soon!");
    }

    /**
     * prints a string in a special format.
     * @param s String to be printed.
     */
    public static void echo(String s) {
        String[] arr = s.split("\n");
        showLine();
        for (String str : arr) {
            System.out.println("     " + str);
        }
        showLine();
    }

    /**
     * Overloaded method that prints a response when a task is added.
     * @param t Task that is added.
     * @param x Current number of tasks in list.
     */
    public static void echo(Task t, int x) {
        if (x == 1) {
            echo("Got it. I've added this task: \n  " + t + "\nNow you have " + x + " task in the list.");
        } else {
            echo("Got it. I've added this task: \n  " + t + "\nNow you have " + x + " tasks in the list.");
        }
    }

    /**
     * prints the current list of tasks.
     * @param tasklist the list of tasks to be printed.
     */
    public static void printList(TaskList tasklist) {
        Task[] tasks = tasklist.getTasks();
        showLine();
        if (tasks[0] == null) {
            System.out.println("     There are no tasks in your list.");
        } else {
            System.out.println("     Here are the tasks in your list:");
            int y = 0;
            while (tasks[y] != null) {
                System.out.println("     " + (y + 1) + ". " + tasks[y]);
                y++;
            }
        }
        showLine();
    }

    /**
     * prints out response when a task is completed.
     * @param t the completed task.
     */
    public static void printDone(Task t) {
        showLine();
        System.out.println("     Nice! I've marked this task as done:");
        System.out.println("       " + t);
        showLine();
    }

    /**
     * prints out a response when a task is deleted.
     * @param t the deleted task.
     * @param x number of tasks left in the list.
     */
    public static void printDeleted(Task t, int x) {
        showLine();
        System.out.println("     Noted. I've removed this task:");
        System.out.println("       " + t);
        if (x == 1) {
            System.out.println("     Now you have " + x + " task in the list.");
        } else {
            System.out.println("     Now you have " + x + " tasks in the list.");
        }
        showLine();
    }

    /**
     * prints out an error response.
     * @param string the error to be printed.
     */
    public static void showError(String string) {
        showLine();
        System.out.println("     " + string);
        showLine();

    }
}
