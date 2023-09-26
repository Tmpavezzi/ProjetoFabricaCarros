package main;

import factory.*;

public class Main {
    public static void main(String[] args) {

        Carro c= Fabrica.Fabrica(Tipo.FOX);
        System.out.println(c);
    }
}