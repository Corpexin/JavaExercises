package com.company;

import java.util.Random;

/**
 * Created by Corpex on 21/05/2016.
 */
public class yokse {

    static Random rnd;
    static double result;

    public static double calcular(double x){
        result = 0;
        rnd = new Random();
        for(int i=0 ; i<10 ; i++){
            result = result + (Math.abs(rnd.nextDouble()) * Math.pow(rnd.nextDouble()/x, x));
        }
        return result;
    }

}
