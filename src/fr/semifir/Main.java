package fr.semifir;

import org.w3c.dom.css.Rect;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(5,6);
        Point p2 = new Point(3,2);

        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
    }
}
