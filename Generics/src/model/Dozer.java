package model;

public class Dozer extends Transport {


    public Dozer(String pk, TransportType type, Coordinate coordinate) {
        super(pk, type, coordinate);
    }

    @Override
    public void doTarget() {
        System.out.println(super.toString("do Dozer Activity "));
    }


}
