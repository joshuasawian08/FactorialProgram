import java.util.Scanner;
class Factorial{
    public int fact(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        return num * fact(num - 1);
    }
}

public class Main{
    public static void main(String[] args){
        Factorial f = new Factorial();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scanner.nextInt();
        int result = f.fact(num);
        System.out.print(result);
        scanner.close();
    }
}