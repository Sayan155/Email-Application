/*
Email application
-->IT support and charged iwth task of creating email accounts for new hires

Generate an email with following syntax: firstname.lastname@department.company.com
Determine the department (sales, developement, accounting), if none leave blank
Generate random string for a password
Have set methods to change the password, set the mailbox capacity, define an alternate email address
have get methods to display the name, email, and mailbox capacity

 */

public class Main {
    public static void main(String[] args) {
        email e = new email("Sayan", "Bhattacharya");
        e.setMailbox_capacity(100);
        e.getAlternate_email();
        System.out.println(e.showInfo()); // show info returns a string value that is why we have to print it
    }
}