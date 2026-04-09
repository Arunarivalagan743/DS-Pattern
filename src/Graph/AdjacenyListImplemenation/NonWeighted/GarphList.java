package Graph.AdjacenyListImplemenation.NonWeighted;

import java.util.ArrayList;
import java.util.Scanner;

//class pair{
//    int node;
//    int weight;
//    public pair(int n,int w){
//        this.node = n;
//        this.node = w;
//    }
//}
public class GarphList {
    int vertices;
    public  ArrayList <ArrayList<Integer>> al;
  public GarphList(int ver)
    {
        this.vertices =  ver;
        al = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            al.add(new ArrayList<>());
        }
    }
    void addEdge(int i,int j)
    {
        al.get(i).add(j);
        al.get(j).add(i);
    }
    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : al.get(i)) {
                System.out.print((neighbor + 1) + " ");
            }
            System.out.println();
        }
    }
}


