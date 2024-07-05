package _10List;

import java.util.ArrayList;

public class _1List_methods_related_to_java8 {
    public static void main(String args[]){
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("apple");
        a1.add("pineapple");
        a1.add("mango");
        a1.add("grapes");

        System.out.println(a1);
        a1.removeIf(x -> x.contains("m"));
        System.out.println(a1);

        a1.replaceAll(x -> x.toUpperCase());
        System.out.println(a1);
    }
}
