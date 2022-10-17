public class Main {

    public static void main(String[] args) {
        CheckingAccount check = new CheckingAccount();
        check.setAccNumber("halo");
        String accNumber = check.getAccNumber();
        System.out.println(accNumber);
        SavingsAccount save = new SavingsAccount();
        CertificateOfDeposit deposit = new CertificateOfDeposit();
    }
}
