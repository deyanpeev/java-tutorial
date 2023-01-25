import java.util.*;

public class Store {
    private List<Computer> availableComputers = Collections.synchronizedList(new ArrayList<>());

    public void addComputer(Computer computer) {
        computer.setId(this.availableComputers.size());
        this.availableComputers.add(computer);
    }

    public String getAvailableComputers() {
        StringBuffer sb = new StringBuffer();
        for (var computer : this.availableComputers) {
            sb.append(computer);
        }

        return sb.toString();
    }

    public void sellComputers(int computerId, int desiredQuantity) {
        synchronized (this.availableComputers) {
            var computerInStock = this.availableComputers.stream()
                    .filter(c -> c.getId() == computerId).findFirst();

            if (computerInStock.isEmpty()) {
                throw new IllegalArgumentException("Computer with id " + computerId + " doesn't exist.");
            }

            Computer computer = computerInStock.get();
            int newQuantity = computer.getQuantity() - desiredQuantity;
            if (newQuantity < 0) {
                throw new IllegalArgumentException("There are only " + computer.getQuantity() + " computers left."
                        + " We cannot sell you " + desiredQuantity);
            }

            if(newQuantity == 0) {
                this.availableComputers.remove(computer);
            } else {
                computer.setQuantity(newQuantity);
            }
        }
    }
}
