package _23_Singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // 두 객체가 같은 객체냐?
        System.out.println("같습니까? " + (logger1 == logger2));
    }
}
