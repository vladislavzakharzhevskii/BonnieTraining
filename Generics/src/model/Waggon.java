package model;

public class Waggon extends Transport {


    public Waggon(String pk, TransportType type, Coordinate coordinate) {
        super(pk, type, coordinate);
    }

    @Override
    public void doTarget() {
        System.out.println(super.toString("do Waggon Activity "));
    }
}
