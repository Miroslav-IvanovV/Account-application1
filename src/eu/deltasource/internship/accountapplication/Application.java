package eu.deltasource.internship.accountapplication;

public class Application {

    public static void main(String[] args) {

        Account account1 = new Account("AL35202111090000000001234567", AccountType.CREDIT, "Ivan Ivanov",
                3500, 1500, 3.5);

        System.out.println(account1.toString());
        System.out.println(account1.oweMoney());
        System.out.println(account1.getCardOwner());
        account1.repayLoan(300);
        account1.withdrawMoney(4000);

    }
}
