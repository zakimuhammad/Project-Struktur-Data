package uas.prak.sd;
// =====BISMILLAH=====

public class WeightedGraph {

    private int[][] edges;
    private Object[] labels;
    private int nVerts;
    private Stack theStack;

    public WeightedGraph(int n) {
        boolean wasVisited = false;
        edges = new int[n][n];
        labels = new Object[n];
        nVerts = 0;
        theStack = new Stack();
    }

    public void dfs(Object city) {
        labels[0] = true;
        displayVertex(0);
        theStack.push(0);
        while (!theStack.isEmpty()) {
            int v = getAdjUnvisitedVertex(theStack.peek());
            if (v == -1) {
                theStack.pop();
            } else {
                labels[v] = city;  // mark it
                displayVertex(v);                 // display it
                theStack.push(v);                 // push it
            }
        }
        for (int j = 0; j < nVerts; j++) {
            labels[j] = city;
        }
        System.out.println("");
    }

    public int getAdjUnvisitedVertex(int v) {
        for (int j = 0; j < nVerts; j++) {
            if (edges[v][j] == 1 ) {
                return j;
            }
        }
        return -1;
    }

    public void displayVertex(int v) {
        System.out.print(labels[v]);
    }

    public int size() {
        return labels.length;
    }

    public void setLabel(int vertex, Object label) {
        labels[vertex] = label;
    }

    public Object getLabel(int vertex) {
        return labels[vertex];
    }

    public void addEdge(int source, int target, int w) {
        edges[source][target] = w;
        edges[target][source] = w;
    }

    public boolean isEdge(int source, int target) {
        return edges[source][target] > 0;
    }

    public void removeEdge(int source, int target) {
        edges[source][target] = 0;
    }

    public int getWeight(int source, int target) {
        return edges[source][target];
    }

    public int[] neighbors(int vertex) {
        int count = 0;
        for (int i = 0; i < edges[vertex].length; i++) {
            if (edges[vertex][i] > 0) {
                count++;
            }
        }
        final int[] answer = new int[count];
        count = 0;
        for (int i = 0; i < edges[vertex].length; i++) {
            if (edges[vertex][i] > 0) {
                answer[count++] = i;
            }
        }
        return answer;
    }

    public void print() {
        for (int j = 0; j < edges.length; j++) {
            for (int i = 0; i < edges[j].length; i++) {
                if (edges[j][i] > 0) {
                    System.out.print(labels[j] + " -- " + labels[i] + " Distance = " + edges[j][i] + " km \n");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        final WeightedGraph t = new WeightedGraph(6);
        t.setLabel(0, "Malang");
        t.setLabel(1, "Surabaya");
        t.setLabel(2, "Lumajang");
        t.setLabel(3, "Kediri");
        t.setLabel(4, "Jember");
        t.setLabel(5, "Blitar");
        t.addEdge(0, 1, 50);
        t.addEdge(0, 5, 100);
        t.addEdge(1, 2, 180);
        t.addEdge(1, 3, 80);
        t.addEdge(1, 5, 120);
        t.addEdge(2, 3, 160);
        t.addEdge(4, 3, 130);
        t.addEdge(4, 2, 60);
        t.addEdge(5, 4, 125);
        t.neighbors(0);
        t.print();
        t.dfs("Kediri");
    }
}
// =====ALHAMDULILLAH=====
