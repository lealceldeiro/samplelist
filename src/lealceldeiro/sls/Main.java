package lealceldeiro.sls;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(returnList().get(0));
    }

    static List<List<Integer>> returnList(){
        List<List<Integer>> currentArrayList = new ArrayList<>();
        ArrayList<Integer> innerList = new ArrayList<>();
        innerList.add(new Integer(123));
        currentArrayList.add(innerList);
        return currentArrayList;
    }
}
