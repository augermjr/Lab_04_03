public class Main {
    public static void main(String[] args) {
        double initBal = 5000;
        double interestRate = 0.17;
        double oneInterest = initBal * (1 + interestRate);
        double twoInterest = oneInterest * (1 + interestRate);
        System.out.println("Initial balance: $" + initBal + " Interest rate: " + interestRate + "\nIf no payments are made $" + oneInterest + " will be due after one month, and $" + twoInterest + " will be due after two months.");
    }
}