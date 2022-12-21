package rtu.mirea;

public class What {
    private StringBuilder what = new StringBuilder();
    private String[] array;

    public What(String str) {
        array = str.split(" ");
        System.out.println(GetLine());
    }
    private StringBuilder GetLine() {
        char symbol = ' ';
        for (int i = 0; i < array.length; i++) {
            int flag = 1;
            if (symbol == ' ')
                symbol = array[0].charAt(array[0].length() - 1);
            for (int j = 1; j < array.length; j++) {
                char j_symbol = array[j].charAt(0);
                if (symbol == j_symbol || symbol == (j_symbol + 32) || (symbol + 32) == j_symbol) {
                    symbol = array[j].charAt(array[j].length() - 1);
                    if (what.isEmpty())
                        what.append(array[0]);
                    array[0] = " ";
                    what.append(" " + array[j]);
                    flag = j - i;
                    break;
                }
                else if (j == array.length - 1)
                    symbol = ' ';
            }
            if (i != (array.length - 1)) {
                String temp = array[0];
                array[0] = array[flag + i];
                array[flag + i] = temp;
            }
        }
        if (what.isEmpty())
            what.append("No matches");
        return what;
    }
}
