// import java.util.Scanner;

class Account {
    public String name;
    protected String email;
    private String password;

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }
}

public class OPPS {
    public static void main(String[] args) {
        Account account1 = new Account();

        account1.name = "Iswar";

        account1.email = "iswar@gmail.com";

        account1.setPassword("1234");

        System.out.println(account1.name + " " + account1.email + " " + account1.getPassword());
    }
}
