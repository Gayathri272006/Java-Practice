public class HETHU {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            //H
            for(int j=1;j<=5;j++){
              if(j==1||j==5||i==3){
                System.out.print("*");
              }else{
                System.out.print(" ");
              }
            }
            System.out.print("  ");
            //E
             for(int j=1;j<=5;j++){
              if(j==1||i==1||i==3||i==5){
                System.out.print("*");
              }else{
                System.out.print(" ");
              }
            }
            System.out.print("  ");

            //T
            for(int j=1;j<=5;j++){
              if(j==3||i==1){
                System.out.print("* ");
              }else{
                System.out.print("  ");
              }
            }
            System.out.print("  ");
            //H
            for(int j=1;j<=5;j++){
              if(j==1||j==5||i==3){
                System.out.print("*");
              }else{
                System.out.print(" ");
              }
            }
            System.out.print("  ");
            //U
            for(int j=1;j<=5;j++){
              if(j==1||j==5||i==5){
                System.out.print("* ");
              }else{
                System.out.print("  ");
              }
            }
            System.out.print("  ");
            System.out.println();
        }
    }
}
