import java.lang.reflect.Method;

@interface Test {
}

public class Testy {
    @Test
    public static void test() {
        return;
    }

    @Test
    public static void test2() {
        new RuntimeException();
    }

    public static void main(String[] args) throws Exception {
        for (Method m : Testy.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Test.class)) {
                try {
                    m.invoke(null);
                    System.out.print("Pass");
                } catch (Throwable ex) {
                    System.out.print("Fail");
                }
            }
        }
    }
}