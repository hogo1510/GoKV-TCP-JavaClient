import client.KeyValueClient;

import java.io.IOException;

public class Usage {
    public static void main(String[] args) {
        KeyValueClient client = new KeyValueClient();

        try {
            client.set("Naam", "test naam");
            client.get("Naam");
            client.delete("Naam");
            client.get("Naam");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
