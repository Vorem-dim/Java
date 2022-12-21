package rtu.mirea;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {
    private String regex = "abcdefghijklmnopqrstuv18340", price = "([0-9]+|[0-9].[0-9]{2}) (USD|EU|RUB)", ex = "[0-9]+ \\+";
    private String email = "[.\\w]+@(mail.ru|gmail.com|localhost)", password = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[\\w]{8,}";

    public void Check(String input) {
        boolean t = Pattern.matches(regex, input);
        if (t)
            System.out.println("Match");
        else
            System.out.println("Not match");
    }
    public void Check_price(String price) {

        boolean t = Pattern.matches(regex, price);
        if (t)
            System.out.println("Match");
        else
            System.out.println("Not match");
    }
    public void Check_ex(String ex) {
        Pattern pattern = Pattern.compile(this.ex);
        Matcher matcher = pattern.matcher(ex);
        if (matcher.find())
            System.out.println(ex);
        else
            System.out.println("No symbol \'+\'");
    }
    public void Check_email(String email) {
        boolean t = Pattern.matches(this.email, email);
        if (t)
            System.out.println("Match");
        else
            System.out.println("Not match");
    }
    public void Check_password(String password) {
        boolean t = Pattern.matches(this.password, password);
        if (t)
            System.out.println("Match");
        else
            System.out.println("Not match");
    }
}
