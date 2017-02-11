import java.util.Scanner;
public class ZoomOut{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    if(1<length && length<100){
        
    }
    else{
        length=sc.nextInt();
    }
    for(int p= 1; p<=length; p++){
      for(int line =1; line<=length; line++){
        if(p==1 || p==length){
          System.out.print("*");
        }
        else{
          if(line>1 && line<length){
            System.out.print("  ");
          }
          else{
            System.out.print("*");
          }
        }
      }
      System.out.println();
    }
  }
}


