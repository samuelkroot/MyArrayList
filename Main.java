public class Main{
    public static void main(String[] args){
        System.out.println("Hello world");
        MyArrayList arrList = new MyArrayList();

        arrList.add("test0");
        arrList.add("test1");
        arrList.add("test2");
        arrList.add("test3");
        arrList.add("add test");
        System.out.println(arrList.asString());

        System.out.println(arrList.get(2));

        arrList.set(2, "new");
        System.out.println(arrList.get(2));

        arrList.remove(2);
        System.out.println(arrList.get(2));

        System.out.println(arrList.get(17));

        arrList.addAll(new String[]{"banana", "cat", "dog"});

        System.out.println("Current Size: " + arrList.size());
        System.out.println("Current List: " + arrList.asString());
        arrList.clear();
        System.out.println("Cleared List: " + arrList.asString());
    } // I think I got most of the important ones. I didnt do "toArray" but it's not like I can really show that super well
}