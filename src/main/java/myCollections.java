import java.util.*;

public class myCollections {

    public static void main(String[]args)
    {
        myArrayList();
        System.out.println();
        mySet();
        System.out.println();
        myMap();
    }

    public static void myArrayList()
    {
        List myArrayList = new ArrayList();

        myArrayList.add("Burger");
        myArrayList.add("Ice Cream");
        myArrayList.add("Coke");
        myArrayList.add(0,"Apple");

        for(int i = 0; i<myArrayList.size(); i++)
        {
            System.out.println(myArrayList.get(i));
        }
    }

    public static void mySet()
    {
        Set theSet = new HashSet();

        theSet.add("Ice Cream");
        theSet.add("Coke");
        theSet.add("Apple");
        theSet.add("Burger");
        theSet.add("Ice Cream");
        theSet.add("Burger");

        System.out.println("Here is my set: \n" + theSet);
    }

    public static void myMap()
    {
        Map theMap = new HashMap();

        theMap.put("1", "Coke");
        theMap.put("2", "Cake");
        theMap.put("3", "Juice");
        theMap.put("4", "Pizza");

        System.out.println("Here are my map elements:");
        System.out.println(theMap);
    }
}
