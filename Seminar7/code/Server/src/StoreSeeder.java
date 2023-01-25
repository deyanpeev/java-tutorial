import java.time.LocalDate;

public class StoreSeeder {
    public static Store getSeededStore() {
        Store store = new Store();
        populate(store);
        return store;
    }

    private static void populate(Store store) {
        store.addComputer(new Computer("Lenovo", "T15", false, LocalDate.now(), 5));
        store.addComputer(new Computer("Asus", "Zenbook",
                true, LocalDate.of(2020, 10, 1), 2));
        store.addComputer(new Computer("Apple", "Macbook Pro",
                false, LocalDate.of(2021, 10, 31), 30));
    }
}
