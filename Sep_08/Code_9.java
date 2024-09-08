package Sep_08;

public class Code_9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long sum =0;
        long i=1; 
        while(i<=n){
            sum +=i;
            i+= 1;

        }

        System.out.println(sum);
    }
}
