public class G {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1||i==1||i==5||i==3&&j>=3||j==5&&i>=3&&i<=4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
