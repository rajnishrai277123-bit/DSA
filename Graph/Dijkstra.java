import java.util.*;
public class Dijkstra {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        graph[1].add(new Edge(1,0,5));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        graph[2].add(new Edge(2,1,1));
        graph[3].add(new Edge(3, 2, 1));
        graph[3].add(new Edge(3, 1, 3));
        graph[4].add(new Edge(4, 2, 2));
    }
    static class Pair implements Comparable<Pair>{
        int n;
        int path;
        public Pair(int n,int path){
            this.n = n;
            this.path = path;
        }
        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path;
        }
    }
    public static void dijkstra(ArrayList<Edge> graph[], int src){
        int dist[] = new int[graph.length];
        for(int i=0; i<dist.length; i++){
            if(i!=src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean visited[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(visited[curr.n]){
                continue;
            }
            visited[curr.n] = true;
            for(int i=0; i<graph[curr.n].size(); i++){
                Edge e = graph[curr.n].get(i);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;
                if(curr.path + wt < dist[v]){
                    dist[v] = curr.path + wt;
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }
        for(int i=0; i<dist.length; i++){
            System.out.println("Distance from source "+src+" to vertex "+i+" is "+dist[i]);
        }
    }

       
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        dijkstra(graph, 0);


    }

}