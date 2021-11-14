public class SpacedLogger implements Logger{
    @Override
    public void Log(String input) {
    String space = " ";
    for (int i = 0; i < input.length(); i++) {
        char chars = input.charAt(i);
        System.out.print(chars + space);
    }
        System.out.println("\n");
    }

    @Override
    public void Error(String input) {
        String space = " ";
        System.out.print("ERROR:");
        for (int i = 0; i < input.length(); i++){
            char chars = input.charAt(i);
            System.out.print(chars + space);
        }
    }
}
