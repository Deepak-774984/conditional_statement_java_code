import java.util.Scanner;

public class divisible_number {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    double num=0;
    if(sc.hasNextDouble()){
    num=sc.nextDouble();
    }else{
        System.out.println("Invalid number ");
        return;
    }
    if(num%5==0){
        System.out.println(num+ " is divisible by 5");
    }else{
        System.out.println(num+ " is not divisible by 5");
    }
    }
}
