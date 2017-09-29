package com.company;
// 1 programm recho == like echo with inverse parameter order

// 2 read values from stdIn == output of keyboard    programm read from stdIn
//dichotomic research of number
// a. prog choose a number randomly
// b. prog ask for a number (integer)-> user taps a number possibility of limitation of the number, search on Google the conversion from string to int;
// c. prog tells if the secret number is bigger or smaller
// d. if it is the good value it print " success message" and quit


import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        int[] interval_basique;

        //definir un intervalle
        //saisie des bornes
        Scanner scg = new Scanner(System.in);
        System.out.println("Saisissez les limites de l'intervalle");
        int min_jeu = scg.nextInt();
        int max_jeu = scg.nextInt();

        //ordonnancement des bornes
        if (max_jeu < min_jeu) {
            int min_tp = min_jeu;
            min_jeu = max_jeu;
            max_jeu = min_tp;
        }

        //choisir le nombre secret
        int nb_sec=generator(min_jeu,max_jeu);

        //obtenons une valeur d'essai
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez un entier entre " + min_jeu + " et " + max_jeu);
        int nb_saisi = sc.nextInt();

        //ctrl de la proposition
        while ((nb_saisi>max_jeu)|(nb_saisi<min_jeu)){
            System.out.println("Saisissez un entier entre " + min_jeu + " et " + max_jeu);
            nb_saisi = sc.nextInt();
        }

        //comparons la valeur d'essai et le nombre secret
        while (nb_saisi!=nb_sec){
            if (nb_sec<nb_saisi){
                System.out.println("vous avez dépassé l'objetif!");
                max_jeu=nb_saisi;            }
            if (nb_sec>nb_saisi){
                System.out.println("Encore un effort, vous êtes en deça de l'objectif!");
                min_jeu=nb_saisi;
            }
            System.out.println("Saisissez un entier entre " + min_jeu + " et " + max_jeu);
            nb_saisi = sc.nextInt();
        }

        System.out.println("vous avez gagné! Le nombre secret est : " + nb_sec);
    }
        // generer un nombre secret dans l'intervalle
    static int generator ( int min_i, int max_i){
        int nbr_secret = (int) (((max_i - min_i) * random()) + min_i);
        return (nbr_secret);

    }


}