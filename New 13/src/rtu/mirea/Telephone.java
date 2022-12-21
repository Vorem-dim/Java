package rtu.mirea;

public class Telephone {
    private StringBuffer telephone;

    public Telephone(String str) {
        telephone = new StringBuffer(str);
        if (telephone.charAt(0) != '+') {
            telephone.insert(0, '+');
            int num = telephone.charAt(1) - 48;
            telephone.delete(1, 2);
            telephone.insert(1, --num);
        }
        telephone.insert(2, " (");
        telephone.insert(7, ") ");
        telephone.insert(12, '-');
        telephone.insert(15, '-');
        System.out.println(telephone);
    }
}
