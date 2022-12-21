package rtu.mirea;

import java.io.Serializable;

public class Template<T extends Comparable, V extends Serializable, K> {
    private T t;
    private V v;
    private K k;

    public Template(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    @Override
    public String toString() {
        return "Template{" + "t=" + t + ", v=" + v + ", k=" + k + '}';
    }
}
