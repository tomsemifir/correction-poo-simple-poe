package fr.semifir;

public class Point {

    int x, y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point autrePoint) {
        double result = 0;
        double partie1 = Math.pow((autrePoint.x - this.x), 2) ;
        double partie2 = Math.pow((autrePoint.y - this.y), 2) ;
        result = Math.sqrt(partie1 + partie2);
        return result;
    }
}
