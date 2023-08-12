import java.util.Scanner;

public class email {
    private String firstname;
    private String lastname;
    private String password; int default_pass_length = 10; // this if for the random password length
    private String change_password;
    private String department;
    private String email;
    private String alternate_email = "snbhattacharya191@gmail.com";
    private int mailbox_capacity = 500;
    private String company_suffix = "xyz.com";

//  constructor to receive first and last name
//    ask for department
//    generate random password


    public email(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;

        System.out.println("Email created: "+firstname+" "+lastname);

//        Call a method to ask for the department - return department
        this.department = setDepartment();
        System.out.println("Department is " +this.department);

//        Call a method to return the random password
        this.password = random_password(default_pass_length);
        System.out.println("Your password is: "+this.password);

//        Combine elements to generate email:
        email = firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+company_suffix;
        System.out.println("Your email is: "+this.email);
    }

    private String setDepartment() {
        System.out.println("Enter the department: \n 1 for Sales\n 2 for Developement\n 3 for Accounting\n 0 for None");
        Scanner sc = new Scanner(System.in);
        int dept_choice = sc.nextInt();
        if(dept_choice==1){
            return "Sales";
        } else if (dept_choice==2) {
            return "Developement";
        }
        else if(dept_choice==3){
            return "Accounting";
        }
        else if(dept_choice==0){
            return "None";
        }
        return " ";
    }


//    Generating a random password
    private String random_password(int length){
        String passwordset = "ABCDEFGHIJKLEMNOPQRSTWVXYZ@!#$";
        char [] password = new char[length];
        for(int i = 0; i<length; i++){
        int rand =(int) (Math.random() * passwordset.length()); // 0 and 1 multiplied by the number of characters in the passwordset and store it in the arrya char[] password
        password[i] = passwordset.charAt(rand); // this is passing the random character at the char password array one at a time
        }
        return new String (password);  // password is a set of random characters and that is why we have to modify it into a new String
    }
    //    set mailbox capacity
    public void setMailbox_capacity(int capacity){
        this.mailbox_capacity = capacity;
    }
//    set alternate email
    public void setAlternate_email(String altemail){
        this.email = altemail;
    }
//    change the password as well
    public void setChange_password(String password){
        this.password = password;
    }

//    using the get methods to get the variables:

    public String getAlternate_email() {
        return alternate_email;
    }
    public int getMailbox_capacity() {
        return mailbox_capacity;
    }

    public String getPassword() {
        return password;
    }

//    to display all the information in a organised order
    public String showInfo(){
        System.out.println("----------------Your Details are below----------------");
        return "Display name: "+firstname+" "+lastname+"\nCompany email: "+email+"\nMailbox capacity: "+mailbox_capacity+"mb";
    }
}
