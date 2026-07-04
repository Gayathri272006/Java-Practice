
public class Countevenodd {
     public static void main(String[] ars){
        int n=12345;
        int even=0;
        int odd=0;
        for(int i=0;i<5;i++){
            int d=n%10;
            if(d%2==0){
                 even++;
            }else{
                odd++;
            }
            n=n/10;

        }
        System.out.println("even count: " + even);
        System.out.println("odd count: " + odd);
    }
}
