package com.company;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        /**
         * https://dzone.com/articles/java-8-stringjoiner-old-wine-with-new-bottle?edition=187462&utm_source=Daily%20Digest&utm_medium=email&utm_content=POS2&utm_campaign=dd%202016-06-24
         * tengo 2 strings,  "Smart" y "Techie" y quiero unirlos para que quede
         * tal que asi> [Smart, Techie], con prefijo y sufijo [] y con el delimitador
         * ",". Para solucionar esto, usamos la clase StringJoiner con el constructor
         **/

        StringJoiner sj = new StringJoiner(",", "[", "]");
        sj.add("Smart").add("Techie");
        System.out.println("La linea final es : "+sj.toString());

        //si no queremos tener ni prefijo ni sufijo, entonces:
        StringJoiner sj2 = new StringJoiner(",");
        System.out.printf(sj2.toString());

        /**
         * Si lo que queremos es concatenar los elementos de una lista podemos
         * usar .collect y .joining adjuntandole tambien el delimitador, prefijo y sufijo
         */
        ArrayList<String> lista = new ArrayList<>();
        lista.add("hola");
        lista.add("que");
        lista.add("tal");

        String resultado = lista.stream().collect(Collectors.joining(" | ", "[", "]"));
        System.out.println("El resultado de concatenar la lista es : "+resultado);
    }
}
