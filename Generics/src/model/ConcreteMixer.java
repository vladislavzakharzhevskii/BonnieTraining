package model;

public class ConcreteMixer extends Transport{

    public ConcreteMixer(String pk, TransportType type, Coordinate coordinate) {
        super(pk, type, coordinate);
    }

    @Override
    public void doTarget() {
        System.out.println(super.toString("do ConcreteMixer Activity "));
    }
}
