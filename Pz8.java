import java.util.ArrayList;
import java.util.Collections;

public class Pz8 {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Сделать ПЗ");
        tasks.add("Понять что и как я сделал");
        tasks.add("Выжить");

        System.out.println("Воть мои задачи:");
        for(String task : tasks) {
            System.out.println(" ~ " + task);
        }
        tasks.remove(1);
        System.out.println("Список без второй задачи: ");
        for(String task: tasks) {
            System.out.println(" ~ " + task);
        }
        String searchTask = "Ваша задача";
        boolean found = tasks.contains(searchTask);
        if (found) {
            System.out.println("Задача '" + searchTask + "' найдена в списке");
        } else {
            System.out.println("Задача '" + searchTask + "' не обнаружена");
        }

        Collections.sort(tasks);
        System.out.println("Отсортированный список:");
        for(String task: tasks) {
            System.out.println(" ~ " + task);
        }
    }
}
