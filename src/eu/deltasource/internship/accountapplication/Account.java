package eu.deltasource.internship.accountapplication;

public class Account {

    private String iban;
    private AccountType cardType;
    private String owner;
    private double limit;
    private double currentState;
    private double interestRate;

    public Account(String iban, AccountType type, String owner, double limit, double currentState, double interestRate) {
        this.iban = iban;
        this.cardType = type;
        this.owner = owner;
        this.limit = limit;
        this.currentState = currentState;
        this.interestRate = interestRate;

    }

    /**
     * @return The characteristics of the account.
     */
    @Override
    public String toString() {
        return "the iban is : " + iban + "\n" + "the type of the account is : " + cardType + "\n"
                + "the owner of the account is : " + owner + "\n" + "the limit of the account is : " + limit + "\n"
                + "the current state of the account is : " + currentState + "\n" + "the interst rate is : "
                + interestRate + "\n";
    }

    /**
     * @return The money that you owe to the bank.
     */
    public double oweMoney() {
        return limit - currentState;
    }

    /**
     * @return The owner of the card.
     */
    public String getCardOwner() {
        return owner;
    }

    /**
     * @param payment is the money you put towards loan repayment.
     */
    public void repayLoan(double payment) {
        currentState += payment;
        System.out.println("Your current balance is : " + currentState);
    }

    /**
     * @param withdraw is the money you want to withdraw form your credit card.
     */
    public void withdrawMoney(double withdraw) {
        if (withdraw < currentState) {
            currentState -= withdraw;
            System.out.println("Your current balance is : " + currentState);
        } else {
            System.out.println("could not make the transaction you're going over your limit");
        }
    }
}

