
public class Outer {

    private static String greeting = "こんにちは";
    public static class Inner {
        public String hello() {
            return greeting;
        }
    }
}