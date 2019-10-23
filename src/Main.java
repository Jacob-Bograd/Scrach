import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> values = new ArrayList<>();
        values.add(12);
        values.add(123);
        values.add(1234);
        for(int value: values){
            System.out.println(value);
        }
        for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i));
        }
        System.out.println(values.isEmpty());
        values.clear();
        System.out.println(values.isEmpty());
        ArrayList<String> strings = new ArrayList<>();
        strings.add("hello");
    }
}
