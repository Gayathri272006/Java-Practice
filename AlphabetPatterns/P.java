public class P {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=5;j++){
              if(j==1||i==1||i==3||i==2&&j==5){
                System.out.print("* ");
              }else{
                System.out.print("  ");
              }
            }
            System.out.println();
        }
    }
}
