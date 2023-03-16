package dataStructures;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
//        setDemo();
//        listDemo();
//        queueDemo();
        mapDemo();
    }

    public static void setDemo(){
        Set fruits = new HashSet();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");

        var i = fruits.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println(fruits);
        System.out.println("contains lemon? " + fruits.contains("lemon"));

        fruits.remove("lemon");
        System.out.println("contains lemon? " + fruits.contains("lemon"));

        Set moreFruit = Set.of("pear", "raisin", "cherry");
        //you cannot change it if you use set.of -- it becomes immutable




    }

    public static void listDemo(){
        List fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("orange");

        fruits.set(2, "grape");

//        System.out.println(fruits);
//        System.out.println("index 2: " + fruits.get(2));

        List moreFruit = List.of("cherry", "plum"); //immutable

        //single line
//        fruits.forEach(f->System.out.println(f));

        //multi-line
//        fruits.forEach(f->{
//            System.out.println(f)
//        });

    }

    public static void queueDemo() {
        //what type did you make this queue?
        //I instatiated it as a linked List
        Queue fruits = new LinkedList();


        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("orange");

        System.out.println("head of queue: " + fruits.peek());
        System.out.println(fruits);

    }

    public static void mapDemo(){
        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("bananan", 900);

        System.out.println(fruitCalories);

//        for(Map.Entry calorieInfo : fruitCalories.entrySet()){
//            System.out.println(calorieInfo.getKey() + ": " + calorieInfo.getValue());
//        }

        fruitCalories.forEach((k, v) -> System.out.println(k + " : " + v));

    }

}


