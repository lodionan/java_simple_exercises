package EnumExcercise;

public class Planner {

    public static void retrieveTasksFor(WeekDays value) {
        switch(value) {
            case MONDAY:
            case WEDNESDAY:
            case FRIDAY:
                System.out.println("[] Take the kid to the school");
                System.out.println("[] Start cleaning the house");
                System.out.println("[] Take the breakfast");
                System.out.println("[] Work");
                System.out.println("[] Eat");
                System.out.println("[] Work");
                System.out.println("[] Finish cleaning the house");
                System.out.println("[] Take a break");
                System.out.println("[] Go play with the kids to the park");
                System.out.println("[] Help wife to make the dinner");
                System.out.println("[] Take another break");
                System.out.println("[] Go to the park to exercise that weak soft azz");
                break;
            case TUESDAY:
            case THURSDAY:
                System.out.println("[] Take the kid to the school");
                System.out.println("[] Work");
                System.out.println("[] Eat");
                System.out.println("[] Work");
                System.out.println("[] Take a break");
                System.out.println("[] Go play with the kids to the park");
                System.out.println("[] Help wife to make the dinner");
                System.out.println("[] Take another break");
                System.out.println("[] Start to exercise yourself");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("[] Take wife to work");
                System.out.println("[] Wash the car");
                System.out.println("[] Take care of the children (Go to Columbus park)");
                System.out.println("[] Take back wife from the work");
                System.out.println("[] Take some rest the last part of the day");
        }
    }

}
