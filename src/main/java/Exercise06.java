/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Magdalena Sobrino-Almanzar
 */


import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Exercise06 {
    public static void main(String[] args) {



        int currentyear;
        int futureyear;
        
        Scanner input = new Scanner(System.in);

        System.out.print("What is your current age? ");
        String age = input.next();

        System.out.print("At what age would you like to retire? ");
        String retireage = input.next();

        int agenow = Integer.parseInt(age);
        int agebefore = Integer.parseInt(retireage);

        int subyears = agebefore - agenow;

        LocalDate currentDate = LocalDate.now();
        DayOfWeek dow = currentDate.getDayOfWeek();


        int yearnow = currentDate.getYear();
        int yearthen = yearnow + subyears;

        System.out.print(" You have " + subyears + " left until you can retire.");
        System.out.println("It's " + yearnow +", so you can retire in " +yearthen + ".");


    } // end of main//

} // end of program//
