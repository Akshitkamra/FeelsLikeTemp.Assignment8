package com.Akshitkamra_c0796392_a8;

import javax.swing.*;

public class TestTemperature {
    public static void testTemperature(String[] days, double[] temp, double[] speed){
        for (int i = 0; i < days.length; i++){
            double tempFeels = temp[i] - (temp[i] * speed[i])/100;
            JOptionPane.showMessageDialog(null,
                    "Feels like temperature on " + days[i] + " : " + String.format("%.2f", tempFeels));
        }
    }
}
