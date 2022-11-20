package Chapter8.ch4;

public class UndirectedGraph {
    private int count;
    private int[][] vertexMatrix;

    public UndirectedGraph(int count) {
        vertexMatrix = new int[count][count];
    }

    public void addEdges(int from, int to, int weight) {
        vertexMatrix[from][to] = weight;
        vertexMatrix[to][from] = weight;
    }

    public int[][] getMatrix() {
        return vertexMatrix;
    }
}
