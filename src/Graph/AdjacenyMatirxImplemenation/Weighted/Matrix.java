package Graph.AdjacenyMatirxImplemenation.Weighted;


import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ver = sc.nextInt();
        int edge = sc.nextInt();
        GraphMatrix gh  = new GraphMatrix(ver);

        System.out.println("Enter 4 edges (u v):");

        for (int i = 0; i < edge; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt() ;
            int w = sc.nextInt();
            gh.addEdge(u, v,w);
        }

        gh.printGraph();
    }
}