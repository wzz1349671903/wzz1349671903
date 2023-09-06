import java.util.Random;
import java.util.Scanner;
public class guessNumber{
    public static void main(String args[]){
       Random random=new Random();
       int num =random.nextInt(100)+1;
       Scanner sc=new Scanner(System.in);
       while(true){
        System.out.println("请输入猜测的数：");
        int number=sc.nextInt();
        if(number>num){
            System.out.println("猜大了");
        }
        else if(number<num){
            System.out.println("猜小了");
        }
        else{
            System.out.println("猜对了");
            break;
        }
       }
    }
}