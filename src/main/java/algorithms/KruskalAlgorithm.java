package algorithms;

import model.Edge;
import model.Graph;

import java.util.*;

public class KruskalAlgorithm {

    private static class UnionFind {
        private final Map<String,String> p = new HashMap<>();
        private final Map<String,Integer> r = new HashMap<>();

        String find(String x) {
            p.putIfAbsent(x, x);
            if (!p.get(x).equals(x)) p.put(x, find(p.get(x)));
            return p.get(x);
        }

        boolean union(String a, String b) {
            String ra = find(a), rb = find(b);
            if (ra.equals(rb)) return false;
            int raR = r.getOrDefault(ra,0), rbR = r.getOrDefault(rb,0);
            if (raR < rbR) p.put(ra, rb);
            else if (raR > rbR) p.put(rb, ra);
            else { p.put(rb, ra); r.put(ra, raR+1); }
            return true;
        }
    }

    public static List<Edge> findMST(Graph graph) {
        List<Edge> mst = new ArrayList<>();
        if (graph == null || graph.edges == null) return mst;

        List<Edge> edges = new ArrayList<>(graph.edges);
        edges.sort(Comparator.comparingInt(e -> e.weight));

        UnionFind uf = new UnionFind();
        for (Edge e : edges) {
            if (uf.union(e.from, e.to)) {
                mst.add(e);
                // early stop: optional if you know vertex count (not required here)
            }
        }
        return mst;
    }
}
