package com.Justin;

public class SpeedConverter {

    double speed = 10;

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) return (long) -1;
        if(kilometersPerHour == 0) return (long) 0;
        else {
            return (long) Math.round(kilometersPerHour / 1.609);
        }

    }

    public static void printConversion(double kilometersPerHour) {
        long convertedSpeed = toMilesPerHour(kilometersPerHour);
        String formattedKPH = "";
        if(kilometersPerHour == (long) kilometersPerHour)
            formattedKPH = String.format("%d",(long)kilometersPerHour);
        else
            formattedKPH = String.format("%s",kilometersPerHour);

        if(convertedSpeed == -1) {
            System.out.println("Invalid Value");
        } else
        System.out.printf("%s km/h = %d mi/h", formattedKPH, convertedSpeed);
        System.out.println();
    }


}

