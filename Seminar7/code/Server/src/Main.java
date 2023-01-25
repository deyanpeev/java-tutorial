import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Main {
    private static final int SOCKET_PORT = 5038; //Any random free port

    public static void main(String[] args) {
        ServerSocket server = null;
        Store store = StoreSeeder.getSeededStore();

        try {
            server = new ServerSocket(SOCKET_PORT);

            while (true) {
                Socket client = server.accept();
                System.out.println("Connection established: " + client.getInetAddress().getHostAddress());

                ClientResolver resolver = new ClientResolver(client, store);
                new Thread(resolver).start();
            }
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}