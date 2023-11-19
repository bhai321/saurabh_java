class Main {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class TestOverloading1 {
    public static void main(String[] args) {
        System.out.println(Main.add(11, 11));
        System.out.println(Main.add(11, 11, 11));
    }
}
