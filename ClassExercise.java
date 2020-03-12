package classexercise;

import java.util.Locale;
import java.util.Scanner;

public class ClassExercise {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        input.useLocale(Locale.US);        // αυτο δεν φαινεται να διωρθωνει κατι, ακομα δεν με αφηνει να βαλω "," αντι για "." στο υψος 
        System.out.println("What is your name? ");
        String name = input.next();
        System.out.println("What is your gender " + name + "? ");

        char gender = genderMethod();

        int age = ageMethod(name);

        ageDifferenceMethod(age, name);

        bornMethod(age, name);

        SeasonsMethod(name);

        bmiMethod(name);

        int luckyDay = luckyDayMethod(age);

        clubMethod(luckyDay, gender, name, age);

    }

    static char genderMethod() {
        int j = 0;
        char gender = '\u0000';            // αυτο το πηρα ετοιμο απο το google, δεν ειμαι σιγουρος τι κανει, απλα ηθελα να οριζω το gender
        System.out.println(gender);
        while (j < 1) {
            gender = input.next().charAt(0);
            if (gender != 'm' && gender != 'M' && gender != 'f' && gender != 'F') {
                System.out.println("This is not a gender");
            } else {
                j++;
            }
        }
        return gender;
    }

    static int ageMethod(String name) {
        System.out.println("What is your age " + name + "? ");
        int v = 0;
        int age2 = 0;
        while (v < 1) {
            age2 = input.nextInt();
            if (age2 < 0) {
                System.out.println("You can't be " + age2 + " years old, try again");
            } else if (age2 >= 0 && age2 <= 40) {
                v++;
            } else if (age2 > 40) {
                v++;
            }
        }
        return age2;
    }

    static void ageDifferenceMethod(int x, String name) {
        int age = x;
        if (age <= 5) {
            System.out.println("You are too young for this app " + name);
            int ageDifference = 6 - age;
            System.out.println("Come back in " + ageDifference + " years when you will be a student " + name + ".");
        } else if (age <= 18) {
            System.out.println("Oh you are a student " + name + ".");
            int ageDifference = 19 - age;
            System.out.println("Keep up... " + ageDifference + " more years left and afterwards you will make money" + name + ".");
        } else if (age <= 40) {
            System.out.println("Well, you must be employed " + name);
            int ageDifference = age - 18;
            System.out.println("You finished school " + ageDifference + " years ago " + name + ".");
        }
    }

    static void bornMethod(int age, String name) {
        int wereYouBorn = 2020 - age;
        int ageAt2040 = age + 20;
        if (age > 40) {
            int ageAt1980 = 1980 - wereYouBorn;
            System.out.println("In 1980 you were " + ageAt1980 + " years old " + name);
        } else {
            System.out.println("You werent born yet " + name);
        }
        System.out.println("In 2040 you will be " + ageAt2040 + " years old " + name);

    }

    static void SeasonsMethod(String name) {
        System.out.println("-----Seasons-----");
        System.out.println("What is your favorite season " + name + "? ");
        String[] seasons = {"Winter", "Sprint", "Summer", "Autumn"};
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(i + 1 + "." + seasons[i]);
        }
        int number = input.nextInt();
        if (number == 1) {
            System.out.println("It must be cold outside " + name);
        } else if (number == 2) {
            System.out.println("Ohh, flowers are very beautiful these days " + name);
        } else if (number == 3) {
            System.out.println("Let's go for swimming " + name);
        } else if (number == 4) {
            System.out.println("The trees are full of brown leaves " + name);
        }
    }

    static void bmiMethod(String name) {
        System.out.println("-----BMI-----");
        System.out.println("What is your height " + name + "?");
        double height = input.nextDouble();
        System.out.println("What is your weight " + name + "?");
        double weight = input.nextDouble();
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Normal weight");
        } else if (bmi <= 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
    }

    static int luckyDayMethod(int age) {
        int days = age * 365;
        int dayCounter = 0;
        while (days > 0) {
            dayCounter = dayCounter + days % 10;
            days = days / 10;
        }
        int luckyDay = dayCounter % 7;
        if (luckyDay == 0) {
            System.out.println("Lucky day is Monday");
        } else if (luckyDay == 1) {
            System.out.println("Lucky day is Tuesday");
        } else if (luckyDay == 2) {
            System.out.println("Lucky day is Wed");
        } else if (luckyDay == 3) {
            System.out.println("Lucky day is Thu");
        } else if (luckyDay == 4) {
            System.out.println("Lucky day is Friday");
        } else if (luckyDay == 5) {
            System.out.println("Lucky day is Saturday");
        } else if (luckyDay == 6) {
            System.out.println("Lucky day is Sunday");
        }
        return luckyDay;
    }

    static void clubMethod(int luckyDay, char gender, String name, int age) {
        System.out.println("Can you enter?");
        if (luckyDay == 2) {
            if (age >= 20 && age <= 40) {
                if (gender == 'f' && gender == 'F') {
                    System.out.println("Are you married?");
                    int m = 0;
                    while (m < 1) {
                        String married = input.next();
                        if (married == "y") {
                            System.out.println("Welcome Mrs " + name);
                        } else if (married == "n") {
                            System.out.println("Welcome Mr " + name);
                        }
                    }
                } else if (gender == 'm' && gender == 'M') {
                    if (age <= 25) {
                        System.out.println("Welcome " + name);
                    } else if (age > 25) {
                        System.out.println("Welcome Mr " + name);
                    }
                }
            } else if (age < 20) {
                System.out.println("Sorry you are not old enough");
            } else {
                System.out.println("Sorry you are too old");
            }
        } else {
            System.out.println("Sorry it's not your lucky day");
        }
    }
}
