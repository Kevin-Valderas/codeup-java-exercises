public class MethodWarmup {
    public static double getDifference(int x, int y) {
        if (y > x) {
            return y - x;
        }
        return x;
    }

    public static void main (String[] args) {
        System.out.println(getDifference(15, 4));
    }
}
