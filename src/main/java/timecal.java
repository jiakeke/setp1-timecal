public class timecal {
    public static void main(String[] args) {
        System.out.println("Time needs " +  timeCalulator(100, 10) + " hours");
    }

    public static double timeCalulator(double x, double v) {
        return x / v;
    }
}
