import java.util.ArrayList;

public class Conditions {
    public void printAnything() {
        int a = 23;

//        if(a > 23) {
//            System.out.println("a is greater");
//        } else {
//            System.out.println("a is smaller or equal");
//        }

        String isGreater = a > 23 ? "Yes, greater" : "No, not greater";
//        System.out.println(isGreater);

//        LAMBDA EXPRESSION **
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.forEach((n) -> {
            System.out.println(n > 20);
        });
    }
}
