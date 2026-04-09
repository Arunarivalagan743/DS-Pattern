package Graph.AdjacenyMatirxImplemenation.Weighted;


public class  GraphMatrix{
    int vertices;
    int v[][];

    public GraphMatrix(int vertices) {
        this.vertices = vertices;
        v = new int[vertices][vertices];
    }
    public  void addEdge(int i,int j,int weight)
    {
        v[i][j] =weight;
        v[j][i] =weight;
    }
    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }
    }
}
