package Models;

public class MyVertex<T> {

    private T data;
    private MyEdgeNode first;



    public MyVertex(T data, MyEdgeNode first) {
        this.data = data;
        this.first = first;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public MyEdgeNode getFirst() {
        return first;
    }

    public void setFirst(MyEdgeNode first) {
        this.first = first;
    }
}
