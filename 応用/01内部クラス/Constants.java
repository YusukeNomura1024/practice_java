public class Constants {
    public static class Cat{
        public static final String NAME = "猫";
        public static final int LEG_COUNT = 4;
    }
    public static class Octopus {
        public static final String NAME = "タコ";
        public static final int LEG_COUNT = 8;
    }
    public static class Human {
        public class HumanLeg {
            public final String ACTION = "蹴る";
            public String kick() {
                return ACTION;
            }
        }
    }
    
}