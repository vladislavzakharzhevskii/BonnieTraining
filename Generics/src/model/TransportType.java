package model;

public enum TransportType {

    TRACTOR(8.0, "Tractor", "Heavy machinery"),
    CRANE(8.0, "Cranr", "Heavy machinery"),
    CONCRETE_MIXER(8.0, "ConcreteMixer", "Heavy machinery"),
    WAGGON(8.0, "Wagon", "Heavy machinery"),
    DOZER(8.0, "Dozer", "Heavy machinery"),
    TAXI(15.0, "Transport", "Category to transport people from point A to point B. Works by 'free-time' graphic but not more than 15 hrs.");

    private Double working_hrs;
    private String category;
    private String description;

    TransportType(Double working_hrs, String category, String description) {
        this.working_hrs = working_hrs;
        this.category = category;
        this.description = description;
    }

    public String getName() {
        return this.name();
    }



}
