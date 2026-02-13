import java.util.ArrayList;
import java.util.Arrays;

public class CallingImmutableClass {
    public static void main(String[] args) {
        ImmutableClass c=new ImmutableClass("neha",1, Arrays.asList("a","b","c"));
        System.out.println(c.getString());
        System.out.println(c.getList());


    }

}
