import java.util.Scanner;
public class changeproblem {
    public static void main(String[] args) {
        int n ;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount :");
        int amount = sc.nextInt();

        System.out.print("Enter the highest currency :");
        int high =sc.nextInt();

        switch (high) {
            case 2000:
                n=amount/2000;
                System.out.println("number of 2000 notes "+n);
                amount = amount %2000 ;
            case 500:
                n=amount /500 ;
                System.out.println("number of 500 notes "+n);
                amount = amount%500;
            
            case 200:
                n=amount/200;
                System.out.println("number of 200 notes "+n);
                amount = amount%200;
            case 100:
                n=amount/100;
                System.out.println("number of 100 notes"+n);
                amount = amount%100;
            case 50:
                n=amount/50;
                System.out.println("number of 50 notes "+n);
                amount = amount %50;
            case 20:
                n=amount/20;
                System.out.println("number of 20 notes "+n);
                amount =amount%20;
            case 10 :
                n=amount/10;
                System.out.println("number of 10 notes "+n);
                amount= amount%10;
            case 5:
                n=amount/5;
                System.out.println("number of 5 coins "+n);
                amount=amount%5;
            case 2:
                n=amount/2;
                System.out.println("number of 2 coins "+n);
                amount=amount%2;
            case 1:
                n=amount/1;
                System.out.println("number of 1 coins "+n);
                amount=amount%1;
            default:
                break;
        }

    }


}
