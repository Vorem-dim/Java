package rtu.mirea;

public class My_string implements Stringable{
    @Override
    public int Count(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            count++;
        return count;
    }

    @Override
    public String uneven_str(String str) {
        String un_str = "";
        for (int i = 0; i < str.length(); i += 2)
            un_str += str.charAt(i);
        return un_str;
    }

    @Override
    public String reverse(String str) {
        String rev_str = "";
        for (int i = str.length() - 1; i >= 0; i--)
            rev_str += str.charAt(i);
        return rev_str;
    }
}
