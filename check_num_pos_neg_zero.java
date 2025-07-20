// import java.util.Scanner;

// public class check_num_pos_neg_zero {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         if (sc.hasNextDouble()) {
//         double num=sc.nextDouble();
//         if(num>0){
//             System.out.println(num+ " is a positive number");
//         }
//         else if(num<0){
//             System.out.println(num+ " is a negative number");
//         }
//         else if(num==0){
//             System.out.println(num+ " is a zero number");
//         }
//         else{
//             System.out.println(num+ " is not a valid number");
//         }
//     }
// }
// }



import java.util.Scanner;

public class check_num_pos_neg_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        //used this for if a user enter char or other value then it showing error and not run the code only number accept
        if (sc.hasNextDouble()) {
            double num = sc.nextDouble();
            if (num > 0) {
                System.out.println(num + " is a positive number");
            } else if (num < 0) {
                System.out.println(num + " is a negative number");
            } else {
                System.out.println(num + " is zero");
            }
        } else {
            System.out.println("Invalid input! Please enter a number.");
        }
    }
}
