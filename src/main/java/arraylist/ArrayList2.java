package arraylist;

import java.util.ArrayList;

public class ArrayList2 {
    public ArrayList<Integer> createList(){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=25;i<=75;i++){
            list.add(i);
        }
        return list;
    }
}
