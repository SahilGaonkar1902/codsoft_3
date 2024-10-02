import java.util.Scanner;

public class userAccount
{
    static int accBalance = 0;
    public void checkBalance()
    {
        System.out.println("Available Balance:" + accBalance);
    }

    public static void main(String[]args)
    {
        userAccount ua = new userAccount();
        atmMachine am = new atmMachine();
        System.out.println("------ATM------\n1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit");
        while(true)
        {
            System.out.println("-----------\nSelect Options:");
            Scanner scanner = new Scanner(System.in);
            int select = scanner.nextInt();
            switch (select)
            {
                case 1:            
                    am.deposit();
                    break;
                case 2:
                    am.withdraw();
                    break;
                case 3:
                    ua.checkBalance();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}

class atmMachine
{
    userAccount ua = new userAccount();
    public void withdraw()
    {
        System.out.println("Withdraw Amount:");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        System.out.println("Amount Withdrawn:" + amount);
        if(amount > userAccount.accBalance)
        {
            System.out.println("Insufficient Balance!");
        }
        else
        {
            userAccount.accBalance -= amount;
            System.out.println("Available Balance:" + userAccount.accBalance);
        }
        
    }

    public void deposit()
    {
        System.out.println("Deposit Amount:");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        System.out.println("Amount Deposited:" + amount);
        userAccount.accBalance += amount;
    }   
}