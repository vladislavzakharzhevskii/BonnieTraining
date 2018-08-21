package model;

import java.util.Date;

public abstract class Transport {
    protected final String ARROW_1 = new String(new int[] { 0x2190 }, 0, 1);;
    protected final String ARROW_2 = new String(new int[] { 0x2b05 }, 0, 1);;
    protected final String ARROW_3 = new String(new int[] { 0x27f5 }, 0, 1);;

    private String pk;
    private Date dateCreated;
    private String director;
    private TransportType type;
    private Coordinate coordinate;

    public Transport(String pk, TransportType type, Coordinate coordinate) {
        this.pk = pk;
        this.type = type;
        this.coordinate = coordinate;
        this.dateCreated = new Date();
        this.director = System.getProperty("user.name");
    }

    public abstract void doTarget();

    public String toString(String activity) {
        StringBuilder sb = new StringBuilder();
        sb.append("Logic: ").append(activity)
//                .append(ARROW_1)
//                .append(ARROW_2)
                .append(ARROW_3)
                .append("   Type: ")
                .append(type.getName())
                .append(" Coordinate x: ")
                .append(coordinate.getX_coordinate())
                .append(" Coordinate y: ")
                .append(coordinate.getY_coordinate())
                .append(" pk: ")
                .append(pk)
                .append(" Time Created: ")
                .append(dateCreated.getHours())
                .append("/")
                .append(dateCreated.getMinutes())
                .append("/")
                .append(dateCreated.getSeconds())
                .append(System.lineSeparator())
                .append("Director: ")
                .append(director.toUpperCase());


        return sb.toString();
    }
}
