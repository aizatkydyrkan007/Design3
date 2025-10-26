# Report — Assignment 3
## Minimum Spanning Tree (MST)

### Topic
Optimization of a city transportation network using Prim’s and Kruskal’s algorithms.

---

### Purpose
The goal of this work was to find the most efficient and cost-effective way to connect all city districts with roads. Each district should be reachable from every other district, and the total construction cost should be minimized.

---

### Task
The city map was represented as a graph:

- **Vertices (nodes)** — city districts  
- **Edges** — possible roads between districts  
- **Weights** — cost of building each road  

Two algorithms were used to find the **Minimum Spanning Tree (MST)**:

- **Prim’s Algorithm**  
- **Kruskal’s Algorithm**

---

### Work Process
1. Created an input JSON file with graph data.  
2. Implemented Prim’s and Kruskal’s algorithms in Java.  
3. For each algorithm, calculated:
   - Total MST cost  
   - Number of operations  
   - Execution time in milliseconds  

4. Saved results to:
   - `output.json`  
   - `output.csv`  

5. Created visual charts using Python:
   - `plot_time.png` — execution time  
   - `plot_ops.png` — number of operations  
   - `plot_cost.png` — total cost

---

### Results

| Graph ID | Vertices | Edges | Prim Cost | Kruskal Cost | Prim Ops | Kruskal Ops | Prim Time (ms) | Kruskal Time (ms) |
|----------|----------|-------|-----------|--------------|----------|-------------|----------------|------------------|
| 1        | 5        | 7     | 16        | 16           | 47       | 38          | 0.87           | 0.52             |
| 2        | 4        | 5     | 6         | 6            | 56       | 39          | 0.96           | 0.98             |

✅ Both algorithms found the same MST cost, confirming correctness.

---

### Analysis
- **Prim’s Algorithm** works faster on dense graphs (more roads).  
- **Kruskal’s Algorithm** works faster on sparse graphs (fewer roads).  
- Both algorithms produce the same MST cost.  
- Prim’s algorithm required more operations on some graphs but is generally efficient for dense networks.

---

### Graphs
- `plot_time.png` — shows execution time comparison  
- `plot_ops.png` — shows number of operations  
- `plot_cost.png` — shows total MST cost  

Observations:  
- Prim’s algorithm had more operations on these examples but performed well on dense connections.  
- Kruskal’s algorithm is slightly faster on smaller or sparse graphs.

---

### Conclusion
- Both algorithms correctly solve the MST problem.  
- They help plan city roads with the lowest construction cost.  
- **Prim’s Algorithm** — preferable for dense networks.  
- **Kruskal’s Algorithm** — preferable for sparse networks.  
- This project demonstrates how MST algorithms can optimize real-world transportation planning.
