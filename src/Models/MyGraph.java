package Models;

public class MyGraph<T> {

    private MyVertex<T>[] allVertices;
    private final int defaultSize = 10;
    private int size = defaultSize;
    private int elementCounter = 0;


    public MyGraph() {
        allVertices = (MyVertex<T>[]) new Object[size];
    }

    public MyGraph(int size) {

        if (size > 0) {
            this.size = size;
        }

        allVertices = (MyVertex<T>[]) new Object[this.size];
    }

    private boolean isVertexInGraph(T element) {
        for (MyVertex<T> v : allVertices) {
            if (v.getData().equals(element)) {
                return true;
            }
        }
        return false;
    }

    private int indexOfVertex(T element) {
        for (int i = 0; i < elementCounter; i++) {
            if (allVertices[i].getData().equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isFull() {
        return (size == elementCounter) ? true : false;

    }

    public boolean isEmpty() {

        return (elementCounter == 0) ? true : false;
    }

    public boolean addVertex(T elment) {

        if (isFull() || isVertexInGraph(elment)) {
            return false;
        } else {

            MyVertex<T> temp = new MyVertex<T>(elment, null);
            allVertices[elementCounter] = temp;
            elementCounter++;
            return true;
        }
    }

    public boolean addEdge(T fromV, T toV, int weight) {

        if (isEmpty()) {
            return false;
        } else {
            if (isVertexInGraph(fromV) && isVertexInGraph(toV)) {
                //TODO if edge exist
                MyEdgeNode edgeTemp = new MyEdgeNode();
                if (weight > 0) {
                    edgeTemp.setEdgeWeight(weight);

                    int indexOfTOVertex = indexOfVertex(toV);
                    edgeTemp.setIndexOfToVertex(indexOfTOVertex);
                    //TODO get last node
                    edgeTemp.setNext(null);
                    int indexOfFromVertex = indexOfVertex(fromV);

                    if (allVertices[indexOfFromVertex].getFirst() == null) {
                        allVertices[indexOfFromVertex].setData((T) edgeTemp);
                    } else {
                        MyEdgeNode tempForSearch = allVertices[indexOfFromVertex].getFirst();

                        while (tempForSearch != null) {
                            tempForSearch = tempForSearch.getNext();
                        }
                        tempForSearch.setNext(edgeTemp);
                    }
                    return true;
                }


            } else {
                return false;
            }
        }

    }


    public void display() {
        for (MyVertex<T> myVertex : allVertices) {
            System.out.println(myVertex.getData());

            MyEdgeNode temp = myVertex.getFirst();
            while (temp != null) {
                System.out.println(temp.getEdgeWeight() + " " + allVertices[temp.getIndexOfToVertex()]);
                temp = temp.getNext();
            }
        }
    }

}
