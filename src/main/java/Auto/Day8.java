package Auto;

import java.util.Scanner;

//if else
public class Day8 {
    public static void main(String[] args) {

        /*int number = -1;
        if (number > 0) {
            System.out.println("positive");
        }
        if (number < 0){
            System.out.println("negative");
        }
        if (number == 0){
            System.out.println("Zero");
        }*/

        /*int voter_age = 14;
        if (voter_age >= 18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }*/

        /*int student_marks = 34;

        if (student_marks < 0){
            System.out.println("Error: Student marks cannot be negative");
        }
        else if (student_marks <= 33)
        {
            System.out.println("Failed");
        } else if (student_marks <= 60) {
            System.out.println("Grade C");
        } else if (student_marks <= 80) {
            System.out.println("Grade B");
        } else if (student_marks <= 100) {
            System.out.println("Grade A");
        }
        else {
            System.out.println("Error: Marks cannot be greater than 100");
        }*/

        int student_marks = 101;
        if (student_marks >= 0 && student_marks <= 33)
        {
            System.out.println("Failed");
        } else if (student_marks >= 34 && student_marks <= 60) {
            System.out.println("Grade C");
        } else if (student_marks >= 61 && student_marks <= 80) {
            System.out.println("Grade B");
        } else if (student_marks >= 81 && student_marks <= 100) {
            System.out.println("Grade A");
        } else if (student_marks < 0) {
            System.out.println("Error: Student marks cannot be negative");
        } else {
            System.out.println("Error: Marks cannot be greater than 100");
        }

    }
}
