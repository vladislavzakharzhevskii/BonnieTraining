package model;

public class Coordinate {


    private String objectName;
    private double x_coordinate;
    private double y_coordinate;

    public Coordinate(String objectName, double x_coordinate, double y_coordinate) {
        this.objectName = objectName;
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
    }

    public double getX_coordinate() {
        return x_coordinate;
    }

    public double getY_coordinate() {
        return y_coordinate;
    }
}
