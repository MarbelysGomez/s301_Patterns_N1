package s301.N1;

public class Main {
    public static void main(String[] args) {
        Undo undo = Undo.getInstance();

        undo.addCommand("cd command");
        undo.addCommand("ls command");
        undo.addCommand("mkdir command");
        undo.addCommand("rm command");
        undo.addCommand("mv command");

        undo.listCommands();

        undo.removeLastCommand();

        undo.listCommands();
    }
}
