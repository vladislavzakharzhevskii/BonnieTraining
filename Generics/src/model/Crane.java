package model;

public class Crane extends Transport {

    public Crane(String pk, TransportType type, Coordinate coordinate) {
        super(pk, type, coordinate);
    }

    @Override
    public void doTarget() {
        System.out.println(super.toString("do Crane Activity "));
    }
}
