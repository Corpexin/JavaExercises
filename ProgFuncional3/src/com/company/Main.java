package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        //Filtrar una lista
        //Usaremos librerias creadas en java 8 BiFunction y Predicate
	    List<Integer> numeros = Arrays.asList(5, -5, 2, -2, 7, -7, 0, 12, -24, 32, -64, 128);

        //Bifunction = Intefaz que te acepta dos parametros y retorna un resultado
        /**
         * 1 param - parametro para filtrar
         * 2 param - parametro  de funcion que determina como vamos a filtrar esos numeros
         * 3 param - lo que va a devolver
         */
        BiFunction<List<Integer>, Predicate<Integer>, List<Integer>> filtrar;

        //Definimos la bifuncion, pasandole la lista y predicado
        filtrar = (list, predicado) -> {
            List<Integer> resultado = new ArrayList<>(); //definimos el resultado

            for(Integer i: list){ //recorro la list de numeros, testeo cada numero segun la condicion de lambda que le pase en el apply
                if(predicado.test(i)) //si lo supera, se a;ade al resultado, que despues devuelvo
                    resultado.add(i);
            }
            return resultado;
        };

        System.out.println(filtrar.apply(numeros, x -> x<0));
        //tambien serviria x -> x%2 ==0 devolveria los pares =S
    }
}
