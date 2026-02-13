package JavaCoding;

public class ReverseAnarray {
    public  static void main(String args[]) {
            // code here
        int arr[]={1,2,3,4};
            int y=0;
            int newArray[]=new int[arr.length];
            for(int i=arr.length-1;i>=0;i--){
                newArray[y]=arr[i];
                y++;

            }
        }
    }

