// Compute Distance light travels using long variables

package com.chapter02;

public class J03LongDataType {
    public static void main(String[] args) {

        int lightSpeed;
        long days, seconds, distance;

        lightSpeed = 186000;                // approximate speed
        days = 15000;                        // number of days
        seconds = days * 24 * 60 * 60;      // convert days into seconds

        distance = lightSpeed * seconds;    // compute distance

        System.out.print("In " + days + " Days light will travel about ");
        System.out.println(distance + " miles.");

    }
}
