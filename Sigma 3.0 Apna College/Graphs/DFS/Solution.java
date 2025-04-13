package DFS;

import java.util.ArrayList;

public class Solution {
    static class Edge{
        int source;
        int destination;
        int weight;
        public Edge(int source, int destination, int weight){
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        /* 
         *   1--------3
         *  /         |\
         * 0          | 5---6 
         * \          |/ 
         *  2---------4   
        */

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));
        graph[4].add(new Edge(4,2,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        graph[6].add(new Edge(6,5,1));

    }
    public static void dfs(ArrayList<Edge>[] graph){
        dfsComplement(graph,0, new boolean[graph.length]);
    }
    public static void dfsComplement(ArrayList<Edge>[] graph, int curr, boolean visited[]){
        System.out.print(curr+" ");
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!visited[e.destination]){
                dfsComplement(graph, e.destination, visited);
            }
        }
    }
    
    public static void main(String[] args) {
        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        dfs(graph);
    }
}
