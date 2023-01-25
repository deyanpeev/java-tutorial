import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientResolver implements Runnable  {
    private Socket clientSocket;
    private Store store;

    public ClientResolver(Socket socket, Store store)
    {
        this.clientSocket = socket;
        this.store = store;
    }

    public void run()
    {
        Scanner in = null;
        PrintStream out = null;
        try {
            in = new Scanner(clientSocket.getInputStream());
            out = new PrintStream(clientSocket.getOutputStream());
            StreamCommunicator communicator = new StreamCommunicator(in, out);

            var server = new ServerHandler(communicator, this.store);
            server.startCommunication();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Connection closed.");
        } finally {
            in.close();
            out.close();
        }
    }
}
