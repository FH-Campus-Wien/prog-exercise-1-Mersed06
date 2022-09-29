package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    Scanner scanner = new Scanner(System.in);
    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");    }

    //todo Task 2
    public void helloRobot(){
        System.out.print("0123456789012345678901" + System.lineSeparator()+
                "         __" + System.lineSeparator() +
                " _(\\    |@@|" + System.lineSeparator() +
                "(__/\\__ \\--/ __" + System.lineSeparator() +
                "   \\___|----|  |   __" + System.lineSeparator() +
                "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
                "       /\\__/\\ \\__O (__" + System.lineSeparator() +
                "      (--/\\--)    \\__/" + System.lineSeparator() +
                "      _)(  )(_" + System.lineSeparator() +
                "     `---''---`" + System.lineSeparator());
    }

    //todo Task 3
    public void sumOfLiterals(){
        int l1 = 'Z';
        int l2 = 0xface;
        int l3 = 012;
        int l4 = (int) 80L;
        int l5 = (int) 44e-1f;
        int l6 = (int) 5.5f;
        int l7 = (int) 8.88e1;
        int l8 = (int) 99.9;
        int sum = l1+l2+l3+l4+l5+l6+l7+l8;
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();

        System.out.println(int1+int2);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        System.out.println("Before Swap:");
        System.out.print("x: ");
        int int1 = scanner.nextInt();
        System.out.print("y: ");
        int int2 = scanner.nextInt();

        System.out.println("After Swap:");
        System.out.println("x: " + int2);
        System.out.println("y: " + int1);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        System.out.print("n1: ");
        int n1 = scanner.nextInt();
        System.out.print("n2: ");
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("n1 > n2");
        } else if (n2 > n1) {
            System.out.println("n2 > n1");
        } else {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        System.out.print("Enter annual Revenue: ");
        int value = scanner.nextInt();
        if(value < 0 || value >= 100000) {
            System.out.println("Invalid Revenue");}
        else if (value >= 0 && value < 20000) {
            System.out.println("Poor Sales Revenue");}
        else if (value >= 20000 && value < 50000) {
            System.out.println("Average Sales Revenue");}
        else if (value >= 50000 && value < 80000) {
            System.out.println("Good Sales Revenue");}
        else if (value >= 80000 && value < 100000){
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        System.out.print("Enter CommissionClass: ");
        int value = scanner.nextInt();
        switch (value) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9
    public void leapyear(){
        System.out.print("Year: ");
        int value = scanner.nextInt();
        if ((value % 4 ) == 0 && (value % 400) == 0)
        {
            System.out.println("Leapyear");
        } else if ((value % 100) == 0 && (value % 400) != 0)
        {
            System.out.println("Not a Leapyear");
        }
        else{
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        System.out.print("Number: ");
        int value = scanner.nextInt();
        int int1;

        if (value < 10) {
            System.out.println(value);
        } else if (value > 999) {
            System.out.println("Number has more than 3 digits");
        }
        else {


            int digitLast = value%10;
            int numberWithoutDigitLast = value/10;
            int digitMiddle = numberWithoutDigitLast%10;
            int lastNumber = numberWithoutDigitLast /10;

            System.out.println(String.valueOf(digitLast) + digitMiddle + lastNumber);

        }
        /*if (value >= 9) {
           int1 = value % 10 ; // Wert 5
           int withoutlastdigit = int1 /10;
           int middleDigit = withoutlastdigit % 10; //Wert 3
           int lastDigit = withoutlastdigit / 10;

            System.out.println(String.valueOf(lastDigit) + String.valueOf(middleDigit) + String.valueOf(int1));
        }
        else
        {
            System.out.println(value);
        }
         */
    }

    //Eigentlicher Code, der funktionieren sollte, dies aber erstaunlicherweise nicht tut, funktioniernder Code von Emil Tiric



    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}