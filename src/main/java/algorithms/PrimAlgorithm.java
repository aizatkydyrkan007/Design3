package algorithms;

import model.Edge;
import model.Graph;

import java.util.*;

public class PrimAlgorithm {

    public static List<Edge> findMST(Graph graph) {
        List<Edge> mst = new ArrayList<>();
        if (graph == null || graph.nodes == null || graph.nodes.isEmpty()) return mst;

        Map<String, List<Edge>> adj = new HashMap<>();
        for (String n : graph.nodes) adj.put(n, new ArrayList<>());
        for (Edge e : graph.edges) {
            adj.computeIfAbsent(e.from, k -> new ArrayList<>()).add(e);
            adj.computeIfAbsent(e.to, k -> new ArrayList<>()).add(new Edge(e.to, e.from, e.weight));
        }

        Set<String> visited = new HashSet<>();
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));

        String start = graph.nodes.get(0);
        visited.add(start);
        List<Edge> startAdj = adj.getOrDefault(start, Collections.emptyList());
        for (Edge e : startAdj) pq.add(e);

        int targetEdges = Math.max(0, graph.nodes.size() - 1);
        while (!pq.isEmpty() && mst.size() < targetEdges) {
            Edge e = pq.poll();
            if (visited.contains(e.to)) continue;
            // take this edge
            mst.add(e);
            visited.add(e.to);
            // add outgoing edges from newly visited node
            for (Edge out : adj.getOrDefault(e.to, Collections.emptyList())) {
                if (!visited.contains(out.to)) pq.add(out);
            }
        }

        return mst;
    }
}
