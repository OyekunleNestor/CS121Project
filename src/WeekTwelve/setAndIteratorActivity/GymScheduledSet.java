package WeekTwelve.setAndIteratorActivity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class GymScheduledSet {
    private Set<String> scheduledClasses;

    public GymScheduledSet() {
        scheduledClasses = new HashSet<>();
    }

    public void addScheduledClass() {
        Scanner scanner = new Scanner(System.in);
        String className;

        do {
            System.out.print("Enter the gym class name to add (enter 0 to quit): ");
            className = scanner.nextLine();

            if (!className.equals("0")) {
                scheduledClasses.add(className);
            }

        } while (!className.equals("0"));
    }

    public void displayScheduledClasses() {
        Iterator<String> iterator = scheduledClasses.iterator();

        System.out.println("\nScheduled Gym Classes:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
