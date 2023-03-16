package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {

    static List<String> veggies = List.of(

            "carrot",
            "cabagge",
            "green beans"
    );

    public static void main(String[] args) {
//        anyMatchDemo();
//        allMatchDemo();
//        filterDemo();
//        mapDemo();
//        reduceDemo();
//        intReducedDemo();
//        collectDemo();
        multiOperationDemo();
    }

    public static void anyMatchDemo(){
        boolean anyMatches = veggies.stream().anyMatch(v -> v.contains(" "));
        System.out.println(anyMatches);
    }

    public static void allMatchDemo() {
        boolean allMatches = veggies.stream().allMatch(v-> v.contains("s"));
        System.out.println(allMatches);
    }

    public static void filterDemo(){
        veggies.stream()
                .filter(v->v.startsWith("c"))
                .forEach(System.out::println);
    }


    public static void mapDemo(){
        veggies.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    public static void reduceDemo(){
        veggies.stream().reduce("", (a, b) -> a + " | " + b);
    }

    //if you want to see the sum of the whole thing.
    public static void intReducedDemo(){
        List<Integer> numbers = List.of(2,4,3,5,6);
                var sum = numbers.stream().reduce(0, (a,b) -> a+b);
        System.out.println(sum);
    }

    public static void collectDemo(){
        List veggiesEndingInS = veggies.stream()
                .filter(v->v.endsWith("s"))
                .collect(Collectors.toList());

        veggiesEndingInS.forEach(System.out::println);
    }

    public static void multiOperationDemo(){
        veggies.stream()
                .sorted()
                .filter(v->v.startsWith("c"))
                .map(String::toUpperCase)
                .map(v-> v.transform(w->"yummy " + w))
                .forEach(System.out::println);
    }
}
