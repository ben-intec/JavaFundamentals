package chapter20;

import java.util.*;

import tools.InputRequests;

public class ListApp {

    //Opdracht 1
    public static void main(String[] args) {
//        List<Integer> integerList = new ArrayList<>();
        List<Integer> integerList = new LinkedList<>();
        int size = 3;
        Scanner scanner = new Scanner(System.in);

        while(integerList.size() < size){
            int num = InputRequests.requestInt(scanner,"Please input a number");
            integerList.add(num);
        }

        integerList.forEach(System.out::println);

        System.out.println(integerList.stream().mapToInt(i->i).sum());
        System.out.println(integerList.stream().mapToInt(i->i).average().orElseThrow());

        List<String> stringList = new ArrayList<>();
        String item = InputRequests.requestString(scanner,"Please input a sentence:");
        stringList.addAll(List.of(item.split(" +")));
        int stupidCounter = 0;
        while (!item.trim().endsWith(".")){
            String message = stupidCounter > 5 ? "Ever heard of punctuation?" : "Please finish your sentence:";
            item = InputRequests.requestString(scanner,message);
            stringList.addAll(List.of(item.split(" +")));
            stupidCounter++;
        }

        for (int i = stringList.size(); i > 0;) {
            System.out.println(stringList.get(--i));
        }

        System.out.println(stringList.size());

        String[] stringArray = stringList.toArray(String[]::new);

        for (String s : stringArray) {
            System.out.println(s);
        }
    }



}
