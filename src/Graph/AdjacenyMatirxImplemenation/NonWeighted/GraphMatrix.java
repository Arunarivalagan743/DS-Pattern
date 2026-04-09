package Graph.AdjacenyMatirxImplemenation.NonWeighted;

public class  GraphMatrix{
    int vertices;
    int v[][];

    public GraphMatrix(int vertices) {
       this.vertices = vertices;
       v = new int[vertices][vertices];
    }
    public  void addNonEdge(int i,int j)
    {
        v[i][j] =1;
        v[j][i] =1;
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
