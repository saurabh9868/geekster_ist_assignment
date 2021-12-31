package saurabh_geekster;

import java.util.Scanner;

public class differenciate_students_on_the_basic_of_marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the gender ");
        String gender=sc.next();
        System.out.println("enter the marks");
        int mark= sc.nextInt();
        String result=(gender.equals("m"))? (mark>=75)? "intelligent boy":(mark>35)? "average boy":"dull boy":(mark>=75)? "intelligent girl":(mark>35)? "average girl":"dull girl";
        System.out.println(result);
    }
}
