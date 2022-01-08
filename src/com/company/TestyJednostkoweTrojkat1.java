package com.company;

import java.awt.geom.Point2D;
import java.util.Scanner;

public class TestyJednostkoweTrojkat1 {
    static float podstawa;
    static float wysokosc;
    static float pole;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość podstawy trójkąta: ");
        podstawa = scanner.nextFloat();
        System.out.println("Podaj wysokosć trójkąta: ");
        wysokosc = scanner.nextFloat();
        Trojkat trojkat = new Trojkat(podstawa, wysokosc);
        pole = trojkat.obliczPole();
        System.out.println("Trójkąt o podstawie: " + podstawa + "i wysokosci: " + wysokosc);
        System.out.println(" ma pole: " + pole);
    }
}
