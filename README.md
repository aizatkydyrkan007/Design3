# Report — Assignment 3
## Minimum Spanning Tree (MST)

### Topic
Optimization of a city transportation network using Prim’s and Kruskal’s algorithms.

---

### Purpose
The goal of this work was to find the best and cheapest way to connect all city districts with roads. Each district should be reachable from every other district, and the total construction cost should be minimized.

---

### Task
The city map was represented as a graph:

- **Vertices (nodes)** — city districts  
- **Edges** — possible roads between them  
- **Weights** — cost of building the road  

We used two algorithms to find the **Minimum Spanning Tree (MST)** — the smallest set of roads connecting all districts:

- **Prim’s Algorithm**  
- **Kruskal’s Algorithm**

---

### Work Process
1. Created an input JSON file with graph data.  
2. Implemented Prim’s and Kruskal’s algorithms in Java.  
3. For each algorithm, calculated:
   - Total cost of the MST  
   - Number of key operations  
   - Execution time in milliseconds  

4. Saved results to:
   - `assign_3_output.json`  
   - `summary.csv`  

5. Created visual charts:
   - `plot_time.png` — execution time  
   - `plot_ops.png` — number of operations  

---

### Results

| Graph ID | Vertices | Edges | Prim Cost | Kruskal Cost | Prim Ops | Kruskal Ops | Prim Time (ms) | Kruskal Time (ms) |
|----------|----------|-------|-----------|--------------|----------|-------------|----------------|------------------|
| 1        | 5        | 7     | 16        | 16           | 18       | 42          | 0.018          | 0.027            |
| 2        | 10       | 13    | 33        | 33           | 36       | 97          | 0.018          | 0.014            |

✅ Both algorithms found the same MST cost, so the results are correct.

---

### Analysis
- **Prim’s Algorithm** works faster on dense graphs (many roads).  
- **Kruskal’s Algorithm** works faster on sparse graphs (fewer roads).  
- The total MST cost is identical for both algorithms.  
- Prim’s algorithm required fewer operations in most cases.  

---

### Graphs
- `plot_time.png` — execution time comparison  
- `plot_ops.png` — operations count comparison  

Observations from graphs:  
- Prim’s algorithm performs fewer operations.  
- Kruskal’s algorithm can be slightly faster on some sparse graphs.

---

### Conclusion
- Both algorithms correctly solve the MST problem.  
- They help plan city roads with minimal construction cost.  
- **Prim’s Algorithm** — better for dense networks.  
- **Kruskal’s Algorithm** — better for sparse networks.  
- This project demonstrates how algorithms can optimize real-world transportation networks.
