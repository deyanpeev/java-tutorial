import java.time.LocalDate;

public class ComputerBuilder {
    public static Computer build(StreamCommunicator communicator) {
        Computer computer = new Computer();
        computer.setBrand(communicator.communicateMessage("Enter brand:"));
        computer.setModel(communicator.communicateMessage("Enter model:"));
        computer.setManufacturedDate(LocalDate.parse(
                communicator.communicateMessage("Enter date (in format: yyyy-mm-dd):")));
        computer.setUsed(Boolean.parseBoolean(communicator.communicateMessage("Is used:")));
        computer.setQuantity(Integer.parseInt(communicator.communicateMessage("Quantity:")));
        return computer;
    }
}
