public class Recurtion_03 {
    static int pow(int p, int q) {
        if (q == 0)
            return 1;
        int sum = pow(p, q / 2);
        if (q % 2 == 0)
            return sum * sum;
        else
            return p * sum * sum;
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 3));
    }
}
