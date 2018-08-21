package factories;

import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TransportFactory {

    public static List<Transport> generateTransportsWithParameters(Coordinate coordinate, int tractorCount, int craneCount, int concreteMixerCount, int waggonCount, int dozerCount) {
        List<Transport> src = new ArrayList<>();

        for (int i = 0; i < tractorCount; i++) {
            src.add(new Tractor(getUUID(), TransportType.TRACTOR, coordinate));
        }
        for (int i = 0; i < craneCount; i++) {
            src.add(new Crane(getUUID(), TransportType.CRANE, coordinate));
        }
        for (int i = 0; i < concreteMixerCount; i++) {
            src.add(new ConcreteMixer(getUUID(), TransportType.CONCRETE_MIXER, coordinate));
        }
        for (int i = 0; i < waggonCount; i++) {
            src.add(new Waggon(getUUID(), TransportType.WAGGON, coordinate));
        }
        for (int i = 0; i < dozerCount; i++) {
            src.add(new Dozer(getUUID(), TransportType.WAGGON, coordinate));
        }
        return src;
    }

    private static String getUUID() {
        return UUID.randomUUID().toString();
    }


}
