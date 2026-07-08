public class Logger {

    // The single instance, created eagerly (thread-safe by default)
    private static final Logger instance = new Logger();

    // Private constructor prevents external instantiation
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Public global access point
    public static Logger getInstance() {
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}