package eu.deltasource.internship;

public class Account {

    private String iban;
    private Type typeOfTheCard;
    private String owner;
    private double limit;
    private double currentState;
    private double interestRate;

    public Account(String iban, Type type, String owner, double limit, double currentState, double interestRate) {
        this.iban = iban;
        this.typeOfTheCard = type;
        this.owner = owner;
        this.limit = limit;
        this.currentState = currentState;
        this.interestRate = interestRate;

    }

    /**
     * @return The characteristics of the account.
     */
    public String accountCharacteristics() {
        return "the iban is : " + iban + "\n" + "the type of the account is : " + typeOfTheCard + "\n"
                + "the owner of the account is : " + owner + "\n" + "the limit of the account is : " + limit + "\n"
                + "the current state of the account is : " + currentState + "\n" + "the interst rate is : "
                + interestRate + "\n";
    }

    /**
     * @return The money that you owe to the bank.
     */
    public double howMuchMoneyYouOwe(){
        return currentState;
    }

    /**
     * @return The owner of the card.
     */
    public String cardOwner(){
        return owner;
    }

    /**
     * @param payment is the money you put towards loan repayment.
     */
    public void loanRepayment(double payment){
        currentState -= payment;
        System.out.println("Your current balance is : " + currentState);
    }

    /**
     * @param withdraw is the money you want to withdraw form your credit card.
     */
    public void withdrawMoney(double withdraw){
        if(currentState + withdraw < limit) {
            currentState += withdraw;
            System.out.println("Your current balance is : " + currentState);
        } else {
            System.out.println("could not make the transaction youre going over your limit");
        }
    }

    public enum Type {
        CREDIT, DEBIT
    }

}

