import java.util.*;
public class largest_three_numbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int a= sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int b= sc.nextInt();
        System.out.print("Enter the 3rd number: ");
        int c= sc.nextInt();
        int largest;
        if(a>=b && a>=c ){
            largest=a;
        }else if (b>=a && b>=c){
            largest=b;
        }else{
            largest=c;
        }
        System.out.println("The largest number is: " + largest);
    }
}
