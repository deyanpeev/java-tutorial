import java.time.LocalDate;

public class Computer {
    private int id;
    private String brand;
    private String model;
    private boolean isUsed;
    private LocalDate manufacturedDate;
    private int quantity;

    public Computer() { }

    public Computer(String brand, String model, boolean isUsed, LocalDate manufacturedDate, int quantity) {
        this.setBrand(brand);
        this.setModel(model);
        this.setUsed(isUsed);
        this.setManufacturedDate(manufacturedDate);
        this.setQuantity(quantity);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public boolean isUsed() {
        return isUsed;
    }
    public void setUsed(boolean used) {
        isUsed = used;
    }

    public LocalDate getManufacturedDate() {
        return manufacturedDate;
    }
    public void setManufacturedDate(LocalDate manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computer: #").append(this.getId()).append("\t")
                .append(this.getBrand()).append(" ").append(this.getModel()).append("\t")
                .append("Year of manufacturing: ").append(this.getManufacturedDate().toString()).append("\t")
                .append("Quantity: ").append(this.getQuantity()).append("\t");
        if(this.isUsed()) {
            sb.append("Computer is used").append("\t");
        }

        return sb.toString();
    }
}
