package Models;

public class MyEdgeNode {

    private int indexOfToVertex;
    private int edgeWeight;
    private MyEdgeNode next;

    public MyEdgeNode(int indexOfToVertex, int edgeWeight, MyEdgeNode next) {
        this.indexOfToVertex = indexOfToVertex;
        this.edgeWeight = edgeWeight;
        this.next = next;
    }
    public MyEdgeNode() {
    }

    public int getIndexOfToVertex() {
        return indexOfToVertex;
    }

    public void setIndexOfToVertex(int indexOfToVertex) {
        this.indexOfToVertex = indexOfToVertex;
    }

    public int getEdgeWeight() {
        return edgeWeight;
    }

    public void setEdgeWeight(int edgeWeight) {
        this.edgeWeight = edgeWeight;
    }

    public MyEdgeNode getNext() {
        return next;
    }

    public void setNext(MyEdgeNode next) {
        this.next = next;
    }
}
