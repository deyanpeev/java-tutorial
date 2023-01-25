import java.io.PrintStream;
import java.util.Scanner;

public class ServerHandler {
    private StreamCommunicator communicator;
    private Store store;

    public ServerHandler(StreamCommunicator communicator, Store store) {
        this.communicator = communicator;
        this.store = store;
    }

    public void startCommunication() {
        int choice = Integer.parseInt(communicator.communicateMessage("Write 1 for administrator and 2 for client"));
        switch(choice) {
            case 1:
                this.communicateAdmin();
                break;
            case 2:
                this.communicateCustomer();
                break;
            default:
                communicator.communicateMessage("Not an option");
        }
    }

    private void communicateAdmin() {
        communicator.addMessage("Entering a new computer details.");
        Computer computer = ComputerBuilder.build(communicator);
        this.store.addComputer(computer);
    }

    private void communicateCustomer() {
        communicator.communicateMessage("Buying a computer.",
                this.store.getAvailableComputers(),
                "Which computer would you like to buy");
        int computerId = Integer.parseInt(communicator.communicateMessage());
        int quantity = Integer.parseInt(communicator.communicateMessage("How many?"));
        try {
            store.sellComputers(computerId, quantity);
        } catch (Exception ex) {
            communicator.communicateMessage(ex.getMessage());
        }
    }
}
