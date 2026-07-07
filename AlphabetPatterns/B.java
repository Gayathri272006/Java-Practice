public class B {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=7;j++){
              if(j==1||i==1||i==3||i==5||(j==7 && i>1 && i<7)){
                System.out.print("*");
              }else{
                System.out.print(" ");
              }
            }
            System.out.println();
        }
    }
}
