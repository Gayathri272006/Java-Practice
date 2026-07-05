

public class SumNdigits {
    public static void main(String[] args){
        int N=12345;
        int sum=0;
        while(N>0){  
            sum=sum+N%10;
            N=N/10;
        }
        System.out.println(sum);

    }
}
