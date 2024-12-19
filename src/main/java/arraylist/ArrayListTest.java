package arraylist;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        //ArrayList1 list1 = new ArrayList1();
        for (int i = 1; i <= 50; i++) {
            list1.add(i);
        }

        ArrayList<Integer> list2=new ArrayList<>();
        //ArrayList1 list1 = new ArrayList1();
        for (int i = 25; i <= 75; i++) {
            list2.add(i);
        }
       // ArrayList<Integer> arrayList1= list1.createList();
        //System.out.println("ArrayList 1to 50"+arrayList1);


        //ArrayList2 list2= new ArrayList2();
        //ArrayList<Integer> arrayList2= list2.createList();
       // System.out.println("ArrayList 25 to 75"+arrayList2);
        ArrayList<Integer> commonIntegers=new ArrayList<>();
        for(int i:list2){
//            if(list1.contains(i)){
//                commonIntegers.add(i);
//            }

            System.out.println(commonIntegers);
        }

    }
}
