public class OddEvencount {
    public static void main(String[] args){
        int n=53467;
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++){
            int d=n%10;
            if(d%2==0){
                even++;
            }else{
                odd++;
            }
            n=n/10;
        }
        System.out.println("Odd= "+odd);
        System.out.println("Even= "+even);
    }
}
