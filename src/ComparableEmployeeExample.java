import java.util.ArrayList;
import java.util.Collections;

public class ComparableEmployeeExample implements Comparable<ComparableEmployeeExample> {

    private int Salary;
    private  int id;

  ComparableEmployeeExample(int id, int salary) {
      this.id=id;
        this.Salary=salary;
  }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int  compareTo(ComparableEmployeeExample o) {
        return this.Salary - o.Salary;
   }


}


class ComparatorEmployeeExampClass{
    public static void main(String[] args) {

        ArrayList<ComparableEmployeeExample> list=new ArrayList<ComparableEmployeeExample>();
        list.add(new ComparableEmployeeExample(1,288800));
        list.add(new ComparableEmployeeExample(2,2440));
        list.add(new ComparableEmployeeExample(3,300));
        Collections.sort(list);

        for(ComparableEmployeeExample e:list){
            System.out.println(e.getId()+"salary"+e.getSalary()
            );
        }


    }
}


