import java.util.Arrays;
import java.util.Comparator;
//
//class SortByWeight implements Comparator<Edge> {
//    @Override
//    public int compare(Edge o1, Edge o2) {
//        return o1.weight- o2.weight;
//    }
//
//
//
//}
public class ComparatorUse {
    public static void main(String[] args) {


       Edge[] ed=new Edge[3];
       ed[0]=new Edge(1,2,10);
        ed[1]=new Edge(2,3,-8);
        ed[2]=new Edge(3,4,3);


//       Arrays.sort(ed, new Comparator<Edge>() {
//           @Override
//           public int compare(Edge o1, Edge o2) {
//               return 0;
//           }
//       });
//lambda java 8
      Arrays.sort(ed,(a,b)->a.weight-b.weight);

      //sorting a matrix
        int arr[][]={{1 , 8, 2},{ 6 , 0 , 5},{3,3,-1}};

        Arrays.sort(arr,(a,b)->a[1]-b[1]);


        for(Edge i: ed)
        System.out.print(i);


    }
}
