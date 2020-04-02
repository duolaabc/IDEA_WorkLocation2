import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;

public class CompareTest {



    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);

        Comparator<Integer> comparetol = new Comparator<Integer>(){
            public int compare(Integer a1,Integer a2){
                if(a1%2!=0) return 1;
                else return -1;
            }
        };

        Collections.sort(list,comparetol);

        for(Integer w:list){
            System.out.print(w+" ");
        }
    }
}
