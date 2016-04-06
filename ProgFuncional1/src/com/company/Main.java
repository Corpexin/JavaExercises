package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
	    //Encontrar numeros pares y guardarlos en un arraylist
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        ArrayList<Integer> resultados = new ArrayList<>();

        //Imperativo
        for(Integer n: numeros)
            if(n%2==0)
                resultados.add(n);

        for(Integer n: resultados)
            System.out.println(n);


        //Funcional
        resultados = (ArrayList<Integer>) numeros.stream().filter(Main::esPar).collect(Collectors.toList());
        for(Integer n: resultados)
            System.out.println(n);

        /**
         * Es funcional porque el metodo filter usa una funcion con :: para comprobar que el numero sea par
         */

        //Funcional con lambda
        resultados = (ArrayList<Integer>) numeros.stream().filter(n -> n%2!=0).collect(Collectors.toList());
        for(Integer n: resultados)
            System.out.println(n);

        /**
         * Funcionan como si fueran funciones anonimas
         * En realidad la lambda es .filter((Integer n) -> {returm n%2==0;}) pero se compactan para ser mas esteticas
         * y porque la funcion filter da por echo de forma explicita que le van a pasar un integer que sea comprobado
         * con un booleano
         */
    }

    private static boolean esPar(Integer integer) {
        return integer%2==0;
    }
}
