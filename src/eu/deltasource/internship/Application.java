package eu.deltasource.internship;

public class Application {

    public static void main(String[] args) {

        Account account1 = new Account("AL35202111090000000001234567", Account.Type.CREDIT, "Ivan Ivanov",
                3500,1500, 3.5);

        /**
         * Checking if the methods are working correctly.
         */
        System.out.println(account1.accountCharacteristics());

        System.out.println(account1.howMuchMoneyYouOwe());

        System.out.println(account1.cardOwner());

        account1.loanRepayment(300);

        account1.withdrawMoney(4000);

    }
}
