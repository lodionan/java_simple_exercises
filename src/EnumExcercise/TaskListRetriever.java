package EnumExcercise;

import static EnumExcercise.WeekDays.*;

public class TaskListRetriever extends Planner {

    /**
     ** This class returns a list of
     ** tasks that are planned for a given weekday
     **/

    public static void main(String[] args) {
        System.out.println("\n================================================\n");
        retrieveTasksFor(SUNDAY);
        System.out.println("\n================================================\n");
        retrieveTasksFor(MONDAY);
        System.out.println("\n================================================\n");
        retrieveTasksFor(TUESDAY);
        System.out.println("\n================================================\n");
    }

}
