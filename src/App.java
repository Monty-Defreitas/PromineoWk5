public class App {
    public static void main(String[] args) {
        Logger one = new AsteriskLogger();
        one.Error("Hello");

        one.Log("Hello");

        Logger two = new SpacedLogger();
        two.Log("Hello");

        two.Error("Hello");
    }
}

