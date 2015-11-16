package gen;

public class Pair<T, V> {
    private T t;
    private V v;
     
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
    public V getV() {
        return v;
    }
    public void setV(V v) {
        this.v = v;
    }
     
    public Pair(T t, V v) {
        setT(t);
        setV(v);
    }
}