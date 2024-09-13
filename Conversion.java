import java.util.Scanner;

public class Conversion {
    public static void Main(String[] args) {

        System.out.println("Unit to convert from");
        Scanner in = new Scanner(System.in);
        String first = in.nextLine();
        System.out.println("Unit to convert to");
        String second = in.nextLine();
        System.out.println("Value to convert");
        int number = in.nextInt();
        in.close();
        if ("Inches".equals(first)) {
            if (second == "Feet") {
                System.out.println(number + " inches is equal to " + number / 12 + "feet");
            } else if (second == "Cubits") {
                System.out.println(number + " inches is equal to " + number / 18 + "cubits");
            } else if (second == "Steps") {
                System.out.println(number + " inches is equal to " + number / 0.03 + "steps");
            } else if (second == " yards") {
                System.out.println(number + " inches is equal to " + number / 36 + "yards");
            } else if (second == "Miles") {
                System.out.println(number + " inches is equal to " + number / 63360 + "miles");
            }
        }
        if (first == "Feet") {
            if (second == "Inches") {
                System.out.println(number + " feet is equal to " + number * 12 + "feet");
            } else if (second == "Cubits") {
                System.out.println(number + " feet is equal to " + number / 1.5 + "cubits");
            } else if (second == "Steps") {
                System.out.println(number + " feet is equal to " + number / 2.5 + "steps");
            } else if (second == "Yards") {
                System.out.println(number + " feet is equal to " + number / 3 + "yards");
            } else if (second == "Miles") {
                System.out.println(number + " feet is equal to " + number / 5280 + "miles");
            }
        }
        if (first == "Cubits") {
            if (second == "Inches") {
                System.out.println(number + " Cubits is equal to " + number * 18 + "Inches");
            } else if (second == "Feet") {
                System.out.println(number + " Cubits is equal to " + number * 1.5 + "Feet");
            } else if (second == "Steps") {
                System.out.println(number + " Cubits is equal to " + number * 0.6 + "Steps");
            } else if (second == "Yards") {
                System.out.println(number + " Cubits is equal to " + number / 2 + "Yards");
            } else if (second == "Miles") {
                System.out.println(number + " Cubits is equal to " + number / 3520 + "Miles");
            }
        }
        if (first == "Steps") {
            if (second == "Inches") {
                System.out.println(number + " Steps is equal to " + number * 0.03 + "Inches");
            } else if (second == "Cubits") {
                System.out.println(number + " Steps is equal to " + number * 1.6667 + "Cubits");
            } else if (second == "Feet") {
                System.out.println(number + " Steps is equal to " + number * 2.5 + "Feet");
            } else if (second == "Yards") {
                System.out.println(number + " Steps is equal to " + number / 1.2 + "Yards");
            } else if (second == "Miles") {
                System.out.println(number + " Steps is equal to " + number / 2000 + "Miles");
            }
        }
        if (first == "Yards") {
            if (second == "Inches") {
                System.out.println(number + " Yards is equal to " + number * 36 + "Inches");
            } else if (second == "feet") {
                System.out.println(number + " Yards is equal to " + number * 3 + "feet");
            } else if (second == "Cubits") {
                System.out.println(number + " Yards is equal to " + number * 2 + "Cubits");
            } else if (second == "Steps") {
                System.out.println(number + " Yards is equal to " + number * 1.2 + "Steps");
            } else if (second == "Miles") {
                System.out.println(number + " Yards is equal to " + number / 1760 + "Miles");
            }
        }
        if (first == "Miles") {
            if (second == "Inches") {
                System.out.println(number + " Miles is equal to " + number * 63360 + "Inches");
            } else if (second == "Feet") {
                System.out.println(number + " Miles is equal to " + number * 5280 + "Feet");
            } else if (second == "Steps") {
                System.out.println(number + " Miles is equal to " + number * 2000 + "Steps");
            } else if (second == "Cubits") {
                System.out.println(number + " Miles is equal to " + number * 3520 + "Cubits");
            } else if (second == "Yards") {
                System.out.println(number + " Miles is equal to " + number * 1760 + "Yards");
            }
        }

    }
}