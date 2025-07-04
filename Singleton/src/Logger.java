public class Logger {
    private static Logger instance;
    private String name;
    private Logger() {
        System.out.println("Logger Initialized");
        this.name = "Logger";
    }
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public static void resetInstance(){
        System.out.println("Singleton instance reset.");
        instance = null;
    }
    public void log(String message) {
        System.out.println("[ "+message+" ]");
    }
    // Just for demonstration: setting a name
    public void setName(String name) {
        this.name = name;
    }

    public void showStatus() {
        System.out.println("Singleton instance name: " + name);
    }
    public static void main(String[] args) {
        Logger newLogger = Logger.getInstance();
        Logger newInstance = new Logger();
        newLogger.log("Hello World");
        newInstance.log("Hello World instance");
    }
}
