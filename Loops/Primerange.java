
public class Primerange {
    public static void main(String[] args){
        int n=100;
        int primecount=0;
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                primecount++;
               
            }
        }
        System.out.println("Total primes "+primecount);
    }
}
