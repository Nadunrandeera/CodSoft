import java.util.Scanner;

class ATM{
    Scanner sc = new Scanner(System.in);
    private double withdraw;
    private double deposit;
    private double checkingBalance;

    public double getCheckingBalance() {
        return checkingBalance;
    }
    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }
    public void menu(){
        System.out.println("____________________");
        System.out.println("Checking Balance - 1");
        System.out.println("Withdrawing      - 2");
        System.out.println("Depositing       - 3");
    }
    public  double Withdraw(){
        System.out.println("Enter withdraw amount: ");
        withdraw = sc.nextDouble();
        if (checkingBalance<=500){
            System.out.println("No Sufficient balance for withdraw");
        }
        else {
            System.out.println("Successfully Withdrawing :" + withdraw);
            System.out.println("New Balance: "+(getCheckingBalance()-withdraw));
        }
        return 0;
    }
    public  double Deposit(){
        System.out.println("Enter amount that you want to deposit: ");
        deposit = sc.nextDouble();
        System.out.println("Balance: "+(deposit+getCheckingBalance()));
        return 0;
    }


}
class Account extends ATM{
    private String accountHolderName= " ";
    private int accountNumber;
    private String NIC;

    public Account(String accountHolderName, int accountNumber, String NIC) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.NIC = NIC;
    }
    public void printDetails(){
        System.out.println("AccountHolderName: "+accountHolderName);
        System.out.println("AccountNumber: "+accountNumber);
        System.out.println("NIC: "+ NIC);
    }
}
public class ATMInterface{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();
        Account account = new Account("Nadun",80052364,"200029302771");


        boolean repeat = true;
        while (repeat){
            System.out.println("________WELCOME________");
            account.printDetails();
            atm.menu();
            int check;
            System.out.println("Enter your choice: ");
            check = scanner.nextInt();
            atm.setCheckingBalance(10000);
                switch (check){
                    case 1:
                        System.out.println("Balance:"+atm.getCheckingBalance());
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Withdraw: ");
                        atm.Withdraw();
                        break;
                    case 3:
                        System.out.println("Deposit: ");
                        atm.Deposit();
                        break;
                    default:
                        System.out.println("Invalid input..!!!_");
                }
                System.out.println("Do you have any transaction(y/n)");
                String re = scanner.next();
                repeat = re.equals("y");
        }

    }
}