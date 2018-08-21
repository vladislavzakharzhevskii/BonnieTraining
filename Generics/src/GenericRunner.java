import factories.TransportFactory;
import generics.StaigingMaintancePost;
import model.Coordinate;
import model.Transport;

import java.util.List;

public class GenericRunner {

    public void run(String userName, Class clazz) throws IncompatibleTypeException {
        if (!clazz.equals(GenericRunner.class)) {
            throw new IncompatibleTypeException("Class to run distinct from clazz.");
        }

        Coordinate coordinate = new Coordinate("Kharkov City. Freedom Square", 50.004760, 36.231889);
        List<Transport> src = TransportFactory.generateTransportsWithParameters(coordinate, 3, 1, 6, 12, 5);
        StaigingMaintancePost<Transport> holder = new StaigingMaintancePost<>(src);
        holder.printStatistic();
        holder.runAll();
    }
}
