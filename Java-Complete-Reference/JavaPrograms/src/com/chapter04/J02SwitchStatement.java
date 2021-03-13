package com.chapter04;

public class J02SwitchStatement {
    public static void main(String[] args) {

        // Simple Switch Statement
        System.out.println("Simple Switch Statement...");
        for(int i = 1; i <= 5; i++) {
            switch (i) {
                case 1:
                    System.out.println("i is 1");
                    break;
                case 2:
                    System.out.println("i is 2");
                    break;
                case 3:
                    System.out.println("i is 3");
                    break;
                default:
                    System.out.println("i is greater than 3");
                    break;
            }
        }


        // Improved Version of Season Program (ifStatement Program)
        System.out.println("\nSeason Program...");

        int month = 11;
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Month is Not Available";
                break;
        }

        System.out.println("Season : " + season);


        // Nested Switch
        System.out.println("\nNested Switch Statement...");

        int count = 1, target = 2;

        switch (count) {
            case 1:
                switch (target) {
                    case 1:
                        System.out.println("Count 1 Target 1");
                        break;
                    case 2:
                        System.out.println("Count 2 Target 2");
                        break;
                    default:
                        System.out.println("Count 1 Target Not Available");
                        break;
                }
                break;
            default:
                System.out.println("Count Not Available");
                break;
        }

    }
}
