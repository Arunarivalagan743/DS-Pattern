package Graph.AdjacenyListImplemenation.Weighted;

import Graph.AdjacenyListImplemenation.NonWeighted.GarphList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ver = sc.nextInt();
        int edge = sc.nextInt();

   GraphList g =  new GraphList(ver);
        System.out.println("Enter edges:");

        for (int i = 0; i < edge; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            int w = sc.nextInt();
            g.addEdge(u,v,w);
        }

        g.printGraph();
    }
}
