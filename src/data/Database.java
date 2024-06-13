package data;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public final class Database {
    private static Map<String, String> users = new HashMap<>();
    private static final String FILE_PATH = "users.txt";

    static {
        loadUsers();
    }

    private Database() {}

    public static boolean usernameExists(String username) {
        return users.containsKey(username);
    }

    public static void addUser(String username, String password) {
        users.put(username, password);
        saveUsers();
    }

    public static boolean validateUser(String username, String password) {
        return users.getOrDefault(username, "").equals(password);
    }

    private static void loadUsers() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":", 2);
                if (parts.length == 2) {
                    users.put(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveUsers() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Map.Entry<String, String> entry : users.entrySet()) {
                writer.write(entry.getKey() + ":" + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
