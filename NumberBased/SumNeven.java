
public class SumNeven {
    public static void main(String[] args){
        int N=123456;
        int sum=0;
        while(N>0){
            if(N%2==0){
                sum=sum+N%10;  
            }
            N=N/10;
        }
        System.out.println(sum);
    }
}
