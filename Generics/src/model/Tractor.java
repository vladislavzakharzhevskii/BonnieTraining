package model;

public class Tractor extends Transport {

    public Tractor(String pk, TransportType type, Coordinate coordinate) {
        super(pk, type, coordinate);
    }

    @Override
    public void doTarget() {
        System.out.println(super.toString("do Tractor Activity "));
    }
}
