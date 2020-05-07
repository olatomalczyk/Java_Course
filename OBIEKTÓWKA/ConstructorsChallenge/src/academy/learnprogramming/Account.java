package academy.learnprogramming;

public class Account {
    private double accountNumber;
    private double balance; //saldo
    private String customerName;
    private String customerEmail;
    private int phoneNumber;

    public Account(){ // jesli nie dasz mi innych danych to defaultowo wyswietle to
        this(56789, 2.50,"Default name", "Default addres", 0000000);
        System.out.println("Empty constructor called");
    }

    public Account(double accountNumber, double balance, String customerName, String customerEmail,int phoneNumber){
        System.out.println("AAccount constructor with parameters called");

        this.accountNumber =  accountNumber;
     this.balance = balance;
     this.customerName = customerName;
     this.customerEmail = customerEmail;
     this.phoneNumber = phoneNumber;
     /*//zaleznie od sytuacji używamy bezposredniego przypisania bo czasem setters sie
     //nie wykonują, a czasem w setters mamy validacje i lepiej tego uzyc
     setPhoneNumber(phoneNumber);
     setCustomerEmail(customerEmail);
     setCustomerName(customerName);
     setBalance(balance);
     setAccountNumber(accountNumber);
      */
    }

    public Account(String customerName, String customerEmail, int phoneNumber) {
        this(99999, 100.55, customerName, customerEmail, phoneNumber);
    }

    //aby umożliwić klientowi wpłacenie środków
    public void depositFunds(double funds){
        this.balance= this.balance+funds;
        System.out.println("Deposit of " + funds + " made.New balance is " + this.balance);


    }

    //aby umożliwić klientowi wypłacenie środków
    public void withdrawFunds(double funds){
        if(this.balance<funds){
            System.out.println("Only" + balance + " available. Withdrawal not processed");
        }else {
            this.balance = this.balance - funds;
            System.out.println("Withdrawal of " + funds + " processed. New balance is " + this.balance);
        }
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }


}
