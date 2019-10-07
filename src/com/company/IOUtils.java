package com.company;

import java.util.Scanner;

public class IOUtils {

    private static Scanner scanner = new Scanner(System.in);


    public static  int readCommandLine( int numCarreau, int numBoules){

        System.out.println("Carreau numéro : numCarreau : Veuillez entrez le resultas du boule numBoules ");

        return scanner.nextInt();

    }
}
