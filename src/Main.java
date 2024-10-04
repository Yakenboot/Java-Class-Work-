public class Main {
    public static void main(String[] args) {
        FitnessTracker ft = new FitnessTracker();
       ft.getName("Jakenson");
       ft.updateHeartRate(72);


       ft.addSteps(2000);
       ft.addSteps(2000);

       ft.setGoalsSteps(2500);
       ft.checkGoal();

       System.out.println(ft);
    }
}
