package rtu.mirea;

public class Calculator {
    public <Type extends Number> Type sum(Type num1, Type num2) {
        if (num1 instanceof Integer)
            return (Type) Integer.valueOf(num1.intValue() + num2.intValue());
        else if (num1 instanceof Double)
            return (Type) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        return null;
    }
    public <Type extends Number> Type minus(Type num1, Type num2) {
        if (num1 instanceof Integer)
            return (Type) Integer.valueOf(num1.intValue() - num2.intValue());
        else if (num1 instanceof Double)
            return (Type) Double.valueOf(num1.doubleValue() - num2.doubleValue());
        return null;
    }
    public <Type extends Number> Type multi(Type num1, Type num2) {
        if (num1 instanceof Integer)
            return (Type) Integer.valueOf(num1.intValue() * num2.intValue());
        else if (num1 instanceof Double)
            return (Type) Double.valueOf(num1.doubleValue() * num2.doubleValue());
        return null;
    }
    public <Type extends Number> Type division(Type num1, Type num2) {
        if (num1 instanceof Integer)
            return (Type) Integer.valueOf(num1.intValue() / num2.intValue());
        else if (num1 instanceof Double)
            return (Type) Double.valueOf(num1.doubleValue() / num2.doubleValue());
        return null;
    }
}
