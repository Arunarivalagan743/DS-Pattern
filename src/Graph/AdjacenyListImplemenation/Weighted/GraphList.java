package Graph.AdjacenyListImplemenation.Weighted;

import java.util.ArrayList;

class pair{
    int node;
    int weight;
    public pair(int n,int w){
        this.node = n;
        this.weight = w;
    }
}
public class GraphList {
    int vertices;
    public  ArrayList <ArrayList<pair>> al;
    GraphList(int ver)
    {
        this.vertices =  ver;
        al = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            al.add(new ArrayList<>());
        }
    }
    void addEdge(int i,int j,int w)
    {
        al.get(i).add(new pair(j,w));
        al.get(j).add(new pair(i,w));
    }
    void printGraph() {
        for (int i = 0; i < al.size(); i++) {
            System.out.print(i + " -> ");
            for (pair p : al.get(i)) {
                System.out.print("(" + p.node + ", " + p.weight + ") ");
            }
            System.out.println();
        }
    }
}


