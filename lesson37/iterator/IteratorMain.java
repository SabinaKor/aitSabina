package lesson37.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {
    public static void main(String[] args) {
        List<String> numbers=new ArrayList<>();
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");

        Iterator<String> iterator=numbers.iterator();
        while (iterator.hasNext()){
          String nextStr=  iterator.next();
            System.out.println(nextStr);
          if (nextStr.equals("Two"))  {
            iterator.remove();
          }

        }
    }
}
