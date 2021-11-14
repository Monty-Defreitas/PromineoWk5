public class AsteriskLogger implements Logger{

    @Override
    public void Log(String string) {
        System.out.println("***" + string + "***");
    }

    @Override
    public void Error(String string) {
        String low = "***";
        String asterisk = "*****************";
        System.out.println(asterisk);
        System.out.println(low + "Error:" + string + low);
        System.out.println(asterisk);
    }
}
