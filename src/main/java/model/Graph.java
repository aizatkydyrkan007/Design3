package model;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    public int id;
    public List<String> nodes;
    public List<Edge> edges;

    public Graph() {
        this.nodes = new ArrayList<>();
        this.edges = new ArrayList<>();
    }

    public void addNode(String node) {
        if (!nodes.contains(node)) nodes.add(node);
    }

    public void addEdge(String from, String to, int weight) {
        addNode(from);
        addNode(to);
        edges.add(new Edge(from, to, weight));
    }

    public int vertexCount() {
        return nodes.size();
    }

    public int edgeCount() {
        return edges.size();
    }

    @Override
    public String toString() {
        return "Graph " + id + " (" + vertexCount() + " nodes, " + edgeCount() + " edges)";
    }
}
