package basics;/* Authored by Kushagra on 2/7/2016. */

import java.util.ArrayList;
import java.util.List;

public class listReferenceDemo {

    public static void main(String[] args) {

        List<List<Integer>> listOfLists = new ArrayList<>();
        addList(listOfLists);

        for (List<Integer> list : listOfLists) {
            System.out.println(list.toString());
        }


        List<Integer> list = new ArrayList<>();
        addItem(list);
        System.out.println(list.toString());
    }

    private static void addList(List<List<Integer>> lists) {

        updateList(lists);

        List<Integer> list = new ArrayList<>();
        list.add(100);
        addItem(list);

        lists.add(list);
    }

    private static void updateList(List<List<Integer>> lists) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        lists.add(list);
    }


    private static void addItem(List<Integer> list) {
        list.add(10);
    }

}
