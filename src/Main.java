import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        importing class
        Animal animal = new Animal();
        System.out.println(animal.isDog("dog"));
        System.out.println(animal.isDog("Rohit"));

//        Conditions cond = new Conditions();
//        cond.printAnything();

        DateAndTime dt = new DateAndTime();
        dt.printDateAndTime();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
//        System.out.println(list);

//        making variables
        int a = 4;
        String str = "Rohit";

//        System.out.println("Uppercase of str = "+ str.toUpperCase());
//        System.out.println("0th element of str = "+ str.charAt(0));

//        getting returned value from a function
        String newStr= addExclamationAtEnd(str);
//        System.out.println("str after adding exclamation at end = "+ newStr);
    }

//    a function
    public static String addExclamationAtEnd(String str){
        return str + "!";
    }
}