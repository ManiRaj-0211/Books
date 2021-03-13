package com.chapter04;

public class J01IfStatement {
    public static void main(String[] args) {


        // If - Else and Nested If statements
        int age = 16;
        boolean parentPermission = false;

        if(age >= 18) {
            System.out.println("You are Allowed...");
        }
        else {
            if(parentPermission) {
                System.out.println("You are Allowed...");
            }
            else {
                System.out.println("Sorry! You are NOT Allowed...");
            }
        }


        // Elseif Statement
        int month = 11;
        String season;

        if(month == 12 || month == 1 || month == 2) {
            season = "Winter";
        }
        else if(month == 3 || month == 4 || month == 5) {
            season = "Spring";
        }
        else if(month == 6 || month == 7 || month == 8) {
            season = "Summer";
        }
        else if(month == 9 || month == 10 || month == 11) {
            season = "Autumn";
        }
        else {
            season = "Month is Not Available";
        }

        System.out.println("\n" + season);

    }
}
