package section020.Assign3;

import java.util.Scanner;

public class Assign3 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        double grade = reader.nextDouble();
        System.out.print("Grade: ");
            if (grade >= 92.5 && grade <= 100)
                System.out.println("A");
            else if (grade >= 89.5 && grade < 92.5)
                System.out.println("A-");
            else if (grade >= 86.5 && grade < 89.5)
                System.out.println("B+");
            else if (grade >= 83.5 && grade < 86.5)
                System.out.println("B");
            else if (grade >= 80.5 && grade < 83.5)
                System.out.println("B-");
            else if (grade >= 76.5 && grade < 80.5)
                System.out.println("C+");
            else if (grade >= 72.5 && grade < 76.5)
                System.out.println("C");
            else if (grade >= 69.5 && grade < 72.5)
                System.out.println("C-");
            else if (grade >= 66.5 && grade < 69.5)
                System.out.println("D+");
            else if (grade >= 60.5 && grade < 66.5)
                System.out.println("D");
            else if (grade < 60.5)
                System.out.println("F");
            else if (grade > 100 && grade < 0)
                System.out.println("Invalid");

    }
}
