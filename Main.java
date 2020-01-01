package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int s, a, i = 1, s1 = 0, s2 = 0;
        //intialisation

        Scanner sc = new Scanner(System.in);
        Matrice_Adjacence m;
        try
        {
            System.out.println("Entrer le nombre de sommets: ");
            s= sc.nextInt();
            System.out.println("Entrer le nombre d'arcs : ");
            a= sc.nextInt();

            m = new Matrice_Adjacence(s);

            System.out.println("Entrer les arcs sous forme s1 s2 :");
            while (i <= a)
            {
                s1= sc.nextInt();
                s2 = sc.nextInt();

                m.Arcs(s1, s2);
                i++;
            }

            System.out.println("Votre Matrice D'adjacence est : ");
            System.out.print("  ");
            for (int k = 1; k <= s; k++)
                System.out.print(k + " ");
            System.out.println();

            for (int k = 1; k <= s; k++)
            {
                System.out.print(k + " ");
                for (int j = 1; j <= s; j++)
                    System.out.print(m.getArcs(k, j) + " ");
                System.out.println();
            }


        }
        catch (Exception E)
        {
            System.out.println("Erreur");
        }
    }
}
