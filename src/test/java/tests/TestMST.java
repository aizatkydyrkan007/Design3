package tests;

import algorithms.KruskalAlgorithm;
import algorithms.PrimAlgorithm;
import model.Edge;
import model.Graph;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMST {

    @Test
    public void testMSTAlgorithms() {
        Graph g = new Graph();
        g.nodes = List.of("A", "B", "C");
        g.edges = List.of(
                new Edge("A", "B", 1),
                new Edge("B", "C", 2),
                new Edge("A", "C", 3)
        );

        assertEquals(2, KruskalAlgorithm.findMST(g).size());
        assertEquals(2, PrimAlgorithm.findMST(g).size());
    }
}
