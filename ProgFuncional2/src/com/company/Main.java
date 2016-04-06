package com.company;

public class Main {

    public static void main(String[] args) {
	    //usaremos lambdas como clases anonimas. se pueden usar asi, aunque no lo son tanto

        //Imperativo
        Thread hilo = new Thread(new Hilo());
        hilo.start();

        //Con lambdas (programacion funcional)
        Thread hilo2 = new Thread(()->System.out.println("Hola desde el hilo2..."));
        hilo2.start();


        /**
         * Como se forma la lamnbda:
         * run(){
         *  sysout("Hola desde el hilo...");
         * }
         *
         * -run viene implicito, por lo que no se usa
         * -Las llaves y el punto y coma sobra por estetica
         *
         * () -> sysout("Hola desde el hilo...")
         */


        //Otro ejemplo

        //Imperativo
        Suma suma = new Suma(){
            @Override
            public Integer sumarDosNumeros(Integer a, Integer b) {
                return a+b;
            }
        };
        System.out.println(suma.sumarDosNumeros(1,2));


        //Funcional con lambdas
        Suma suma2 = (a,b) -> a + b;
        System.out.println(suma2.sumarDosNumeros(3,4));

        /**
         * El compilador ya sabe que hay que pasarle dos integers, por lo que no
         * es necesario esta definiendo a y b
         *
         * Normalmente se usaria asi
         * (a,b) -> {return a+b};
         */

    }

    @FunctionalInterface //se pone cuando son interfaces con un metodo usados para funcional
    interface Suma {
        Integer sumarDosNumeros(Integer a, Integer b);
    }
}
