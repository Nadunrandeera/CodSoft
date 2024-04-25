import java.util.Scanner;

public class CurrencyConverter {
    Scanner sc = new Scanner(System.in);
    public double USD(){
        final double usd = 300.02;
        System.out.print("USD | ");
        double user = sc.nextDouble();
        double ans = user*usd;
        System.out.println("LKR."+ans);
        return ans;
    }
    public double Euro(){
        final double euro = 324.01;
        System.out.print("Euro | ");
        double user = sc.nextDouble();
        double ans = user*euro;
        System.out.println("LKR."+ans);
        return ans;
    }
    public double IR(){
        final double ir = 3.60;
        System.out.print("Indian Rupee | ");
        double user = sc.nextDouble();
        double ans = user*ir;
        System.out.println("LKR."+ans);
        return ans;
    }
    public double SD(){
        final double sd = 222.38;
        System.out.print("Singapore Dollar | ");
        double user = sc.nextDouble();
        double ans = user*sd;
        System.out.println("LKR."+ans);
        return ans;
    }
    public double JY(){
        final double jy = 1.98;
        System.out.print("Japanese Yen | ");
        double user = sc.nextDouble();
        double ans = user*jy;
        System.out.println("LKR."+ans);
        return ans;
    }
    public double SR(){
        final double sr = 79.90;
        System.out.print("Saudi Riyal | ");
        double user = sc.nextDouble();
        double ans = user*sr;
        System.out.println("LKR."+ans);
        return ans;
    }
    public double SKW(){
        final double skw = 0.22;
        System.out.print("South Korean Won | ");
        double user = sc.nextDouble();
        double ans = user*skw;
        System.out.println("LKR."+ans);
        return ans;
    }
    public double JD(){
        final double jd = 423.22;
        System.out.print("Jordanian Dinar | ");
        double user = sc.nextDouble();
        double ans = user*jd;
        System.out.println("LKR"+ans);
        return ans;
    }
    public static void main(String[] args) {
        CurrencyConverter cc = new CurrencyConverter();
        int convert;
        boolean repeat = true;
        while (repeat) {
            System.out.println("    CURRENCY CONVERTER");
            System.out.println("----------------------------");
            System.out.println("USD - LKR                (1)");
            System.out.println("Euro - LKR               (2)");
            System.out.println("Indian Rupee - LKR       (3)");
            System.out.println("Singapore Dollar - LKR   (4)");
            System.out.println("Japanese Yen - LKR       (5)");
            System.out.println("Saudi Riyal - LKR        (6)");
            System.out.println("South Korean Won - LKR   (7)");
            System.out.println("Jordanian Dinar - LKR    (8)");
            System.out.println("----------------------------");
            System.out.println("Enter number wht you want to convert: ");
            convert = cc.sc.nextInt();

            switch (convert) {
                case 1:
                    cc.USD();
                    break;
                case 2:
                    cc.Euro();
                    break;
                case 3:
                    cc.IR();
                    break;
                case 4:
                    cc.SD();
                    break;
                case 5:
                    cc.JY();
                    break;
                case 6:
                    cc.SR();
                    break;
                case 7:
                    cc.SKW();
                    break;
                case 8:
                    cc.JD();
                    break;
                default:
                    System.out.println("Invalid Input...!!!");
            }
            System.out.println("Do you want to run this program again(y/n)");
            String re = cc.sc.next();
            repeat = re.equals("y");
        }
    }
}
