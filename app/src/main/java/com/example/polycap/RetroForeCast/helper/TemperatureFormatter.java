package com.example.polycap.RetroForeCast.helper;

/**
 * Created by Polycap on 8/18/2015.
 */
public class TemperatureFormatter {
    public static String format(float temperature) {
        return String.valueOf(Math.round(temperature)) + "°";
    }
}
