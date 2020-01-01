package com.company;

public class Matrice_Adjacence {
    private final int sommets;
    private int[][] matrice;

    public Matrice_Adjacence(int s)
    {
        sommets = s;
        matrice = new int[100][100];
    }

    public void Arcs(int s1, int s2)
    {
        try
        {
            matrice[s1][s2] = 1;
        }
        catch (ArrayIndexOutOfBoundsException index)
        {
            System.out.println("Erreur");
        }
    }

    public int getArcs(int s1, int s2)
    {


        return matrice[s1][s2];

    }
}
