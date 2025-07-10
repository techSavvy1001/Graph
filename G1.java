import java.util.*;

// GitHub Repository:
// git add .
// git commit -m "Describe your update"
// git push


// Graph using adjacency list representation
// This is an undirected graph

/*

public class G1{
    static class Edge{
        int src;
        int des;

        public Edge(int s, int d){
            this.src = s;
            this.des = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));   
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    @SuppressWarnings("unchecked")
    public static void main(String args[]) {
        int V = 4;
        ArrayList<Edge> [] graph = new ArrayList[V]; // graph in the form of adjacency list

        createGraph(graph);

        // for(int i=0; i < graph[2].size(); i++){
        //     Edge e = graph[2].get(i);
        //     System.out.println(e.des + " ");
        // }

        for(int i = 0; i < V; i++){
            System.out.print(i + " : ");
            for(Edge e: graph[i]){
                System.out.print(e.des + " ");
            }
            System.out.println();
        }
        

    }
}

*/


public class G1{
    static class Edge{
        int src;
        int des;
        public Edge(int s, int d){
            this.src  = s;
            this.des = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i < graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }    
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 2));   
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));

    }

    @SuppressWarnings("unchecked")
    // This is the main method where the program starts execution
    public static void main(String args[]) {
        int V = 4;
        ArrayList<Edge> [] graph = new ArrayList[V];

        createGraph(graph);

        // Print the adjacency list representation of the graph
        for(int i = 0; i < V; i++){
            for(Edge e: graph[i]){
                System.out.print(e.src + ": " + e.des + " ");
            }
            System.out.println();
        }

    }

    
}


Hiiii