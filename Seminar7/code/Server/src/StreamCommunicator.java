import java.io.PrintStream;
import java.lang.invoke.StringConcatException;
import java.util.*;

public class StreamCommunicator {
    private Scanner in;
    private PrintStream out;
    private List<String> messages;

    public StreamCommunicator(Scanner in, PrintStream out) {
      this.in = in;
      this.out = out;
      this.messages = new ArrayList<>();
    }

    public void addMessage(String message) {
        this.messages.add(message);
    }

    public String communicateMessage() {
        var result = this.communicateMessage(this.messages.toArray(String[]::new));
        this.messages.clear();
        return result;
    }

    public String communicateMessage(String ...messsages) {
        String messageToSend = Arrays.stream(messsages).reduce("",
                (String total, String current) -> total + current);
        out.println(messageToSend);
        return in.nextLine();
    }
}
