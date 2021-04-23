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
        try {
            return stringArr[index];
        } catch (IndexOutOfBoundsException e) {
            System.out.print("Unable to get String at index "+index+"; Out of Bounds Error");
            return null;
        }
    }
     
    public void set(int index, String newVal){
        //Implement your code here
        try {
            stringArr[index] = newVal;
        } catch (IndexOutOfBoundsException e) {
            System.out.print("Unable to set String at index "+index+"; Out of Bounds Error");
        }
    }

    public void remove(int index){
        //Implement your code here
        for (int i = index; i < size-2; i++) {
            stringArr[i] = stringArr[i+1];
        }
        stringArr[size-1] = null;
        size--;
    }

    public void clear(){
        //Implement your code here
        String[] newArr = new String[4];
        stringArr = newArr;
        size = 0;
    }

    public int size(){
        //Implement your code here
        return size;
    }

    public String[] toArray(){
        //Implement your code here
        return stringArr;
    }

    public void addAll(String[] strArr){
        //Implement your code here
        for (int i = 0; i < strArr.length; i++) {
            size++;
            if (stringArr.length < size) {
                String[] newArr = new String[2*stringArr.length];
                for (int j = 0; j < stringArr.length; j++) {
                    newArr[j] = stringArr[j];
                }
                stringArr = newArr;
                stringArr[size-1] = strArr[i];
            } else {
                stringArr[size-1] = strArr[i];
            }//I'd call add() if I could
        }
    }

    public void addAll(MyArrayList strArrList){
        //Implement your code here
        for (int i = 0; i < strArrList.size(); i++) {
            size++;
            if (stringArr.length < size) {
                String[] newArr = new String[2*stringArr.length];
                for (int j = 0; j < stringArr.length; j++) {
                    newArr[j] = stringArr[j];
                }
                stringArr = newArr;
                stringArr[size-1] = strArrList.get(i);
            } else {
                stringArr[size-1] = strArrList.get(i);
            }
        }
    }

    public void printMyArrayList() {
        System.out.print(stringArr.toString());
    }
}
