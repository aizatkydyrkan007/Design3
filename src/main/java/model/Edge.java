package model;

public class Edge implements Comparable<Edge> {
    public String from;
    public String to;
    public int weight;

    public Edge(String from, String to, int weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge other) {
        return Integer.compare(weight, other.weight);
    }

    @Override
    public String toString() {
        return String.format("%s — %s (%d)", from, to, weight);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Edge)) return false;
        Edge e = (Edge) obj;
        return weight == e.weight &&
                ((from.equals(e.from) && to.equals(e.to)) ||
                        (from.equals(e.to) && to.equals(e.from))); // неориентированное сравнение
    }

    @Override
    public int hashCode() {
        return from.hashCode() + to.hashCode() + weight;
    }
}
