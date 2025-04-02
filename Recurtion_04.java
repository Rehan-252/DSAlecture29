public class Recurtion_04 {

    static int total(int n){
        if(n >= 0 && n <= 9)
            return 1;
        int count = total(n/10);
        count ++;
        return count;
        
    }
    public static void main(String[] args) {
        System.out.println(total(29985));
    }
}
