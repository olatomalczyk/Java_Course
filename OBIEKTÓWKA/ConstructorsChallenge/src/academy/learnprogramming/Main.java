package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account myAccount = new Account();//(12345,0,"Ola Tomaclczyk", "ola@wp.pl", 600700100);

        //zastąpiliśmy to konstruktorem
       /* myAccount.setAccountNumber(12345);
        myAccount.setBalance(1000);
        myAccount.setCustomerName("Ola");
        myAccount.setCustomerEmail("ola@wp.pl");
        myAccount.setPhoneNumber(100200300);
*/
       /* System.out.println(myAccount.getAccountNumber());
        System.out.println(myAccount.getBalance());
        myAccount.withdrawFunds(100.0);

        myAccount.depositFunds(50.0);
        myAccount.withdrawFunds(100.0);

        myAccount.depositFunds(51.0);
        myAccount.withdrawFunds(100.0);

        Account timsAccount = new Account("Tim", "tim@gimal.com", 12345);
        System.out.println(timsAccount.getAccountNumber()+ " name " + timsAccount.getCustomerName());*/

        VipAccount JesicaAccount = new VipAccount();
        System.out.println(JesicaAccount.getName());
        System.out.println(JesicaAccount.getCreditLimit());
        System.out.println(JesicaAccount.getEmailAddress());

        VipAccount BrayanAccount = new VipAccount("Brayan", 25000.00);
        System.out.println(BrayanAccount.getName());

        VipAccount TimAccount = new VipAccount("Tim", 100.00, "tim@mail.com");
        System.out.println(TimAccount.getName());
        System.out.println(TimAccount.getCreditLimit());

        VipAccount GlobusAccount = new VipAccount("Globus", 1000000.00, "globus@mail.com");
        System.out.println(GlobusAccount.getName());
        System.out.println(GlobusAccount.getCreditLimit());


    }
}
