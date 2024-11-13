package CollectionsExamplePrograme;

import java.lang.reflect.Array;
import java.util.*;

import static java.util.Collection.*;

public class ArryListEx {

    public static void main(String[] args) {

  List<Number> list = new ArrayList<>() {
  };
  list.add(1);
        list.add(4);
        list.add(102);
        list.add(42);
        list.add(65);
//
//        for(Number nub:list){
//                System.out.println("numbers part:::"+nub);
//        }
        for(Number nub: list){

            System.out.println("numbers part1:::"+nub.hashCode());
            System.out.println("numbers part2:::"+nub.byteValue());
            System.out.println("numbers part3:::"+nub.toString());
            System.out.println("numbers part4:::"+nub.equals(4));
        }
//        listEx.add("Govardhan");
//        listEx.add("naik");
//        listEx.add("gs");
////        listEx.addAll(listEx);
//
//
//        Iterator<String> iterator =  listEx.iterator();
//
//        while (iterator.hasNext()){
//
//            System.out.println(iterator.hasNext());
//            System.out.println(iterator.equals(listEx));
//            System.out.println(listEx);

        }
    }

