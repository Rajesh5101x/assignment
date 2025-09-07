import java.lang.*;
import java.util.*;

public class Account {
    long accountNumber;
    float balance;
    
    Account(long a, float b){
        if(a <= 0){
            System.out.println("Enter valid account number.");
            return;
        }

        if(b < 0){
            System.out.println("Balance cannot be negative.");
            return;
        }

        accountNumber = a;
        balance = b;
        display();
    }

    public void display(){
        System.out.println("Account Number:- " + accountNumber);
        System.out.println("Balance:- " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number:- ");
        long a = sc.nextLong();
        System.out.print("Enter balance:- ");
        float b = sc.nextFloat();
        System.out.println("\nAccount details:- ");
        Account acc = new Account(a, b);

        sc.close();
    }
}
