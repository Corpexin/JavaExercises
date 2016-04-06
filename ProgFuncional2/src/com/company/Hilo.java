package com.company;

/**
 * Created by Corpex on 06/04/2016.
 */
public class Hilo implements Runnable{
    @Override
    public void run() {
        System.out.println("Hola desde el hilo...");
    }
}
