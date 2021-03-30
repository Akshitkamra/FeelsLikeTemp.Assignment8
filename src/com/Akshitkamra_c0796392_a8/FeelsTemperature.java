package com.Akshitkamra_c0796392_a8;

import javax.swing.*;
import java.util.Arrays;

public class FeelsTemperature {
    static int  n = Integer.parseInt(JOptionPane.showInputDialog("Please enter total number of days:"));
    String[] days = new String[n];
    double[] temp = new double[n];
    double[] speed = new double[n];

    public static void main(String[] args) {
        FeelsTemperature temperature = new FeelsTemperature();
        for (int i = 0; i< FeelsTemperature.n; i++) {
            String day = temperature.getDay();
            double temp = temperature.getTemperature(day);
            double speed = temperature.getWindSpeed(day);
            temperature.temp[i] = temp;
            temperature.days[i] = day;
            temperature.speed[i] = speed;
            System.out.println(day);
            System.out.println(temp);
            System.out.println(speed);
        }
        TestTemperature.testTemperature(temperature.days,temperature.temp,temperature.speed);
        System.out.println(Arrays.toString(temperature.temp));
        System.out.println(Arrays.toString(temperature.speed));
        System.out.println(Arrays.toString(temperature.days));
    }
    public double getTemperature(String day){
        double temp;
        temp = Double.parseDouble(JOptionPane.showInputDialog("Enter the temperature of the " + day));
        return temp;
    }
    public String getDay(){
        String day;
        day = JOptionPane.showInputDialog("Enter the Day of the Week: ");
        return day;
    }
    public double getWindSpeed(String day){
        double speed;
        speed = Double.parseDouble(JOptionPane.showInputDialog("Enter the Wind Speed of the " + day));
        return speed;
    }
}
