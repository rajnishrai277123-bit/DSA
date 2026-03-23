import java.util.*;
public class AllPathsFromSource{
    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
        static void createGraph(ArrayList<Edge>[] graph){
            for(int i=0; i<graph.length; i++){
                graph[i] = new ArrayList<>();
            }
            graph[0].add(new Edge(0, 1));
            graph[0].add(new Edge(0, 2));
            graph[1].add(new Edge(1, 3));
            graph[2].add(new Edge(2, 3));
            graph[3].add(new Edge(3, 4));
            graph[4].add(new Edge(4, 5));
        }
        public static void printAllPaths(ArrayList<Edge>[] graph, int src, int dest, String path){
            if(src == dest){
                System.out.println(path);
                return;
            }
            for(int i=0; i<graph[src].size(); i++){
                Edge e = graph[src].get(i);
                printAllPaths(graph, e.dest, dest, path+src);
            }
        }
        public static void main(String[] args) {
            int V = 6;
            ArrayList<Edge>[] graph = new ArrayList[V];
            createGraph(graph);
            int src=0;
            int dest=5;
            printAllPaths(graph, src, dest, "");
        
}
}