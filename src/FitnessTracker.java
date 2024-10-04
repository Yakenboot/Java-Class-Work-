import java.util.Objects;
import java.util.Scanner;

public class FitnessTracker {

    public static final double kilometersPerStep = 0.000762;
    public static final double caloriesPerStep = 0.04;

    private String name;
    private int dailySteps;
    private double distanceWalked;
    private double caloriesBurned;
    private int heartRate;
    private int goalsSteps;

    public FitnessTracker() {
        this.name = "";
        this.dailySteps = 0;
        this.distanceWalked = 0;
        this.caloriesBurned = 0;
        this.heartRate = 0;
        this.goalsSteps = 0;
    }

    public FitnessTracker(String name, int dailySteps, double distanceWalked, double caloriesBurned, int heartRate) {
        this.name = name;
        this.dailySteps = dailySteps;
        this.distanceWalked = distanceWalked;
        this.caloriesBurned = caloriesBurned;
        this.heartRate = heartRate;
        System.out.println(" Your daily steps are{0}");
    }

    public String getName(String name) {
        this.name = name;
        return this.name;

    }

    public String setName(String name) {
        return name;
    }

    public int getDailySteps() {
        this.dailySteps = dailySteps;
        return dailySteps;
    }

    public void getDailySteps(int dailySteps) {
        this.dailySteps = dailySteps;
    }

    public double getDistanceWalked() {
        return distanceWalked;
    }

    public void setDistanceWalked(double distanceWalked) {
        this.distanceWalked = distanceWalked;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(double caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }


    public void addSteps(int Steps) {
        this.dailySteps += Steps;
        calculateDistance();
        calculateCalories();
        System.out.println(" Your daily steps are " + dailySteps);
    }

    public void calculateDistance() {
        this.distanceWalked = this.dailySteps * kilometersPerStep;
        System.out.println(" Your distance walked is " + distanceWalked + " kilometers");
    }

    public void calculateCalories() {
        this.caloriesBurned = this.dailySteps * caloriesPerStep;
        System.out.println(" You burned " + caloriesBurned + " calories");
    }

    public void updateHeartRate(int newHeartRate) {
        this.heartRate = newHeartRate;
        System.out.println(" Your heart rate is " + heartRate +"BPM");
    }

    public void resetDailyStats() {
        this.dailySteps = 0;
        this.distanceWalked = 0;
        this.caloriesBurned = 0;
        System.out.println(" Your daily steps are"+ dailySteps);
        System.out.println(" Your calories burned is " + caloriesBurned);
        System.out.println(" Your heart rate is " + distanceWalked);
    }

    public void setGoalsSteps(int goalsSteps) {
        this.goalsSteps = goalsSteps;
    }

    public void checkGoal() {
        if (this.dailySteps >= this.goalsSteps) {
            System.out.println("Congradulation," + this.name + " ! Youve reached your daily step goal ");
        }
    }
}



























