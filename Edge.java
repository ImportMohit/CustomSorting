public class Edge /*implements Comparable<Edge>*/{
    int vertex1;
    int vertex2;
    int weight;

    public Edge(int a , int b , int c) {
        vertex1=a;
        vertex2=b;
;        weight =c;
    }

    @Override
    public String toString() {
        return
                " weight=" + weight
                ;
    }


//    public int compareTo(Edge o) {
//
//        return o.weight-this.weight;
//    }
}
