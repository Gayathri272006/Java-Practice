
public class Uniquedigitcount {
    public static void main(String[] args){
        int n=12345;
        int temp=n;
        int unique=0;

        while(temp>0){
            int rem=temp%10;
            int count=0;
            int t=n;
            while(t>0){
                if(t%10==rem){
                    count++;
                }
                t=t/10;
            }
            if(count==1){
                unique++;
            }
            temp=temp/10;
        }
        System.out.println("Unique count= "+ unique);

    }
}
