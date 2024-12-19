package arraylist;


import java.util.ArrayList;

public class ArrayList1 {
    public ArrayList<Integer> createList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
        list.add(i);
    }
    return list;
}
}
