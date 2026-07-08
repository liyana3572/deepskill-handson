public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application started");
        logger2.log("Fetching data...");

        // Prove they are the SAME instance
        System.out.println("logger1 hashcode: " + logger1.hashCode());
        System.out.println("logger2 hashcode: " + logger2.hashCode());
        System.out.println("Are both references the same instance? " + (logger1 == logger2));
    }
}