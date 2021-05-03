import java.lang.reflect.Array;
import java.util.*;
public class ListExample1 {

/*    public static void main(String[] args) {
        List<String> list =new ArrayList<String>();

        list.add("Mango");
        list.add("Banana");
        list.add("Apple");
        list.add("Grapes");

        for (String fruit:list)
            System.out.println(fruit);
    }*/
/*public static void main(String[] args) {
    String[] array ={"java","Python","PHP","C++"};
    System.out.println("Printing Array " + Arrays.toString(array));

    List <String> list = new ArrayList<String>();
    Collections.addAll(list, array);
    System.out.println("Printing List : " + list);
}*/
public static void main(String[] args) {
    List<String> list1=new ArrayList<String>();
    list1.add("Mango");
    list1.add("Apple");
    list1.add("Banana");
    list1.add("Grapes");
    //Sorting the list
    Collections.sort(list1);
    //Traversing list through the for-each loop
    for(String fruit:list1)
        System.out.println(fruit);

    System.out.println("Sorting numbers...");
    //Creating a list of numbers
    List<Integer> list2=new ArrayList<Integer>();
    list2.add(21);
    list2.add(11);
    list2.add(51);
    list2.add(1);
    //Sorting the list
    Collections.sort(list2);
    //Traversing list through the for-each loop
    for(Integer number:list2)
        System.out.println(number);
}
}
