package academy.learnprogramming;

public class VipAccount {
private String name;
private double creditLimit;
private String emailAddress;

    public VipAccount(){
        this("Default name", 50000.0, "Default$email.com");
        System.out.println("Empty constructor called");

    }

    public VipAccount(String name, double creditLimit) {
        System.out.println("Constructor with 2 parameters called");
        this.name = name;
        this.creditLimit = creditLimit;
        //this(name, creditLimit, "uknown@email.com");
    }

    public VipAccount(String name, double creditLimit, String emailAddress) {
        System.out.println("Constructor with 3 parameters called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
