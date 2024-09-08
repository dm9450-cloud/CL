package Sep_08;

public class Code_4 {
    public static void main(String[] args) {

        
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }



        for(int i=1; i<=10; i++){   //Duplicate local variable i
            System.out.println(i);
        }



    }
}
