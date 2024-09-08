package Sep_08;

public class Code_8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        long sum =0;
        for(long i=1; i<=N; i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
