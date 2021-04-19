public class MyArrayList {

    private String[] stringArr;
    private int size;

    public MyArrayList(){
        stringArr = new String[4];
        size = 0;
    }

    public void add(String item){
        //Implement your code here
        size++;
        if (stringArr.length < size) {
            String[] newArr = new String[2*stringArr.length];
            for (int i = 0; i < stringArr.length; i++) {
                newArr[i] = stringArr[i];
            }
            stringArr = newArr;
            stringArr[size-1] = item;
        } else {
            stringArr[size-1] = item;
        }
    }

    public String get(int index){
        //Implement your code here
        return null;
    }
     
    public void set(int index, String newVal){
        //Implement your code here
    }

    public void remove(int index){
        //Implement your code here
    }

    public void clear(){
        //Implement your code here
    }

    public int size(){
        //Implement your code here
        return size;
    }

    public String[] toArray(){
        //Implement your code here
        return null;
    }

    public void addAll(String[] strArr){
        //Implement your code here
    }

    public void addAll(MyArrayList strArrList){
        //Implement your code here
    }

}
