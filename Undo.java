package s301.N1;

import java.util.ArrayList;
import java.util.List;

public class Undo {
    private static Undo instance;
    private List<String> commandHistory;
    private Undo() {
        commandHistory = new ArrayList<>();
    }
    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }
    public void addCommand(String command) {
        commandHistory.add(command);
    }
    public void removeLastCommand() {
        if (!commandHistory.isEmpty()) {
            commandHistory.remove(commandHistory.size() - 1);
        } else {
            System.out.println("No commands to undo");
        }
    }
    public void listCommands() {
        System.out.println("Command history: ");
        for (int i = 0; i < commandHistory.size(); i++) {
            System.out.println((i + 1) + ": " + commandHistory.get(i));
        }
    }
}
