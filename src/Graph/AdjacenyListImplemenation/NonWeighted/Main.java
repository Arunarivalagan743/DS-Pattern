package Graph.AdjacenyListImplemenation.NonWeighted;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ver = sc.nextInt();
        int edge = sc.nextInt();

        GarphList g = new GarphList(ver);

        System.out.println("Enter edges:");

        for (int i = 0; i < edge; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
        }

        g.printGraph();
    }
}
