//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Logger s1 = Logger.getInstance();
        s1.setName("Logger A");
        s1.showStatus();

        // Reset the singleton
        Logger.resetInstance();

        Logger s2 = Logger.getInstance();
        s2.setName("Logger B");
        s2.showStatus();

        // Check if new instance is different
        System.out.println("s1 == s2: " + (s1 == s2)); // false (after reset)
    }
}