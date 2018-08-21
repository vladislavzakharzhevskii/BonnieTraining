package generics;

import model.Transport;

import java.util.*;

public class StaigingMaintancePost<B extends Transport> {

    private final List<B> assets = new ArrayList<B>();

    public StaigingMaintancePost() {}

    public StaigingMaintancePost(List<B> assets) {
        addAssets(assets);
    }

    public void addAsset(B asset) {
        this.assets.add(asset);
    }

    public void addAssets(List<B> assets) {
        this.assets.addAll(assets);
    }

    public void addAssets(B[] assets) {
        this.assets.addAll(Arrays.asList(assets));
    }

    public void setAssets(B... assets) {
        this.assets.addAll(Arrays.asList(assets));
    }

    public void printStatistic() {
        Map<Class, Integer> statistic = new HashMap<>();
        for (B asset : assets) {
            if (!statistic.containsKey(asset.getClass())) {
                statistic.put(asset.getClass(), 1);
                continue;
            }
            statistic.put(asset.getClass(), statistic.get(asset.getClass()) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (Class clazz : statistic.keySet()) {
            sb.append(clazz.getName())
                    .append(" : ")
                    .append(statistic.get(clazz))
                    .append(";")
                    .append(System.lineSeparator());
        }

        System.out.print(sb.toString() + "---- Statistic --- " + System.lineSeparator());
    }

    public void runAll() {
        for (B asset : assets) {
            asset.doTarget();
        }
    }

    private void runAll(List<? extends Transport> src) {
        for (Transport asset : src) {
            asset.doTarget();
        }
    }

    private List<Transport> getByClazz(Class<? extends Transport> clazz) {
        List<Transport> src = new ArrayList<>();
        for (B asset : assets) {
            if (asset.getClass().equals(clazz)) {
                src.add(asset);
            }
        }
        return src;
    }

    public void run(Class<? extends Transport> clazz) {
        List<Transport> src = getByClazz(clazz);
        runAll(src);
    }


    public void run(Class<? extends Transport>[] clazz) {
        List<Class<? extends Transport>> clazzToRun = Arrays.asList(clazz);
        List<Transport> src = new ArrayList<>();

        for (Class<? extends Transport> clazz1 : clazzToRun) {
            src.addAll(getByClazz(clazz1));
        }
        runAll(src);
    }

    public void remove(Class<? extends Transport> clazz) {
        List<Transport> transportToExclude = getByClazz(clazz);
        assets.removeAll(transportToExclude);
    }

}
