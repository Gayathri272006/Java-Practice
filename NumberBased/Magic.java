public class Magic {
    public static void main(String[] args){
        int n=1234;
        int sum1=0;
        while(n>0){
            sum1=sum1+n%10;
            n=n/10;
        }
            int sum2=0;
            while(sum1>0){
                sum2=sum2+sum1%10;
                sum1=sum1/10;
            }
            if(sum2==1){
            System.out.println("Magic Number");
        }else{
            System.out.println("Not Magic num");
        }

        }
        
    }

