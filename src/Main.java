public class Main {
    public static void main(String[] args) {

        System.out.println(contains(5,5,7,8,10));
    }

    static boolean contains(int a, int... varargs) {
        boolean b = true;
        for (int i : varargs) {
            if (a == i) {
                return true;
            }
        }return false;
    }

    }