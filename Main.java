import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        System.out.println("Hello world");
        ArrayList<String> arrList = new ArrayList<String>();

        arrList.add("test");
        arrList.add("test2");
        arrList.add("Test3");
        System.out.println(arrList.get(4));
    }
}