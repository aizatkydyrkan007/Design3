import algorithms.KruskalAlgorithm;
import algorithms.PrimAlgorithm;
import model.Edge;
import model.Graph;
import utils.JsonIO;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Graph> graphs = JsonIO.readGraphs("input.json");
        if (graphs.isEmpty()) {
            System.out.println("No graphs found.");
            return;
        }

        Map<Integer, Object> results = new LinkedHashMap<>();

        for (Graph g : graphs) {
            List<Edge> kruskal = KruskalAlgorithm.findMST(g);
            List<Edge> prim = PrimAlgorithm.findMST(g);

            int costK = kruskal.stream().mapToInt(e -> e.weight).sum();
            int costP = prim.stream().mapToInt(e -> e.weight).sum();

            System.out.println("\nGraph " + g.id + ": cost=" + costK + "/" + costP);

            results.put(g.id, Map.of(
                    "Kruskal_MST", kruskal,
                    "Kruskal_Cost", costK,
                    "Prim_MST", prim,
                    "Prim_Cost", costP
            ));
        }

        JsonIO.writeResults("output.json", results);
        System.out.println("\nResults saved to output.json");
    }
}
