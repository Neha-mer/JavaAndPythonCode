package JavaCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingNumber {

    public static void main(String[] args) {


    int[] num={1,2,3,4,4,6,6,5,8};

     //store it in set
  /*     List<Integer> sortedList= Arrays.stream(num).distinct().sorted().boxed().collect(Collectors.toList());
//find issing number

      int missingNum=  IntStream.range(0,sortedList.size()-1).filter(i->sortedList.get(i+1)-sortedList.get(i)>1).map(i->sortedList.get(i)+1).findFirst().orElse(-1);

        System.out.println(missingNum);*/

     /*   Set<Integer> set=new TreeSet<>();

        for(int i:num){
            set.add(i);

        }
List<Integer> list=new ArrayList<>(set);

        //
        int missingNum=-1;

        for(int i=0;i<list.size()-1;i++){

            if(list.get(i+1)-list.get(i)>1){
                missingNum=list.get(i)+1;
                break;
            }

        }
        System.out.println(missingNum);*/



     List<Integer>  sortedList=  Arrays.stream(num).distinct().sorted().boxed().collect(Collectors.toList());

int missingNum=IntStream.range(0,sortedList.size()-1).filter(i->sortedList.get(i+1)-sortedList.get(i)>1).map(i->sortedList.get(i)+1).findFirst().orElse(-1);
        System.out.println(missingNum);



    }
}
