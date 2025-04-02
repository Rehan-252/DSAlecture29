class Recurtion_01{

    static int sum(int n){
        if(n >= 0 && n <= 9) return n;
        return sum(n/10) + n%10;
    }
    public static void main(String[] agrs){
        
        int n = 1234;

        System.out.println(sum(n));
    }
}