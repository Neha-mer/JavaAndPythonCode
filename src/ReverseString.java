public class ReverseString {

    public static void main(String[] args) {

        String s="neha";
        StringBuilder temp=new StringBuilder();
        for(int j=s.length()-1;j>=0;j--){
             temp=temp.append(String.valueOf(s.charAt(j)));

        }
        System.out.println(temp);
    }
}
