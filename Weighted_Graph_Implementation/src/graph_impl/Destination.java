package graph_impl;

public class Destination<T> {

    private T t;
    private double weight;

    public Destination(T t, double weight) {
        this.t = t;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "t=" + t.toString() +
                ", weight=" + weight +
                '}';
    }

    public T getT() {
        return t;
    }

    public double getWeight() {
        return weight;
    }
}
