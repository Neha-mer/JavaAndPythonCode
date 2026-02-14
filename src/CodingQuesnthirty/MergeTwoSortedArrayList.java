package CodingQuesnthirty;

import java.util.ArrayList;

public class MergeTwoSortedArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> res=new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
int i=0;int j=0;

        while(i<list1.size() && j<list2.size()){

            if(list1.get(i)<list2.get(j)){
                res.add(list1.get(i));
                i++;


            }
            else if(list1.get(i)>list2.get(j)){
                res.add(list2.get(j));
                j++;
            }


        }

        if(j<list1.size()){
            res.add(list1.get(j));
        i++;
        }

        if(i<list2.size()){
            res.add(list2.get(i));
            j++;

        }
        System.out.println(res);
    }
}
