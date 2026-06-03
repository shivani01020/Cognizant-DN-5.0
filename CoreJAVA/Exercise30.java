class Exercise30{
    public static void identifyType(Object obj) {

        String result = switch (obj) {
            case Integer i -> "Integer value: " + i;
            case String s -> "String value: " + s;
            case Double d -> "Double value: " + d;
            case Float f -> "Float value: " + f;
            case Boolean b -> "Boolean value: " + b;
            case null -> "Object is null";
            default -> "Unknown type: " + obj.getClass().getSimpleName();
        };

        System.out.println(result);
    }

      public static void main(String[] args) {
        identifyType(100);
        identifyType("Hello Java 21");
        identifyType(99.99);
        identifyType(12.5f);
        identifyType(true);
        identifyType(null);
        identifyType(new StringBuilder("Test"));
    }
}