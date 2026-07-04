
public class Alldigitscount {
    public static void main(String[] args){
        int n=1224466;
        for(int i=0;i<=9;i++){
            int temp=n;
            int count=0;
            while(temp>0){
                int digit=temp%10;
                if(digit==i){
                    count++;
                }
                temp=temp/10;

            }   
        System.out.println(i+" occurs "+count+" times ");
        }

    }
}
