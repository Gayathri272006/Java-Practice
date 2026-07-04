
public class Counteven {
    public static void main(String[] ars){
        int n=12345;
        int count=0;
        for(int i=0;i<5;i++){
            int d=n%10;
            if(d%2==0){
                 
            count++;
            }
            n=n/10;

        }
        System.out.println("count: " + count);
    }
}
